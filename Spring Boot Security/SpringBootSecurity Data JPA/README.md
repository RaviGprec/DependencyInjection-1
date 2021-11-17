This is a simple Spring Boot Security application which provides security to REST API end points based on user specific roles.
1. Using Spring Boot Data JPA, it will connect to MongoDB for authentication and authorization operations.
2. There are 3 rest end points:
    1. http://localhost:8080/user
       :This will be accessible for users whose role is - "**ROLE_USER**" only
    3. http://localhost:8080/admin
       : This will be accessiable for the users whose role is either "**ROLE_USER**" or "**ROLE_ADMIN**"
    5. http://localhost:8080/home
        :This can be accessiable to anyone without any authentication.
