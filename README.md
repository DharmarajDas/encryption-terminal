# 🔐 Encryption Terminal – Spring Boot Project

## 📌 Project Description

Encryption Terminal is a simple web application that allows users to **encrypt and decrypt text messages** using basic algorithms.

This project is useful for:

* Learning **Spring Boot REST API**
* Understanding **frontend + backend connection**
* Practicing **real-world project structure**
* Adding a **good resume project**

---

## 🚀 Features

* Encrypt text input
* Decrypt encrypted text
* Clear button to reset fields
* Error message when input is empty
* Loading message while API is processing
* Simple animated UI
* Swagger API documentation

---

## 🛠 Tech Stack

**Backend**

* Java 17
* Spring Boot
* Maven
* REST API
* Swagger UI

**Frontend**

* HTML
* CSS
* JavaScript

**Tools**

* VS Code
* Git
* GitHub

---

## 📂 Project Structure

```
encryption-terminal
│
├── src
│   ├── main
│   │   ├── java/com/example/encryption_terminal
│   │   │   ├── controller
│   │   │   │   └── EncryptionController.java
│   │   │   ├── service
│   │   │   │   └── EncryptionService.java
│   │   │   └── EncryptionTerminalApplication.java
│   │   │
│   │   └── resources
│   │       ├── static
│   │       │   └── index.html
│   │       └── application.properties
│
├── pom.xml
└── README.md
```

---

## ⚙️ How to Run Locally

### 1️⃣ Prerequisites

Make sure installed:

* Java 17
* Maven
* VS Code

Check in terminal:

```
java -version
mvn -version
```

---

### 2️⃣ Clone Project

```
git clone https://github.com/DharmarajDas/encryption-terminal.git
cd encryption-terminal
```

---

### 3️⃣ Run Spring Boot App

```
mvn spring-boot:run
```

OR run from VS Code:

* Open project folder
* Click **Run ▶** on main class

---

### 4️⃣ Open in Browser

Frontend:

```
http://localhost:8080
```

Swagger UI:

```
http://localhost:8080/swagger-ui.html
```

---


## 📸 Screenshots

### Home Page
![Home](screenshots/home.png)

### Encryption Result
![Encrypt](screenshots/encrypt.png)

### Decryption Result
![Decrypt](screenshots/decrypt.png)

### Swagger UI
![Swagger](screenshots/swagger.png)


---

## 💡 Real-Life Use Case

* Secure message sharing
* Learning basic cryptography
* Backend API practice
* Portfolio project for jobs

---

## 📚 Learning Outcomes

After completing this project you understand:

* Spring Boot project structure
* REST API creation
* Connecting frontend with backend
* Using Swagger documentation
* Deploy-ready project basics

---

## 🔗 Future Improvements

* Add login authentication
* Use advanced encryption (AES)
* Store history in database
* Deploy on cloud (AWS / Render)

---

## 👨‍💻 Author

**Dharmaraj Das**
Student | Java & Spring Boot Learner

GitHub:  

```
https://github.com/DharmarajDas
```

---

## ⭐ If you like this project

Give a **star ⭐ on GitHub** to support.
