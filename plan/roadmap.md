# Backend Java Learning Roadmap - Login/Register System

## 🎯 Project Goal
Membuat sistem authentication (login/register) menggunakan Spring Boot, JWT, dan PostgreSQL

## 📋 Learning Checklist

### Phase 1: Environment Setup
- [ ] Install JDK 17+ (atau 21)
- [ ] Install PostgreSQL dan pgAdmin
- [ ] Install IDE (IntelliJ IDEA atau VS Code)
- [ ] Install Postman untuk testing API
- [ ] Setup Git repository

### Phase 2: Project Initialization
- [ ] Create Spring Boot project menggunakan Spring Initializr
- [ ] Add dependencies yang diperlukan:
  - [ ] spring-boot-starter-web
  - [ ] spring-boot-starter-data-jpa
  - [ ] spring-boot-starter-security
  - [ ] spring-boot-starter-validation
  - [ ] postgresql driver
  - [ ] jjwt-api, jjwt-impl, jjwt-jackson
- [ ] Setup project structure

### Phase 3: Database Configuration
- [ ] Create database di PostgreSQL
- [ ] Configure application.properties untuk database connection
- [ ] Test database connection

### Phase 4: Core Entities & Models
- [ ] Create User entity dengan annotations JPA
  - [ ] id, username, email, password, roles
  - [ ] timestamps (createdAt, updatedAt)
- [ ] Create Role entity (optional untuk multi-role system)
- [ ] Create UserRepository interface
- [ ] Test repository dengan unit tests

### Phase 5: Security Configuration
- [ ] Setup Spring Security configuration
- [ ] Configure password encoder (BCrypt)
- [ ] Create JWT utility class
  - [ ] generateToken()
  - [ ] validateToken()
  - [ ] extractUsername()
- [ ] Create JWT authentication filter
- [ ] Configure security filter chain

### Phase 6: Authentication Services
- [ ] Create UserService interface dan implementation
- [ ] Create AuthService untuk login/register logic
- [ ] Implement password hashing
- [ ] Implement user registration logic
- [ ] Implement user login logic dengan JWT generation

### Phase 7: Controllers & APIs
- [ ] Create AuthController
  - [ ] POST /api/auth/register
  - [ ] POST /api/auth/login
- [ ] Create UserController (protected endpoints)
  - [ ] GET /api/user/profile
  - [ ] PUT /api/user/profile
- [ ] Add proper request/response DTOs
- [ ] Add input validation

### Phase 8: Error Handling & Validation
- [ ] Create global exception handler
- [ ] Add custom exceptions (UserAlreadyExistsException, etc.)
- [ ] Add validation annotations pada DTOs
- [ ] Create proper error response format

### Phase 9: Testing
- [ ] Unit tests untuk services
- [ ] Integration tests untuk controllers
- [ ] Test dengan Postman:
  - [ ] Register new user
  - [ ] Login dengan credentials
  - [ ] Access protected endpoint dengan JWT
  - [ ] Test invalid scenarios

### Phase 10: Documentation & Best Practices
- [ ] Add API documentation dengan Swagger
- [ ] Add logging dengan SLF4J
- [ ] Environment-specific configurations
- [ ] Add Docker support (optional)

## 📁 Expected Project Structure
```
src/
├── main/
│   ├── java/com/example/auth/
│   │   ├── config/
│   │   │   ├── SecurityConfig.java
│   │   │   └── JwtConfig.java
│   │   ├── controller/
│   │   │   ├── AuthController.java
│   │   │   └── UserController.java
│   │   ├── dto/
│   │   │   ├── LoginRequest.java
│   │   │   ├── RegisterRequest.java
│   │   │   └── AuthResponse.java
│   │   ├── entity/
│   │   │   ├── User.java
│   │   │   └── Role.java
│   │   ├── exception/
│   │   │   └── GlobalExceptionHandler.java
│   │   ├── repository/
│   │   │   └── UserRepository.java
│   │   ├── security/
│   │   │   ├── JwtAuthenticationFilter.java
│   │   │   └── JwtUtil.java
│   │   ├── service/
│   │   │   ├── UserService.java
│   │   │   └── AuthService.java
│   │   └── AuthApplication.java
│   └── resources/
│       └── application.properties
└── test/
```

## 🔧 Key Dependencies
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
    </dependency>
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt-api</artifactId>
        <version>0.11.5</version>
    </dependency>
</dependencies>
```

## 📚 Learning Resources
- [Spring Boot Official Documentation](https://spring.io/projects/spring-boot)
- [Spring Security Documentation](https://spring.io/projects/spring-security)
- [JWT.io](https://jwt.io/) untuk memahami JWT
- [PostgreSQL Documentation](https://www.postgresql.org/docs/)

## 🎯 Success Metrics
Setelah menyelesaikan checklist ini, Anda akan bisa:
1. ✅ Membuat user registration dan login system
2. ✅ Mengimplementasi JWT authentication
3. ✅ Menggunakan Spring Security untuk protect endpoints
4. ✅ Bekerja dengan PostgreSQL database
5. ✅ Testing API menggunakan Postman
6. ✅ Memahami konsep backend security basics

---
**Next Steps:** Setelah master sistem authentication, lanjut ke fitur-fitur advanced seperti email verification, password reset, role-based access control, dan API rate limiting.