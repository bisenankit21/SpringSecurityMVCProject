--------------Project Overview-------------------  
 SpringSecurityMVCProject is a web application that integrates Spring Security with Spring MVC. It provides robust security features for your application, including authentication mechanisms, authorization controls,   
 and core security concepts1.  
 
-------------------------------------------------------
#JDBC properties to connect with the Database
#
spring.datasource.url=jdbc:mysql://localhost:3306/employee_directory
spring.datasource.username=springstudent
spring.datasource.password=springstudent

-------------------------------------------------------
----------Learning from this project-------------  
1. Spring Security Password Storage:-
    in Spring Security, password are stored using a specific formate like    
          {id}encodedPassword  
          id        Description  
          noop      Plain text password  
          bcrypt    Bcrypt password hashing  
2. here noop means No Operation
3. Learnt about Context Path:-
4. xmlns= XML namespace (the XML namespace does not connect to the internet... Just a unique identifier that is configured in the thymeleaf JAR File )
5. ${param.error} = This error Param is passed over by spring security automatically in the case of failed login.
6. Learnt about security authentication like accessing and Displaying user and his role.
7. Restrict access based on the user roles.
8. created custom access denied page for unauthorised access. (if someone don't have access for some link and still want to access it)
9. Displayed content based on the user Roles.
10. Learnt about the JDBC Authentication.
11. Spring security will check database each time during login so no need to restart app while chnagin g the password 
12. bcrypt:- performs one way encrypted hashing, adds a random salt to the password for additional proetction, include support to defeat brute force attacks.
13. Configured spring security to use our custom database tables, custom table name and column names.
14. 
