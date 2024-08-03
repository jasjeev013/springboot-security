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
4. Changed InMemoryUserDetailsMangers to JDBCUserDetailsManager and now using it for authentication,which has specific user and role table implementation
5. For Implementing Authentication using our own tables we create CustomUserDetailsService by implementing UserDetailsService & Removing JDBCUserDetailsManager
6. created a Register Router which registers the customer & Disables CSRF as it does not allow Creating deleting Data in table

[//]: # (----------------------- Section 5 -----------------------)

1. Understanding Password Encoding using Encoding, Encryption & Hashing
2. Demo,Drawbacks & Advantages of these three
3. Brute Force , Rainbow & Dictionary Attack
4. Overcoming the above attacks by various methods
5. Understanding PasswordEncoder.class & BCryptPasswordEncoder

[//]: # (------------------- Section 6 ----------------)

1. Understanding Authentication Provider & how AuthenticationManager chooses AuthenticationProvider
2. Created own Custom Authentication Provider which works on UsernamePasswordAuthenticationToken
3. Understanding Business Standards for Environments and Profiles in Detail

[//]: # (-------------------- Section 7 -------------------------)

1. Accepting only HTTP or HTTPS request on the basis of prod or default profile
2. Understanding Exception Handling for Access Denied and Forbidden Error
3. Created Custom AuthenticationEntryPoint (Not necessary)
4. Setting Custom AccessDeniedHandler (Not necessary) 
5. Setting Custom Set Timeout & Timeout Message for logged In User 
6. Setting Custom Concurrent Sessions Controls
7. Understanding Session Fixations, Session Hacking Attacks
8. Adding Authentication EventListeners
9. Creating Custom FormLogin & Logout Configurations with thymeleaf
10. Understanding SecurityContext & SecurityContextHolder

[//]: # (------------------- Section 8 -------------------------)

1. Establishing Frontend & Adding Implementation to Models & Routes with Database Queries
2. Understood & Implemented CORS Policy
3. Added CSRF Policy