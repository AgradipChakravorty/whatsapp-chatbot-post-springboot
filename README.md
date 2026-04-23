# whatsapp-chatbot-post-springboot
A simple WhatsApp chatbot backend simulation built with Java and Spring Boot. Features a REST API webhook endpoint that accepts JSON messages and responds with predefined replies.
# WhatsApp Chatbot Backend Simulation

A simple WhatsApp chatbot backend simulation built with **Java** and **Spring Boot** as part of an internship assignment.

## Features

- REST API endpoint (`/webhook`) to receive POST requests
-  Accepts JSON input simulating WhatsApp messages
-  Responds with predefined replies based on message content
-  Logs all incoming messages to console
-  Simple and lightweight implementation

## Technologies Used

- **Java 17** (or your version)
- **Spring Boot 3.x** (or your version)
- **Spring Web**
- **Maven**

## Project Structure

WhatsappChatbotSimulation
│
└── src
    │
    └── main
        │
        ├── java
        │   │
        │   └── com.example.WhatsappChatbotSimulation
        │       │
        │       ├── Controller
        │       │   └── ChatController.java
        │       │
        │       ├── DTO
        │       │   ├── MessageRequest.java
        │       │   └── MessageResponse.java
        │       │
        │       └── WhatsappChatbotSimulationApplication.java
        │
        └── resources
            │
            └── application.properties
            
##  How to Run

### Prerequisites
- Java 17 or higher
- Maven installed

### Steps

1. **Clone the repository**
```bash
   git clone https://github.com/your-username/whatsapp-chatbot-springboot.git
   cd whatsapp-chatbot-springboot
```

2. **Build the project**
```bash
   mvn clean install
```

3. **Run the application**
```bash
   mvn spring-boot:run
```

4. **The server will start on** `http://localhost:8080`

##  API Endpoint

### POST `/webhook`

**Request:**
```json
{
  "message": "hi"
}
```

**Response:**
```json
{
  "reply": "Hello"
}
```

##  Testing with cURL

```bash
curl -X POST http://localhost:8080/webhook \
  -H "Content-Type: application/json" \
  -d '{"message":"hi"}'
```

##  Testing with Postman

1. Open Postman
2. Create a new **POST** request
3. URL: `http://localhost:8080/webhook`
4. Headers: `Content-Type: application/json`
5. Body (raw JSON):
```json
   {
     "message": "hi"
   }
```
6. Click **Send**

## Predefined Responses

| Input Message | Bot Response |
|--------------|--------------|
| hi / hello   | Hello        |
| bye / goodbye| Goodbye      |
| anything else| I don't understand |

##  Screenshots

### Request in Postman
![Postman Request](screenshots/postman-request.png)

### Console Logs
![Console Logs](screenshots/console-logs.png)

## 📝 Assignment Requirements

This project fulfills the following requirements:

-  Create a REST API endpoint (webhook)
-  Accept POST requests
-  Accept JSON input simulating WhatsApp messages
-  Respond with predefined replies (Hi → Hello, Bye → Goodbye)
-  Log all incoming messages
-  Deploy locally and share screenshots

## Author

**AGRADIP CHAKRAVORTY**


##  License

This project is created for educational purposes as part of an internship assignment.
 
