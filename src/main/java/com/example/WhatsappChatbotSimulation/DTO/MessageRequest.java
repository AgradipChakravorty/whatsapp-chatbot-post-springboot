package com.example.WhatsappChatbotSimulation.DTO;
// DTO class to capture incoming request data from client (Postman/frontend)
public class MessageRequest {

    // This field will store the message sent by the user in JSON
    private String message;

    // Getter method to access the message
    public String getMessage() {
        return message;
    }

    // Setter method to set the message value from incoming JSON
    public void setMessage(String message) {
        this.message = message;
    }
}