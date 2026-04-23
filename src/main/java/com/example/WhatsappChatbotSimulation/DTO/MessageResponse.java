package com.example.WhatsappChatbotSimulation.DTO;

// DTO class to send response back to client
public class MessageResponse {

    // This field will store the reply that we want to send back
    private String reply;

    // Constructor to initialize the reply
    public MessageResponse(String reply) {
        this.reply = reply;
    }

    // Getter method to return reply in JSON response
    public String getReply() {
        return reply;
    }
}