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
git clone https://github.com/yourusername/hotel-booking-management-system.git
cd hotel-booking-management-system

#### 2. Set up the Database
Create a MySQL database named hotel_management.
Open the application.properties file in src/main/resources and update the database configuration:
properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hotel_management
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true```

#### Contributors

-  Loc Tran Tran
- Nguyen Tho Ngoc


#### License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
