# 📚 RESTful Bookstore API

A full-stack backend API for managing books and authors with features like CRUD operations, pagination, filtering, sorting, and API documentation using Swagger.

---

## 📌 Project Objective

Build a simple and scalable backend service to manage books and authors using:

- Java
- Spring Boot
- JPA (Hibernate)
- H2 In-Memory Database
- Swagger (API Documentation)
- Postman (Testing)

---

## ✅ Features

- 🔁 Full CRUD for **Books** and **Authors**
- 🔍 Search books by title
- 📄 Filter books by author
- 📑 Pagination and sorting for books
- 🔐 REST API architecture
- 📘 Swagger UI for API documentation and testing

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/<your-username>/bookstore-api.git
cd bookstore-api

2. Build and Run

Make sure you have Java 17+ and Maven installed.

./mvnw spring-boot:run

🌐 API Endpoints
Author Controller
Method	Endpoint	Description
POST	/api/authors	Create an author
GET	/api/authors	List all authors
GET	/api/authors/{id}	Get author by ID
DELETE	/api/authors/{id}	Delete author by ID
Book Controller
Method	Endpoint	Description
POST	/books	Add a book
GET	/books	Get all books
GET	/books/{id}	Get book by ID
DELETE	/books/{id}	Delete book by ID
GET	/books/search	Search books by title
GET	/books/filter	Filter books by author ID
GET	/books/page	Pagination and sorting

Example:
/books/page?page=0&size=5&sort=title,asc
📘 Swagger UI

After running the app, open:

http://localhost:8080/swagger-ui/index.html

🛢️ H2 Database Console

To check the database manually, visit:

http://localhost:8080/h2-console

    JDBC URL: jdbc:h2:mem:testdb

    Username: sa

    Password: (leave blank)

📂 Project Structure

src
 └── main
     └── java
         └── com.bookstore.bookstore_api
             ├── controller
             ├── model
             ├── repository
             ├── service
             └── BookstoreApiApplication.java

🧪 Testing with Postman

    Add authors first using POST /api/authors

    Then add books using POST /books with the author ID

    Try out search, filter, pagination features

    Use Postman or Swagger UI to test
