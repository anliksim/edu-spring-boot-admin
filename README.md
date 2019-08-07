# Spring Boot Admin

Education series - spring boot admin with example clients.

Admin docs: http://codecentric.github.io/spring-boot-admin/2.1.6/


## Usage

Run `edu.boot.*App` in your IDE.

### Docker

Create docker image

    sudo ./gradlew build docker
    
Find image in docker

    sudo docker images
    
Run the image and expose the port of the containerized application to the host

    sudo docker run -p 8080:8080 edu/edu-spring-boot-web
    
