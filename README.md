# Order Management API

## Overview
The Order Management API allows customers to place, track, and manage their orders efficiently using RESTful endpoints built with Spring Boot.


## Features
- Place a new order
- Retrieve all orders
- Retrieve order details by ID
- Update order status (Processing, Shipped, Delivered)
- Cancel an order before shipping

## Tech Stack
- **Java 17**
- **Spring Boot**
- **Maven**
- **H2 / MySQL**
- **Postman (for testing)**

## API Endpoints
| Method | Endpoint            | Description |
|--------|---------------------|-------------|
| POST   | /orders             | Create an order |
| GET    | /orders             | Get all orders |
| GET    | /orders/{id}        | Get order by ID |
| PUT    | /orders/{id}/status | Update order status |
| DELETE | /orders/{id}        | Cancel order |

## Setup & Run
```bash
git clone <repo-link>
cd order-management-api
mvn spring-boot:run
```

## Testing
Use **Postman** or **cURL** to test the API endpoints.

---

# Medical Record Management API

## Overview
The Medical Record Management API enables doctors and hospital staff to securely upload, retrieve, and manage patient medical records.

## Features
- Upload a medical record (CSV, PDF, Word files)
- List all uploaded medical records
- Download a medical record by ID
- Delete outdated or incorrect records

## Tech Stack
- **Java 17**
- **Spring Boot**
- **Maven**
- **H2 / MySQL**
- **Postman (for testing)**

## API Endpoints
| Method | Endpoint          | Description |
|--------|------------------|-------------|
| POST   | /records/upload  | Upload a medical record |
| GET    | /records         | List all records |
| GET    | /records/{id}    | Download a record |
| DELETE | /records/{id}    | Delete a record |

## Setup & Run
```bash
git clone <repo-link>
cd medical-record-api
mvn spring-boot:run
```

## Testing
Use **Postman** or **cURL** to test the API endpoints.

---

### Author
Developed by **Your Name** 🚀
