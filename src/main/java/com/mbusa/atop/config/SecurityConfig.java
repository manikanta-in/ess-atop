package com.mbusa.atop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Value("${ldap.urls}")
	private String ldapUrls;

	@Value("${ldap.base.dn}")
	private String ldapBaseDn;

	@Value("${ldap.username}")
	private String ldapSecurityPrincipal;

	@Value("${ldap.password}")
	private String ldapPrincipalPassword;

	@Value("${ldap.user.dn.pattern}")
	private String ldapUserDnPattern;

	@Value("${ldap.enabled}")
	private String ldapEnabled;


	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		System.out.println("configure");

		if(Boolean.parseBoolean(ldapEnabled)) {

			/*auth
			.ldapAuthentication()
			.userDnPatterns(ldapUserDnPattern)
			.groupSearchBase("ou=groups")
			.contextSource()
			.url(ldapUrls + ldapBaseDn)
			.and()
			.passwordCompare()
			.passwordEncoder(passwordEncoder())
			.passwordAttribute("userPassword");*/

			/*
			 * auth .ldapAuthentication() .contextSource() .url(ldapUrls + ldapBaseDn)
			 * .managerDn(ldapSecurityPrincipal) .managerPassword(ldapPrincipalPassword)
			 * .and() .userDnPatterns(ldapUserDnPattern);
			 */
			auth.inMemoryAuthentication()
			.withUser("user").password("{noop}password").roles("USER")
			.and()
			.withUser("admin").password("{noop}password").roles("USER", "ADMIN");
	
		} else {
			auth.inMemoryAuthentication()
			.withUser("user").password("{noop}password").roles("USER")
			.and()
			.withUser("admin").password("{noop}password").roles("USER", "ADMIN");
		}
	}


	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
		//HTTP Basic authentication
		.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers("/api/callback/**").hasRole("USER")
		.and()
		.csrf().disable()
		.formLogin().disable();
	}


	private PasswordEncoder passwordEncoder() {
		final BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		return new PasswordEncoder() {
			@Override
			public String encode(CharSequence rawPassword) {
				return bcrypt.encode(rawPassword.toString());
			}
			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				return bcrypt.matches(rawPassword, encodedPassword);
			}
		};
	}

/*	@Bean
	public BCryptPasswordEncoder bcryptEncoder() {
		return new BCryptPasswordEncoder();
	}
*/

}
