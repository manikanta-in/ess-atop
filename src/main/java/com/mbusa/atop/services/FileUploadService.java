package com.mbusa.atop.services;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FileUploadService {

	
	private static Logger log = LogManager.getLogger(FileUploadService.class);

	@Autowired
	private Environment env;

	/**
	 * 
	 * @param file
	 */
	public String fileupload(MultipartFile file) {
		
		long time = System.currentTimeMillis();
		String keyStorePath =env.getProperty("app.config.ssl.keyStore.path");
		File f=new File(keyStorePath+"/"+time);
		
		if(!f.isDirectory()) {
			f.mkdirs();
			log.info("Directory created");
		}
		String fileName = new File(file.getOriginalFilename()).getName();
		String uploadFile=f.getAbsolutePath()+"/"+fileName;
		log.info("uploaded file path created location"+uploadFile);
		BufferedOutputStream bout = null;
		try {
			byte barr[]=file.getBytes();  
			bout=new BufferedOutputStream(  
					new FileOutputStream(uploadFile));
			bout.write(barr);  
			bout.flush();  
			bout.close();  
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());

		}  
		finally {
			try {
				if(bout!=null) {
					bout.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		log.info("uploadFile sucessfully");
		log.info("path is "+uploadFile);
		return keyStorePath+time+"/"+fileName; 
	}

}

