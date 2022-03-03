# spring-boot-graphql-learning



This Project's Goal,Learning GraphQL in a Spring Boot Application


## Technologies

- Spring Boot
- Spring Boot Test
- Spring Boot Web
- Spring Boot JPA
- H2 Database
- Lombok
- GraphQL
- Graphiql

---

## Installation

- First,define GraphQL dependencies 

```java
        <dependency>
            <groupId>com.graphql-java-kickstart</groupId>
            <artifactId>graphql-spring-boot-starter</artifactId>
            <version>12.0.0</version>
        </dependency>
        <dependency>
            <groupId>com.graphql-java-kickstart</groupId>
            <artifactId>graphql-java-tools</artifactId>
            <version>12.0.0</version>
        </dependency>

```

- Second,create a .graphqls file and configure your project settings


![image](https://user-images.githubusercontent.com/80245013/156524384-d131c547-b085-4a87-9a3e-971ca89f2d76.png)



- Third,Set Database settings in application.properties(or .yml file)


![image](https://user-images.githubusercontent.com/80245013/156524449-8f471621-98a8-4de2-960c-6b35fac261d9.png)



- Fourth,Define Graphiql dependency in pom.xml(Optional)

```java
        <dependency>
            <groupId>com.graphql-java</groupId>
            <artifactId>graphiql-spring-boot-starter</artifactId>
            <version>5.0.2</version>
        </dependency>

```

  And Connect "http://localhost:your Server Port//graphiql

---
## Using
 
 - Save A person 
 
 ![image](https://user-images.githubusercontent.com/80245013/156524981-f7ecdf64-47be-4f89-848e-dffa356f92bc.png)
 
 
 ![image](https://user-images.githubusercontent.com/80245013/156525489-490dc280-2eaa-43ef-b46d-279597fd4d54.png)

 
 - List All Persons

 ![image](https://user-images.githubusercontent.com/80245013/156525139-c7286be2-a6b9-44f4-b824-d692ba6d44b4.png)

 - Get A Person

 ![image](https://user-images.githubusercontent.com/80245013/156525286-9da1daeb-5630-48bf-a201-4cf2be9423e0.png)
 
 
 - Delete A person

  ![image](https://user-images.githubusercontent.com/80245013/156525703-0b762c7c-cdc4-49dd-8a65-e3bd5fe6ff22.png)
  

  ![image](https://user-images.githubusercontent.com/80245013/156525782-56295e8a-8af6-4ad9-9df5-5005b6e02fb0.png)


- Update A person

  - Exist Values
   ![image](https://user-images.githubusercontent.com/80245013/156525994-0547d338-3266-485e-8a9a-3454bc023c9e.png)
   
   - New Values
   
   ![image](https://user-images.githubusercontent.com/80245013/156526129-5e5fdb80-b3d9-41b3-a2a3-983087c8e25b.png)


  ![image](https://user-images.githubusercontent.com/80245013/156526190-2aabd57b-5eba-49b4-8f2b-e5a3c8475393.png)




[Muharrem Koç](https://github.com/muharremkoc)
