# 🎯 Tutorial: Hello World Spring Boot - Step by Step

**Level:** Beginner
**Estimasi Waktu:** 30 menit
**Goal:** Membuat REST API sederhana dengan Spring Boot

---

## 📋 Prerequisites

- ✅ Java 17+ terinstall
- ✅ Maven terinstall
- ✅ IDE (IntelliJ/VS Code) atau text editor
- ✅ Browser untuk testing

---

## 🚀 Step 1: Membuat Project Structure

### **1.1 Buat Folder Project**
```bash
mkdir java-spring-hello-world
cd java-spring-hello-world
```

### **1.2 Buat Structure Folder**
```bash
mkdir -p src/main/java/com/example/hello
mkdir -p src/main/resources
mkdir -p src/test/java
```

**Hasil structure:**
```
java-spring-hello-world/
├── src/
│   ├── main/
│   │   ├── java/com/example/hello/
│   │   └── resources/
│   └── test/java/
```

---

## 📦 Step 2: Setup Dependencies (pom.xml)

### **2.1 Buat file pom.xml**
```bash
touch pom.xml
```

### **2.2 Isi pom.xml**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <!-- Spring Boot Parent - template dasar -->
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.2.0</version>
        <relativePath/>
    </parent>

    <!-- Info Project -->
    <groupId>com.example</groupId>
    <artifactId>hello-world</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>hello-world</name>
    <description>Hello World project dengan Spring Boot</description>

    <!-- Java Version -->
    <properties>
        <java.version>17</java.version>
    </properties>

    <!-- Dependencies -->
    <dependencies>
        <!-- Spring Boot Web - untuk REST API -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <!-- Spring Boot Test - untuk testing -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <!-- Build Plugin -->
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
```

**💡 Penjelasan pom.xml:**
- **parent**: Template Spring Boot dengan konfigurasi default
- **dependencies**: Library yang dibutuhkan (web, test)
- **plugin**: Tool untuk menjalankan aplikasi

---

## ☕ Step 3: Membuat Main Application Class

### **3.1 Buat HelloWorldApplication.java**
```bash
touch src/main/java/com/example/hello/HelloWorldApplication.java
```

### **3.2 Isi HelloWorldApplication.java**
```java
package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Class - Entry point aplikasi Spring Boot
 *
 * @SpringBootApplication menggabungkan:
 * - @Configuration: kelas konfigurasi
 * - @EnableAutoConfiguration: auto setup berdasarkan dependencies
 * - @ComponentScan: scan komponen Spring di package ini
 */
@SpringBootApplication
public class HelloWorldApplication {

    /**
     * Method main - start point aplikasi
     * SpringApplication.run() akan:
     * 1. Start embedded Tomcat server (port 8080)
     * 2. Initialize Spring Application Context
     * 3. Scan dan register semua Spring components
     * 4. Siap menerima HTTP requests
     */
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);

        System.out.println("🚀 Hello World Server started!");
        System.out.println("💻 Access: http://localhost:8080/hello");
    }
}
```

**💡 Konsep penting:**
- **@SpringBootApplication**: Annotation utama Spring Boot
- **main()**: Entry point seperti program Java biasa
- **SpringApplication.run()**: Start server dan aplikasi

---

## 🎛️ Step 4: Membuat Controller (REST API)

### **4.1 Buat HelloController.java**
```bash
mkdir -p src/main/java/com/example/hello/controller
touch src/main/java/com/example/hello/controller/HelloController.java
```

### **4.2 Isi HelloController.java**
```java
package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Hello Controller - Handle HTTP requests
 *
 * @RestController menggabungkan:
 * - @Controller: Spring MVC controller
 * - @ResponseBody: auto convert return value ke JSON/text
 */
@RestController
public class HelloController {

    /**
     * Endpoint 1: Hello World sederhana
     * URL: GET http://localhost:8080/hello
     */
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World dari Spring Boot! 🎉";
    }

    /**
     * Endpoint 2: Hello dengan nama
     * URL: GET http://localhost:8080/hello/John
     */
    @GetMapping("/hello/{name}")
    public String sayHelloWithName(@PathVariable String name) {
        return "Hello " + name + "! Selamat belajar Spring Boot! 🚀";
    }
}
```

**💡 Konsep penting:**
- **@RestController**: Class yang handle HTTP requests
- **@GetMapping**: Handle HTTP GET request
- **@PathVariable**: Ambil parameter dari URL path

---

## ⚙️ Step 5: Configuration File

### **5.1 Buat application.properties**
```bash
touch src/main/resources/application.properties
```

### **5.2 Isi application.properties**
```properties
# Server Configuration
server.port=8080

# Application Info
spring.application.name=hello-world

# Logging untuk development
logging.level.com.example.hello=INFO
```

**💡 Fungsi:**
- **server.port**: Port dimana server berjalan
- **spring.application.name**: Nama aplikasi
- **logging.level**: Level log yang ditampilkan

---

## 🧪 Step 6: Testing dan Running

### **6.1 Compile Project**
```bash
mvn clean compile
```

### **6.2 Run Application**
```bash
mvn spring-boot:run
```

**Expected output:**
```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.0)

Started HelloWorldApplication in 2.345 seconds
🚀 Hello World Server started!
💻 Access: http://localhost:8080/hello
```

### **6.3 Test di Browser**

**Endpoint 1:**
- URL: http://localhost:8080/hello
- Expected: "Hello World dari Spring Boot! 🎉"

**Endpoint 2:**
- URL: http://localhost:8080/hello/John
- Expected: "Hello John! Selamat belajar Spring Boot! 🚀"

---

## 🏗️ Project Structure Final

```
java-spring-hello-world/
├── pom.xml                                    # Dependencies & build config
├── src/
│   ├── main/
│   │   ├── java/com/example/hello/
│   │   │   ├── HelloWorldApplication.java    # Main class
│   │   │   └── controller/
│   │   │       └── HelloController.java      # REST endpoints
│   │   └── resources/
│   │       └── application.properties        # Configuration
│   └── test/java/                            # Unit tests (empty)
└── target/                                   # Compiled files (auto-generated)
```

---

## 🎓 Apa yang Sudah Dipelajari

### **1. Spring Boot Fundamentals**
- ✅ Project structure dan naming convention
- ✅ Maven dependencies management
- ✅ Main application class dengan @SpringBootApplication
- ✅ Configuration dengan application.properties

### **2. REST API Basics**
- ✅ Controller dengan @RestController
- ✅ HTTP GET mapping dengan @GetMapping
- ✅ Path variables dengan @PathVariable
- ✅ Return string response

### **3. Development Workflow**
- ✅ Compile dengan Maven
- ✅ Run aplikasi dengan mvn spring-boot:run
- ✅ Testing endpoints di browser
- ✅ Read application logs

---

## 🚀 Next Steps

Setelah berhasil membuat Hello World:

1. **Tambah endpoints lain** (POST, PUT, DELETE)
2. **Return JSON response** instead of plain text
3. **Add request parameters** dan request body
4. **Connect ke database** (PostgreSQL)
5. **Add authentication** (login/register)

---

## 🆘 Troubleshooting

### **Error: Command not found mvn**
```bash
# Install Maven
brew install maven  # macOS
sudo apt install maven  # Linux
```

### **Error: Port 8080 already in use**
```properties
# Edit application.properties
server.port=8081
```

### **Error: Java version mismatch**
```bash
java -version  # Check Java version
# Must be 17 or higher
```

### **Error: Dependencies tidak terdownload**
```bash
mvn clean install  # Force download dependencies
```

---

**🎉 Selamat! Anda sudah berhasil membuat Hello World Spring Boot pertama!**