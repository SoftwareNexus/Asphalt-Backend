## src/main/resources/application.properties
DEFAULT RDS DB CONNECTION SETTING  
---

server.port=8080

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://cement.cxschgnz8fad.ap-northeast-2.rds.amazonaws.com:3306/cement
spring.datasource.username=cement
spring.datasource.password=Skdlxmfhem3323!

spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.open-in-view: false
spring.jpa.show-sql: true
spring.jpa.hibernate.ddl-auto=update


## Spring Initializr

---
Project: Gradle - Groovy
Language: Java
Spring Boot: 2.7.11
Packaging: Jar
Java: 11

Dependencies:
    - Lombok
    - Spring Web
    - Spring Data JPA
    - MySQL Driver
