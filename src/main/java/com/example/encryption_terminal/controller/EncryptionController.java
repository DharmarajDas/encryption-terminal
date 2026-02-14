
package com.example.encryption_terminal.controller;

import com.example.encryption_terminal.model.EncryptionResponse;
import com.example.encryption_terminal.service.EncryptionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EncryptionController {

    private final EncryptionService encryptionService;

    public EncryptionController(EncryptionService encryptionService) {
        this.encryptionService = encryptionService;
    }

    @GetMapping("/encrypt")
    public EncryptionResponse encrypt(@RequestParam String message) {

        String encrypted = encryptionService.encrypt(message);

        return new EncryptionResponse(message, encrypted, "encryption");
    }

    @GetMapping("/decrypt")
    public EncryptionResponse decrypt(@RequestParam String message) {

        String decrypted = encryptionService.decrypt(message);

        return new EncryptionResponse(message, decrypted, "decryption");
    }
}
