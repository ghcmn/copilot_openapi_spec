-- create mysql table settlements with columns settlement_id number, settlement_details json, status

CREATE TABLE IF NOT EXISTS settlements
( settlement_id      VARCHAR(255) not null
, settlement_details VARCHAR(2000)  not null
, status             VARCHAR(20)
, net_settlement_id  VARCHAR(255)
, payment_id         VARCHAR(255)
, cancellation_id    VARCHAR(255)
, created_date       DATE
, updated_date       DATE
, PRIMARY KEY (settlement_id)
)
ENGINE=InnoDB DEFAULT CHARSET= UTF8MB4;


select * from settlements order by created_date desc;

