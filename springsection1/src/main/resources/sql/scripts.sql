create table users(username varchar_ignorecase(50) not null primary key,password varchar_ignorecase(500) not null,enabled boolean not null);
create table authorities (username varchar_ignorecase(50) not null,authority varchar_ignorecase(50) not null,constraint fk_authorities_users foreign key(username) references users(username));
create unique index ix_auth_username on authorities (username,authority);

INSERT IGNORE INTO `users` VALUES('jasjeev','{bcrypt}$2a$10$3H.kZak5TxiNPmOf3wtwaO2.wb0Z8/QEf1Lg6HUAcfnBRO1Ylbbfa','1');  -- Jasjeev@123
INSERT IGNORE INTO `authorities` VALUES('jasjeev','read');


INSERT IGNORE INTO `users` VALUES('rohan','{noop}Rohan@549','1');
INSERT IGNORE INTO `authorities` VALUES('rohan','ADMIN');

CREATE TABLE `customer` (
                            `id` int NOT NULL AUTO_INCREMENT,
                            `email` varchar(45) NOT NULL,
                            `pwd` varchar(200) NOT NULL,
                            `role` varchar(45) NOT NULL,
                            PRIMARY KEY(`id`)
);

INSERT INTO `customer` (`email`,`pwd`,`role`) VALUES('rahul@gmail.com','{noop}Rahul@549','read');
INSERT INTO `customer` (`email`,`pwd`,`role`)  VALUES('rakesh@gmail.com','{bcrypt}$2a$10$eiTIYHN/c8mi.glV297R1euxcBw1taNMXZXTBIAuPcWhgBTuKwPyu','admin'); -- Rakesh@5484

