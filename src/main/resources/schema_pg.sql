create table kite.bz_load (
load_index SERIAL PRIMARY KEY ,
message_type varchar(75) NOT NULL,
success boolean,
four_kites_load_id bigint,
load_number varchar(75) NOT NULL,
pro_number varchar(75) NOT NULL,
scac varchar(75) ,
shipper varchar(75) ,
tags text,
consignment_encrypted_token varchar(205) NOT NULL,
encrypted_access_token varchar(205) NOT NULL,
reference_numbers text,
timestamp timestamp with time zone,
timezone_short_name varchar(75) NOT NULL,
timezone_offset int,
errors text
);

