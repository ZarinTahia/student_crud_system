# Student_Managment_System_Spring_Boot #
------------------------------------------------------------------------------------------------------------------------------------------------------
This repository uses JAVA, Spring Boot with MySQL, and Thymeleaf for the rendering.

- Run mvn verify
- To use MySQL need to update the file:
`` src/main/resources/applications.properties``</br>
and config MySQL as per the requirments in the file</br>
`` spring.datasource.url=jdbc:mysql://localhost:*port number*/*database Name* `` </br>
`` spring.datasource.username=root ``</br>
`` spring.datasource.password= *Password* ``</br>
The MySQL dialect for hibernate </br>
`` spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect``</br>
Property to create automatic table to the database</br>
`` spring.jpa.hibernate.ddl-auto=update ``</br>
Enabling hybernate logs</br>
`` logging.level.org.hibernate.SQL=DEBUG ``</br>
`` logging.level.org.hibernate.type=TRACE``</br>

- Rest endpoints
    - POST: [http://localhost:8080/showNewStudentForm](http://localhost:8080/showNewStudentForm): Add a new Student</br>
           Sample request body data {"studentId":1,"studentFirstName":"Zarin","studentLastName":"Hossain","email":"zarinhossain@gmail.com"}
    - DELETE: [http://localhost:8080/deleteStudent/{id}](http://localhost:8080/deleteStudent/{id}): Delete Student by id
    - PUT: [http://localhost:8080/showFormForUpdate/{id}](http://localhost:8080/showFormForUpdate/{id}): Update Student by id</br>
           Sample request body data {"studentFirstName":"Tahia","studentLastName":"Hossain","email":"zarinhossain@gmail.com"}
## The Code ##
----------------------------------------------------------------------------------------------------------------------------------------------------
In this repository to use MySQL, Spring Boot Data JPA and Thymelef, it is necessary to add some dependencies.
## Dependencies (pom.xml file) ##

```java
spring-boot-starter-thymeleaf 
spring-boot-starter-data-jpa 
mysql-connector-java 
```

## The ** Student **  entity class (student_crud_system/src/main/java/com/zadmin/crudProject/model/Student) ##
### The class is annotated to define it as an JPA entity and table annotation is also used to provide table details  </br>
```java
@Entity       
@Table(name = "students")       
public class Student { 
```

### Then the key 
```java
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
```

### And each attributes 
```java
@Column(name = "firstName")
private String firstName;
```    