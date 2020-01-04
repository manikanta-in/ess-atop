create table kite.bz_load (
id SERIAL PRIMARY KEY ,
four_kites_load_id bigint NOT NULL,
message_type varchar(75) NOT NULL,
load_number varchar(75) NOT NULL,
pro_number varchar(75),
success boolean,
stop_reference_id int, 
stop_type varchar(100),
scac varchar(75) ,
shipper varchar(75) ,
tags jsonb,
consignment_encrypted_token varchar(205),
encrypted_access_token varchar(205) ,
reference_numbers jsonb,
timestamp timestamp with time zone,
timezone_short_name varchar(75),
timezone_offset int,
city varchar(205),
state varchar(205),
contry varchar(205),
latitude varchar(205),
longitude varchar(205),
status_code varchar(205),
odometer_reading bigint,
errors jsonb
);


	
