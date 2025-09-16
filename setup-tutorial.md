# 🛠️ Tutorial Setup Environment Java Spring Boot

## 📋 Yang Perlu Diinstall

### 1. **Java Development Kit (JDK) 17+**
### 2. **Apache Maven** (Build Tool)
### 3. **IDE/Text Editor** (Optional tapi sangat direkomendasikan)
### 4. **Postman** (untuk testing API)

---

## ☕ **1. Install Java JDK 17+**

### **macOS (menggunakan Homebrew)**
```bash
# Install Homebrew dulu jika belum ada
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

# Install JDK 17
brew install openjdk@17

# Setup PATH (tambahkan ke ~/.zshrc atau ~/.bash_profile)
echo 'export PATH="/opt/homebrew/opt/openjdk@17/bin:$PATH"' >> ~/.zshrc
source ~/.zshrc
```

### **Windows**
1. Download dari: **https://adoptium.net/temurin/releases/**
2. Pilih **Version: 17** dan **Operating System: Windows**
3. Download file `.msi` dan install
4. Setup environment variable:
   - Buka System Properties → Advanced → Environment Variables
   - Tambah `JAVA_HOME` = `C:\Program Files\Eclipse Adoptium\jdk-17.x.x-hotspot`
   - Edit `PATH`, tambahkan `%JAVA_HOME%\bin`

### **Linux (Ubuntu/Debian)**
```bash
# Update package list
sudo apt update

# Install JDK 17
sudo apt install openjdk-17-jdk

# Verify installation
java -version
```

### **Manual Download (Semua OS)**
**Link:** https://adoptium.net/temurin/releases/
- Pilih **Version:** 17 (LTS)
- Pilih **Operating System** sesuai sistem Anda
- Download dan install

---

## 🔧 **2. Install Apache Maven**

### **macOS (Homebrew)**
```bash
brew install maven
```

### **Windows**
1. Download dari: **https://maven.apache.org/download.cgi**
2. Download file `apache-maven-3.9.x-bin.zip`
3. Extract ke `C:\apache-maven`
4. Setup environment variable:
   - Tambah `MAVEN_HOME` = `C:\apache-maven`
   - Edit `PATH`, tambahkan `%MAVEN_HOME%\bin`

### **Linux (Ubuntu/Debian)**
```bash
sudo apt install maven
```

### **Manual Download**
**Link:** https://maven.apache.org/download.cgi
1. Download `Binary tar.gz archive`
2. Extract dan setup PATH

---

## 💻 **3. Install IDE (Pilih Salah Satu)**

### **Option A: IntelliJ IDEA (Recommended untuk Java)**
- **Community Edition (FREE):** https://www.jetbrains.com/idea/download/
- **Features:** Built-in Maven support, Spring Boot tools, excellent debugging

### **Option B: Visual Studio Code (Lightweight)**
- **Download:** https://code.visualstudio.com/
- **Extensions yang perlu diinstall:**
  1. **Extension Pack for Java** (by Microsoft)
  2. **Spring Boot Extension Pack** (by VMware)
  3. **Maven for Java** (by Microsoft)

### **Option C: Eclipse (Alternative)**
- **Download:** https://www.eclipse.org/downloads/
- Pilih **Eclipse IDE for Enterprise Java and Web Developers**

---

## 🧪 **4. Install Postman (untuk Testing API)**

**Download:** https://www.postman.com/downloads/
- Platform: Windows, macOS, Linux
- Alternative: **Insomnia** (https://insomnia.rest/download)

---

## ✅ **5. Verifikasi Instalasi**

Buka terminal/command prompt dan jalankan:

```bash
# Check Java version (harus menunjukkan 17+)
java -version

# Check Maven version
mvn -version

# Output yang diharapkan:
# Java version: 17.x.x
# Maven version: 3.9.x
```

**Contoh output yang benar:**
```
java version "17.0.7" 2023-04-18 LTS
Java(TM) SE Runtime Environment (build 17.0.7+8-LTS-224)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.7+8-LTS-224, mixed mode, sharing)

Apache Maven 3.9.4
Maven home: /opt/homebrew/Cellar/maven/3.9.4/libexec
Java version: 17.0.7, vendor: Oracle Corporation
```

---

## 🚀 **6. Test Setup dengan Project Kita**

Setelah semua terinstall, coba jalankan project:

```bash
# Navigate ke project directory
cd /path/to/JavaLearn

# Compile dan jalankan
mvn spring-boot:run

# Jika berhasil, akan muncul log seperti:
# Started AuthLearningApplication in 2.345 seconds
```

**Buka browser dan test:**
- http://localhost:8080/api/hello
- http://localhost:8080/api/info

---

## 🔧 **7. IDE Setup (Bonus)**

### **IntelliJ IDEA:**
1. Open → pilih folder JavaLearn
2. Wait import Maven project
3. Run → pilih AuthLearningApplication.java
4. Klik hijau play button

### **VS Code:**
1. Install extensions Java + Spring Boot
2. Open folder JavaLearn
3. Ctrl+Shift+P → "Java: Run"
4. Pilih AuthLearningApplication

---

## 🆘 **Troubleshooting**

### **Problem 1: Command not found**
```bash
# macOS - reload terminal profile
source ~/.zshrc

# Windows - restart Command Prompt
# Linux - reload bashrc
source ~/.bashrc
```

### **Problem 2: Java version mismatch**
```bash
# Check multiple Java versions
/usr/libexec/java_home -V   # macOS
update-alternatives --list java   # Linux

# Set specific version
export JAVA_HOME=$(/usr/libexec/java_home -v 17)   # macOS
```

### **Problem 3: Maven tidak recognize project**
```bash
# Force reimport dependencies
mvn clean install
```

### **Problem 4: Port 8080 already in use**
Edit `src/main/resources/application.properties`:
```properties
server.port=8081
```

---

## 📚 **Links Penting**

| Tool | Official Website | Documentation |
|------|------------------|---------------|
| Java JDK | https://adoptium.net/ | https://docs.oracle.com/en/java/ |
| Maven | https://maven.apache.org/ | https://maven.apache.org/guides/ |
| Spring Boot | https://spring.io/projects/spring-boot | https://docs.spring.io/spring-boot/ |
| IntelliJ IDEA | https://www.jetbrains.com/idea/ | https://www.jetbrains.com/help/idea/ |
| VS Code | https://code.visualstudio.com/ | https://code.visualstudio.com/docs/java |
| Postman | https://www.postman.com/ | https://learning.postman.com/ |

---

## 🎯 **Next Steps**

Setelah setup selesai:
1. ✅ Jalankan `mvn spring-boot:run`
2. ✅ Test semua endpoints di browser
3. ✅ Test dengan Postman
4. 🚀 Lanjut ke pembelajaran authentication!

---

**❓ Jika ada masalah setup, screenshot error message dan tanya!**