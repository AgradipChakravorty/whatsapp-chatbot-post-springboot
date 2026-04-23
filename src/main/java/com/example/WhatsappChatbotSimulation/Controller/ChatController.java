package com.example.WhatsappChatbotSimulation.Controller;

import com.example.WhatsappChatbotSimulation.DTO.MessageRequest;
import com.example.WhatsappChatbotSimulation.DTO.MessageResponse;
import org.springframework.web.bind.annotation.*;

// Marks this class as a REST Controller
// It handles HTTP requests and returns JSON responses
@RestController
public class ChatController {

    // This method handles POST requests at "/webhook"
    @PostMapping("/webhook")
    public MessageResponse reply(@RequestBody MessageRequest request) {

        // Extract message from request DTO
        String msg = request.getMessage();

        // Variable to store reply
        String response;

        // Simple conditional logic to generate response
        if ("hi".equalsIgnoreCase(msg)) {
            response = "Hello";
        } else if ("bye".equalsIgnoreCase(msg)) {
            response = "Goodbye";
        } else {
            response = "I don't understand";
        }

        // Logging incoming message in console
        System.out.println("Incoming message: " + msg);

        // Return response DTO (automatically converted to JSON)
        return new MessageResponse(response);
    }
}
