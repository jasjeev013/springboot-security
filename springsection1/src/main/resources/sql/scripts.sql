create table users(username varchar_ignorecase(50) not null primary key,password varchar_ignorecase(500) not null,enabled boolean not null);
create table authorities (username varchar_ignorecase(50) not null,authority varchar_ignorecase(50) not null,constraint fk_authorities_users foreign key(username) references users(username));
create unique index ix_auth_username on authorities (username,authority);

INSERT IGNORE INTO `users` VALUES('jasjeev','{bcrypt}$2a$10$3H.kZak5TxiNPmOf3wtwaO2.wb0Z8/QEf1Lg6HUAcfnBRO1Ylbbfa','1');
INSERT IGNORE INTO `authorities` VALUES('jasjeev','read');


INSERT IGNORE INTO `users` VALUES('jasjeev','{bcrypt}$2a$10$3H.kZak5TxiNPmOf3wtwaO2.wb0Z8/QEf1Lg6HUAcfnBRO1Ylbbfa','1');
INSERT IGNORE INTI `authorities` VALUES('jasjeev','read');