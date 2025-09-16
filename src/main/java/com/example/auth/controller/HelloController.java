package com.example.auth.controller;

// Import untuk Spring Web annotations
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Hello Controller - Controller pertama untuk belajar REST API
 *
 * Konsep: Controller di Spring Boot seperti router di Express.js
 * Fungsi: Menangani HTTP requests dan mengembalikan responses
 *
 * @RestController menggabungkan:
 * - @Controller: menandai ini sebagai Spring MVC controller
 * - @ResponseBody: otomatis convert return value ke JSON/XML
 *
 * @RequestMapping: base URL untuk semua endpoints di controller ini
 */
@RestController
@RequestMapping("/api") // Base URL: semua endpoint dimulai dengan /api
public class HelloController {

    /**
     * Endpoint 1: Hello World sederhana
     *
     * @GetMapping: handle HTTP GET request ke URL yang ditentukan
     * Mirip seperti: app.get('/hello', (req, res) => {...}) di Express.js
     *
     * URL lengkap: GET http://localhost:8080/api/hello
     */
    @GetMapping("/hello")
    public String sayHello() {
        // Return string akan otomatis dijadikan response body
        return "Hello World dari Spring Boot! 🎉";
    }

    /**
     * Endpoint 2: Hello dengan nama (Path Variable)
     *
     * @PathVariable: mengambil nilai dari URL path
     * Contoh: GET /api/hello/John -> nama = "John"
     *
     * URL lengkap: GET http://localhost:8080/api/hello/John
     */
    @GetMapping("/hello/{nama}")
    public String sayHelloWithName(@PathVariable String nama) {
        // String concatenation untuk membuat response personal
        return "Hello " + nama + "! Selamat belajar Spring Boot! 🚀";
    }

    /**
     * Endpoint 3: Hello dengan query parameter
     *
     * @RequestParam: mengambil nilai dari query string
     * Contoh: GET /api/greet?name=John&age=25
     *
     * URL lengkap: GET http://localhost:8080/api/greet?name=John&age=25
     */
    @GetMapping("/greet")
    public String greetWithParams(
            @RequestParam String name,                    // Required parameter
            @RequestParam(defaultValue = "0") int age     // Optional dengan default value
    ) {
        // Conditional logic dalam response
        if (age > 0) {
            return String.format("Hello %s! Umur kamu %d tahun. Semangat belajar! 💪", name, age);
        } else {
            return String.format("Hello %s! Semangat belajar Spring Boot! 📚", name);
        }
    }

    /**
     * Endpoint 4: Info tentang backend
     *
     * Return JSON object (akan otomatis di-convert oleh Spring)
     * Ini contoh return object instead of plain string
     */
    @GetMapping("/info")
    public BackendInfo getBackendInfo() {
        // Create dan return object - akan otomatis jadi JSON
        return new BackendInfo(
                "Spring Boot Learning API",
                "1.0.0",
                "Belajar membuat authentication system",
                "Java 17 + Spring Boot 3.2.0"
        );
    }

    /**
     * Inner class untuk response JSON
     *
     * Konsep: DTO (Data Transfer Object)
     * Fungsi: mendefine struktur data yang akan dikirim sebagai JSON response
     */
    public static class BackendInfo {
        private String applicationName;
        private String version;
        private String description;
        private String technology;

        // Constructor
        public BackendInfo(String applicationName, String version, String description, String technology) {
            this.applicationName = applicationName;
            this.version = version;
            this.description = description;
            this.technology = technology;
        }

        // Getter methods - diperlukan untuk JSON serialization
        public String getApplicationName() { return applicationName; }
        public String getVersion() { return version; }
        public String getDescription() { return description; }
        public String getTechnology() { return technology; }

        // Setter methods - untuk JSON deserialization (jika diperlukan)
        public void setApplicationName(String applicationName) { this.applicationName = applicationName; }
        public void setVersion(String version) { this.version = version; }
        public void setDescription(String description) { this.description = description; }
        public void setTechnology(String technology) { this.technology = technology; }
    }
}