-- create mysql table settlements with columns settlement_id number, settlement_details json, status

CREATE TABLE IF NOT EXISTS settlements
( settlement_id VARCHAR(255) not null
, settlement_details json  not null
, status VARCHAR(20)
, created_date DATE
, updated_date DATE
) ENGINE=InnoDB DEFAULT CHARSET= UTF8;




