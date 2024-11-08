# Hotel Booking Management System 🏨

This repository provides a fully functional **Hotel Booking Management System** built with **Spring Boot** and **MySQL**. It enables hotel operators to manage bookings, rooms, customers, payments, and more through a streamlined system with a backend API.

## Features

- **Hotel Listings**: Store and manage information on multiple hotels, including location, rating, amenities, and contact details.
- **Room Management**: Add, update, and remove room details with information on type, price, and availability status.
- **Customer Management**: Manage customer accounts and personal information with secure login and registration.
- **Booking System**: Facilitate room bookings, including check-in/check-out management and booking status tracking.
- **Payment Processing**: Record payments, supporting various payment methods.
- **Admin Panel**: Admins can view and manage hotels, rooms, bookings, and payments.
- **Review System**: Capture and store customer reviews and ratings for hotel services.

## Tech Stack

- **Backend**: Spring Boot (Java), RESTful API, Spring Data JPA, Spring Security
- **Database**: MySQL
- **Tools**: Maven (for dependency management)

## Getting Started

### Prerequisites

- **Java 11 or higher**: Required to run Spring Boot.
- **Maven**: For dependency management.
- **MySQL**: Database to store application data.

### Installation

#### 1. Clone the repository

```bash
git clone https://github.com/yourusername/hotel-booking-management-system.git
cd hotel-booking-management-system

2. Set up the Database
Create a MySQL database named hotel_management.
Open the application.properties file in src/main/resources and update the database configuration:
properties
Sao chép mã
spring.datasource.url=jdbc:mysql://localhost:3306/hotel_management
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
3. Execute the SQL Schema
To create the required tables, run the SQL schema file located in database/schema.sql:

sql
Sao chép mã
mysql -u your_mysql_username -p hotel_management < database/schema.sql
4. Build and Run the Application
Use Maven to build and start the application:

bash
Sao chép mã
mvn spring-boot:run
Once the application is running, access the API at http://localhost:8080.

Usage
API Endpoints
Here are some of the main API endpoints and their usage:

Hotels

GET /api/hotels: Retrieve a list of all hotels.
POST /api/hotels: Add a new hotel (Admin only).
Rooms

GET /api/rooms: Retrieve available rooms.
POST /api/rooms: Add a new room to a hotel (Admin only).
PUT /api/rooms/{id}: Update room details (Admin only).
Customers

POST /api/customers/register: Register a new customer.
POST /api/customers/login: Log in an existing customer.
Bookings

POST /api/bookings: Create a new booking.
GET /api/bookings/{id}: Retrieve booking details by ID.
PUT /api/bookings/{id}/cancel: Cancel a booking.
Payments

POST /api/payments: Process a payment for a booking.
GET /api/payments/history: View payment history (Admin only).
Admin Panel
The application includes restricted endpoints for administrative operations:

Manage Hotels: Add, edit, or delete hotels.
Manage Rooms: Control room details and availability.
View Bookings: See all bookings, including status and customer details.
Manage Payments: Track and manage payment records.

hotel-booking-management-system/
├── README.md                        # Project documentation
├── database/
│   └── schema.sql                   # SQL script to set up the database schema
└── src/
    ├── main/
    │   ├── java/com/example/hotel/
    │   │   ├── HotelBookingApplication.java  # Main application file
    │   │   ├── controller/                   # REST API controllers
    │   │   ├── model/                        # Data model classes (Entities)
    │   │   ├── repository/                   # Repository interfaces for data access
    │   │   └── service/                      # Business logic services
    └── resources/
        ├── application.properties            # Database and project configuration
        ├── templates/                        # Frontend templates (if needed)
        └── static/                           # Static assets like CSS and JavaScript

