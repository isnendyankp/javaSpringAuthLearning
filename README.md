# 🚀 Java Spring Boot Authentication Learning

Repository pembelajaran backend development menggunakan **Java Spring Boot**, **PostgreSQL**, dan **JWT Authentication**.

## 📋 Tentang Project Ini

Project ini dibuat untuk belajar konsep backend development dari dasar hingga advanced, fokus pada:

- ☕ **Java Spring Boot** - Framework untuk building REST APIs
- 🔐 **Authentication System** - Login/Register dengan JWT
- 🗄️ **PostgreSQL** - Database relational untuk menyimpan data
- 🛡️ **Spring Security** - Security framework untuk proteksi endpoints
- 📚 **Best Practices** - Clean code, error handling, testing

## 🎯 Learning Path

### Phase 1: Hello World ✅
- [x] Setup project Spring Boot
- [x] Membuat basic REST endpoints
- [x] Memahami controller dan annotations
- [x] Testing API di browser

### Phase 2: Database Integration (Coming Soon)
- [ ] Setup PostgreSQL connection
- [ ] Membuat User entity dengan JPA
- [ ] CRUD operations dasar

### Phase 3: Authentication System (Coming Soon)
- [ ] User registration endpoint
- [ ] User login dengan JWT
- [ ] Password encryption dengan BCrypt
- [ ] Protected endpoints

### Phase 4: Advanced Features (Coming Soon)
- [ ] Role-based access control
- [ ] Email verification
- [ ] Password reset functionality
- [ ] API documentation dengan Swagger

## 🛠️ Tech Stack

- **Backend Framework:** Spring Boot 3.2.0
- **Language:** Java 17
- **Database:** PostgreSQL
- **Security:** Spring Security + JWT
- **Build Tool:** Maven
- **Testing:** JUnit, Mockito

## 🚀 Cara Menjalankan Project

### Prerequisites
- Java 17 atau lebih baru
- Maven 3.6+
- PostgreSQL (untuk phase 2+)

### Installation & Setup

1. **Clone repository:**
```bash
git clone https://github.com/isnendyankp/javaSpringAuthLearning.git
cd javaSpringAuthLearning
```

2. **Install dependencies dan compile:**
```bash
mvn clean install
```

3. **Jalankan aplikasi:**
```bash
mvn spring-boot:run
```

4. **Server akan berjalan di:** http://localhost:8080

### Testing Endpoints

Setelah server running, test endpoints berikut di browser atau Postman:

```bash
# Hello World sederhana
GET http://localhost:8080/api/hello

# Hello dengan nama
GET http://localhost:8080/api/hello/YourName

# Greeting dengan query parameters
GET http://localhost:8080/api/greet?name=John&age=25

# Info aplikasi (JSON response)
GET http://localhost:8080/api/info
```

## 📁 Struktur Project

```
src/
├── main/
│   ├── java/com/example/auth/
│   │   ├── controller/          # REST Controllers
│   │   ├── entity/              # JPA Entities (coming soon)
│   │   ├── repository/          # Data Access Layer (coming soon)
│   │   ├── service/             # Business Logic (coming soon)
│   │   ├── config/              # Configurations (coming soon)
│   │   └── AuthLearningApplication.java
│   └── resources/
│       └── application.properties
├── test/                        # Unit & Integration Tests
└── plan/
    └── roadmap.md              # Detailed learning roadmap
```

## 📚 Resources & Documentation

- [Setup Tutorial](setup-tutorial.md) - Complete environment setup guide
- [Learning Roadmap](plan/roadmap.md) - Detailed learning checklist
- [Spring Boot Documentation](https://docs.spring.io/spring-boot/)
- [Spring Security Documentation](https://docs.spring.io/spring-security/)

## 🎓 Learning Objectives

Setelah menyelesaikan project ini, Anda akan memahami:

1. **Spring Boot Fundamentals** - Annotations, dependency injection, auto-configuration
2. **REST API Development** - Controllers, HTTP methods, request/response handling
3. **Database Integration** - JPA/Hibernate, repository pattern, database migrations
4. **Authentication & Security** - JWT tokens, password hashing, protected routes
5. **Testing** - Unit tests, integration tests, mocking
6. **Best Practices** - Error handling, validation, clean architecture

## 🤝 Contributing

Ini adalah project pembelajaran, silakan fork dan experiment dengan code!

## 📄 License

MIT License - Feel free to use for learning purposes.
