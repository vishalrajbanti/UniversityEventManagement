

# University Event Management

## Table of content 
   - [Frameworks and Language Used](#frameworks-and-language-used)
- [Data Flow](#data-flow)
  - [1. Controller](#1-controller)
  - [2. Services](#2-Services)
  - [2. Repository](#2-Repository)
- [API Reference](#API-Reference)
- [Data Structures Used ](#Data-Structures-Used)
- [Data Models](#Data-Models)
  - [1. Student Model](#1-Student-Model)
  - [2. Event Model](#2-Event-Model)
  - [3. Validation](#3-Validation)
 - [Key Features](#Key-Features)
   - [1. Key Features](#2-Key-Features)
   - [2. Customizable and Extendable](#3-Customizable-and-Extendable)
- [Project Summary](#project-summary)
- [Acknowledgments](#Acknowledgments)
- [Support](#Support)



## Frameworks and Language Used
- Spring Boot
- Java
- Maven

## Data Flow

### 1. Controller
- Controller handles incoming HTTP requests.
- It defines endpoints for adding, retrieving, updating, and deleting Student information.


### 2. Services
- The services in the University Event Management Application are responsible for encapsulating the business logic and operations related to restaurant management. They serve as an intermediary layer between the controllers (which handle HTTP requests) and the repositories (which interact with the database)

### 3.repository
- The repository in the University Event Management Application project is a crucial component that facilitates the interaction between the application and the database.

## API Reference

#### Post Students

```http
  POST Students
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
|`Request body`  | `Student object` | **Required**. database(H2
) to add. |

#### Get all Students

```http
  GET Students
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| ``      | `` | **Required**. database to  fetch the size |

#### GET  a Student by location
```http
  Get Student/id/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `pathVariable`      | `id` | **Required**. database to  fetch |


#### Update Student 

```http
  Put student/department/age/{age}/id/{id}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
|`pathVariable`  | `id` | **Required**. database(H2
) to add. |

#### Delete Student

```http
  Delete student/id/{id}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
|`pathVariable`  | `id` | **Required**. database(H2
) to delete. |

#### Post events

```http
  POST event
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
|`Request body`  | `Event object` | **Required**. database(H2
) to add. |

#### Get all Event by date

```http
  GET events/date
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Requestparam`      | `date` | **Required**. database to  fetch the data |



#### Update Event 

```http
  Put event/id/{id}/name
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
|`pathVariable`  | `id` | **Required**. database(H2
) to update. |

#### Delete Event

```http
  Delete event/id/{id}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
|`pathVariable`  | `id` | **Required**. database(H2
) to delete. |


## Data Models
### Student Model
- studentId (Long)
- firstName (String)
- lastName (String)
- age (Integer, between 18 and 25)
- department (Enum: ME, ECE, Civil, CSE)

### Event Model
- eventId (Long)
- eventName (String)
- locationOfEvent (String)
- date (Date)
- startTime (Time)
- endTime (Time)
### Validation
- Age: Age must be between 18 and 25 for a student.
- First Name: The first letter of the first name should be capitalized.
- Department: The department attribute should be of type Enum, supporting department names like ME, ECE, Civil, CSE.



## Key Features

The University Event Management is designed to provide efficient University Event Management  capabilities. Here are the key features of this application:


### 1. Scalable and Maintainable Architecture

- Utilizes the Spring Boot framework for building robust and scalable applications.

- Follows a well-structured layered architecture, separating concerns between controllers, services, and repositories, ensuring maintainability and testability.



### 2. Customizable and Extendable

- Easily extensible to add more features or attributes to the Student profile.


## Project Summary
This project is an University Event Management built using Spring Boot. It provides a set of RESTful API endpoints for managing Student information, including adding, retrieving, updating, and deleting Student records. The project follows a layered architecture with controllers handling HTTP requests, services containing business logic, and a repository for database operations.



## Acknowledgments

We would like to express our gratitude to the following individuals and projects for their contributions and support to the University Event Management :

- **[Vishal Raj]**: Lead developer and project coordinator.
- **[Mainak Ghosh]**: Contributor to the project, helping with [SpringBoot to complete this project].
- **[maven]**: We utilized [maven] for [dependencies] in our project.
- **Stack Overflow Community**: For their invaluable assistance in resolving technical challenges.
- **Spring Framework**: For providing a robust and efficient platform for building our application.


We appreciate the  effort and support that made this project possible.



## Support

For support, email vishalrajbanti@gmail.com.

## thank you.