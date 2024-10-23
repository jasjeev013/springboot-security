## --------------------- Section 1 ------------------------
1. Building Spring Project
2. Implementing Normal Spring Security 
3. Added customer user & password in application.properties
4. Learnt Implementation of SecurityProperties.class (By default Security Implementing class)
5. Understood Operations team security and development phase security (Video 7)
6. Spring Security Internal Flow With seeing all source codes

## ----------------- Section 2 -----------------------

1. Created All Dummy Controllers
2. Creating Custom Security FilterChain with RequestMatchers,permitAll,denyAll,authenticated
3. Learnt About FormLogin and HttpBasic Login

## -------------------- Section 3 ---------------------

1. Understood InMemoryDatabase, used to store credentials directly in UserDetailsService
2. Learnt About Password Encoders - Used Bcrypt password encoder
3. Learnt Compromised Password Checker Which Checks for that is the password Strong or Not
4. Understood whole UserDetails which is Under AuthenticationProvider
5. Different in Authentication Interface and UserDetails Interface

## --------------------- Section 4 ---------------------

1. Setup a MYSQL container for eazybank database on docker using command "docker run -p 3306:3306 --name springsecurity -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=eazybank -d mysql"
2. Using SQL Electron for the connection to DB and checking the records and tables
3. Made tables and their using the commands in scripts.sql, tables were taken from users.dll 
4. Changed InMemoryUserDetailsMangers to JDBCUserDetailsManager and now using it for authentication,which has specific user and role table implementation
5. For Implementing Authentication using our own tables we create CustomUserDetailsService by implementing UserDetailsService & Removing JDBCUserDetailsManager
6. created a Register Router which registers the customer & Disables CSRF as it does not allow Creating deleting Data in table

## ----------------------- Section 5 -----------------------

1. Understanding Password Encoding using Encoding, Encryption & Hashing
2. Demo,Drawbacks & Advantages of these three
3. Brute Force , Rainbow & Dictionary Attack
4. Overcoming the above attacks by various methods
5. Understanding PasswordEncoder.class & BCryptPasswordEncoder

## ------------------- Section 6 ----------------

1. Understanding Authentication Provider & how AuthenticationManager chooses AuthenticationProvider
2. Created own Custom Authentication Provider which works on UsernamePasswordAuthenticationToken
3. Understanding Business Standards for Environments and Profiles in Detail

## -------------------- Section 7 -------------------------

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

## ------------------- Section 8 -------------------------

1. Establishing Frontend & Adding Implementation to Models & Routes with Database Queries
2. Understood & Implemented CORS Policy
3. Added CSRF Policy

## ------------------ Section 9 --------------------

1. Difference between Authentication & Authorization
2. Implementing Authorization in SecurityConfig
3. Difference between Authority & Roles
4. Implementing Authorization Events

## -------------------- Section 10 -----------------------

1. Understanding Custom Filters & OncePerFilterRequest
2. Adding AddFilterAfter,AddFilterBedore & AddFilterAt methods in project

## ----------------- Section 11 ----------------------------

1. Telling about JWT Tokens & Opaque Tokens
2. Understood about SSO & Advantages of Tokens
3. Understanding in Detail of JWTs
4. Applying Dependencies & Implementing JWT. Making JWTValidationFilter & JWTGenerationFilter
5. Making Specific /apiLogin for Logging in using JWT

## -----------------Section 12 ---------------------------

1. Understanding of Method level Security
2. PreAuthorize & PostAuthorize
3. PreFilter & PostFilter

## --------------------Section 13 -------------------------

1. Understand the Workflow of OAUTH2 
2. Different Grant types Flows
3. Understanding OAUTH 2 FLow of Authorization Code Grant Type 
4. Understanding OAUTH 2 Flow of Implicit Grant Flow ( Not Recommended as it's deprecated )
5. Understanding OAUTH 2 Flow of Proof Key For Code Exchange (PKCE)
6. Understanding OAUTH 2 Flow of Password Grant/ Resource Owner Credentials Grant type 
7. Understanding OAUTH 2 Flow of Client Credentials Grant Type 
8. Understanding OAUTH 2 Flow of Refresh Token Grant Type
9. Open ID Connect

## -------------------- Section 14 --------------------------

1. Demo of OAUTH2 using Social logins GitHub, Facebook
2. Creating New Project Adding New FilterChain which takes basic form login & OAUTH 2 Client also
3. Making Client ID and Client Secret from GitHub & developers.facebook.com
4. Making Bean of Specific Social Login
5. Changing Bean Structure to the Application.properties Structure

## -------------------- Section 15 --------------------
(This section is just seen not implemented in this project)
1. Created KeyCloak Container in Docker
2. Made and Learn about the Clients in KeyCloak
3. Deleting Some Beans like AuthenticationManager, Password Encoder, Filters, JWT & etc
4. Making KeyClockRoleConverter.java & Setting up resource server
5. Testing through Client credential Grant type flow & Using Opaque Tokens
6. Testing through PKCE Authorization Grant Type Flow
7. Configuring Multi-Factor Authentication using KeyCloak
8. Social Login Integration

## -------------------- Section 16 ----------------------

1. Creating New Project with specific dependencies
2. Established the Auth Server
3. Connecting THe Resource Server with Auth Server
4. Using different Grant Type FLows like PCKE, Client, Authorization, Refresh Token
5. Finished