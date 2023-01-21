# CRUD application

A sample RESTfull API CRUD application project

### Technologies:
- Java 11
- Maven
- Spring Boot 2.7.7
- Spring Data
- Spring MVC

#### End Points

- GET 
  url: http://localhost:8080/api/v1/person/findAll
  
- POST 
  url: http://localhost:8080/api/v1/person/save
  body: 
  {
    "name": "Test name"
  }
  
- PUT 
  url: http://localhost:8080/api/v1/person/update
  body ex.:
  {
    "id": 1,
    "name": "Test name
  }
  
- DELETE 
  url: http://localhost:8080/api/v1/person/delete
  body ex.:
  {
    "id": 1,
    "name": "Test name"
  }
