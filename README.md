# dockerized-to-do-api
### SpringBoot + MySQL + Docker + PostMan

Clone this repository into any of the platforms available.
Then just install Docker and Docker-Compose onto the system as requirements to run the application.
Go to the path dockerized-to-do-api/Documents/workspace-spring-tool-suite-4-4.6.2.RELEASE/todo-api-docker/
and run the following command in powershell/terminal/command-prompt

    -  docker-compose up -p --build
    
If it's run for the first time then it will automatically download all the softwares required and then start the services together then go to the PostMan and execute the api as 
    
    - GET : localhost:8080/todos
    
    - GET : localhost:8080/todos/id
    
    - POST : localhost:8080/todos - with requestbody(json)
    
    - PUT : localhost:8080/todos/id -with reuestbody(json)
    
    - DELETE : localhost:8080/todos/id
    
