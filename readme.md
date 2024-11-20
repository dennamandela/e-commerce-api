# E-Commerce API  

This project is an **E-Commerce API** built using **Spring Boot**, designed to manage products, shopping carts, and user transactions. The API supports JWT-based authentication, CRUD operations, integration with external services (e.g., payment gateways), and complex data models.  

The goal of this project is to develop a logic-heavy application while exploring advanced features such as user authentication and external service integration.  

## Features  

### User Features  

- **Authentication**  
  - JWT-based user authentication and authorization.  
  - User registration and login.  

- **Shopping Cart**  
  - Add products to the cart.  
  - Remove products from the cart.  
  - View cart details.  

- **Product Browsing**  
  - Search and filter products by categories or price range.  
  - View product details.  

- **Checkout and Payment**  
  - Place orders and process payments via an integrated payment gateway (e.g., Stripe).  
  - View order history and order details.  

### Admin Features  

- **Product Management**  
  - Add, update, delete, and manage products.  
  - Set product prices and manage inventory.  

- **Order Management**  
  - View and manage all user orders.  

## Technologies Used  

- **Backend**: Spring Boot (Spring Security, Spring Data JPA)  
- **Database**: MySQL/PostgreSQL  
- **Authentication**: JWT  
- **Payment Gateway Integration**: Xendit API (or similar services)  
- **API Documentation**: Swagger/OpenAPI  
- **Build Tool**: Maven/Gradle  

## Roadmap  

1. **Authentication**  
   - Implement JWT for secure user authentication.  

2. **CRUD Operations**  
   - Enable basic CRUD functionality for products and user carts.  

3. **Product Search and Browsing**  
   - Implement filtering and search capabilities.  

4. **Shopping Cart**  
   - Allow users to add/remove products and view cart details.  

5. **Checkout and Payment**  
   - Integrate with a payment gateway to process orders.  

6. **Admin Panel**  
   - Build an admin-specific interface for managing the e-commerce platform.  

## Getting Started  

### Prerequisites  

- Java 17 or later  
- Maven or Gradle  
- MySQL/PostgreSQL  
- Stripe (or similar payment gateway) account  

### Installation  

1. Clone the repository:  
   ```bash  
   git clone https://github.com/your-username/e-commerce-api.git  
   cd e-commerce-api  

2. Set up the database:
   - Create a new database (e.g., `ecommerce_db`).
   - Update database configurations in `application.properties`.

3. Install dependencies:
   mvn clean install  

4. Start the application:
   mvn spring-boot:run  

5. Access API endpoints:
   - Base URL: `http://localhost:8080`
   - Swagger documentation: `http://localhost:8080/swagger-ui.html`

### Future Enhancements

- Add product reviews and ratings.
- Introduce user-specific recommendations.
- Optimize performance with caching.

### Contributing

Contributions are welcome! Fork the repository, make your changes, and submit a pull request.

### License

This project is licensed under the MIT License. See the LICENSE file for more details.

