[//]: # (--------------------- Section 1 ------------------------)
1. Building Spring Project
2. Implementing Normal Spring Security 
3. Added customer user & password in application.properties
4. Learnt Implementation of SecurityProperties.class (By default Security Implementing class)
5. Understood Operations team security and development phase security (Video 7)
6. Spring Security Internal Flow With seeing all source codes

[//]: # (----------------- Section 2 -----------------------)

1. Created All Dummy Controllers
2. Creating Custom Security FilterChain with RequestMatchers,permitAll,denyAll,authenticated
3. Learnt About FormLogin and HttpBasic Login

[//]: # (-------------------- Section 3 ---------------------)

1. Understood InMemoryDatabase, used to store credentials directly in UserDetailsService
2. Learnt About Password Encoders - Used Bcrypt password encoder
3. Learnt Compromised Password Checker Which Checks for that is the password Strong or Not
4. Understood whole UserDetails which is Under AuthenticationProvider
5. Different in Authentication Interface and UserDetails Interface

[//]: # (--------------------- Section 4 ---------------------)

1. Setup a MYSQL container for eazybank database on docker using command "docker run -p 3306:3306 --name springsecurity -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=eazybank -d mysql"
2. Using SQL Electron for the connection to DB and checking the records and tables
3. Made tables and their using the commands in scripts.sql, tables were taken from users.dll 