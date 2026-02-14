
package com.example.encryption_terminal.service;

import org.springframework.stereotype.Service;

@Service
public class EncryptionService {

    private static final int SHIFT = 5;

    public String encrypt(String text) {
        return process(text, SHIFT);
    }

    public String decrypt(String text) {
        return process(text, 26 - (SHIFT % 26));
    }

    private String process(String text, int shift) {

        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {

            if (Character.isLetter(character)) {

                char base = Character.isLowerCase(character) ? 'a' : 'A';

                result.append((char) ((character - base + shift) % 26 + base));

            } else {
                result.append(character);
            }
        }

        return result.toString();
    }
}
