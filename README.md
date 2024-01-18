# Filtering Application—Back End API

## Introduction

Welcome to the back-end API of fILTERING APP! This API serves as the server-side implementation for a filtering application, allowing users to retrieve customer information with various filtering options. The application is built using the Spring Web MVC framework, MySQL database for data storage, and HikariCP for database connection pooling.

## Technologies Used

- **Spring Web MVC:** The application is developed using the Spring framework, specifically the Spring Web MVC module. It provides a powerful and flexible way to build robust web applications.

- **MySQL:** MySQL is employed as the relational database management system (RDBMS) for storing customer data. The application uses the `mysql-connector-j` dependency to interact with the MySQL database.

- **Hibernate Validator:** The Hibernate Validator is used for bean validation in the application. It ensures that the data sent to the API meets the specified constraints, enhancing data integrity.

- **HikariCP:** HikariCP is used for database connection pooling, optimizing the performance and efficiency of database connections.

- **Java Faker:** The `javafaker` library is utilized for generating realistic and random data for testing and development purposes.

- **JUnit Jupiter:** JUnit Jupiter is used for unit testing. It ensures that the application functions as expected, and any changes can be validated through automated tests.

- **Lombok:** Lombok is used to reduce boilerplate code and improve code conciseness by providing annotations for generating common code structures.

## Handling Customer Data

The API provides several endpoints to retrieve customer data based on different filtering options, such as sorting, pagination, and searching. The API responses are formatted in JSON, providing a standardized and easily consumable format.


## License

This project is licensed under the [MIT License](LICENSE.txt).
