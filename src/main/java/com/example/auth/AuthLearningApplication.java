package com.example.auth;

// Import yang diperlukan untuk Spring Boot
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Class - Entry point dari aplikasi Spring Boot
 *
 * Konsep: Ini seperti file index.js di Node.js atau main() di program Java biasa
 *
 * @SpringBootApplication adalah annotation yang menggabungkan 3 annotation:
 * 1. @Configuration - memberitahu Spring ini adalah kelas konfigurasi
 * 2. @EnableAutoConfiguration - otomatis konfigurasi Spring berdasarkan dependencies
 * 3. @ComponentScan - scan semua komponen Spring di package ini dan sub-package
 */
@SpringBootApplication
public class AuthLearningApplication {

    /**
     * Method main - seperti fungsi main() di program Java pada umumnya
     *
     * SpringApplication.run() akan:
     * 1. Start embedded Tomcat server (default port 8080)
     * 2. Initialize Spring Application Context
     * 3. Scan dan register semua Spring components (@Controller, @Service, dll)
     * 4. Start aplikasi dan siap menerima HTTP requests
     */
    public static void main(String[] args) {
        // Start Spring Boot application
        SpringApplication.run(AuthLearningApplication.class, args);

        // Setelah baris ini dijalankan, server akan running di http://localhost:8080
        System.out.println("🚀 Server berhasil dijalankan di http://localhost:8080");
        System.out.println("💡 Coba akses: http://localhost:8080/api/hello");
    }
}