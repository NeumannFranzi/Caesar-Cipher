package finalProjectModule1;

import java.util.Arrays;

public class Cipher {
    //private char[] alphabet;
    private static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f',
            'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z', '.', ',', '!', '?', ' '};

    public Cipher(char[] alphabet) {
        this.alphabet = alphabet;
    }

    public char[] getAlphabet(){
        return this.alphabet;
    }

    public Cipher() {

    }


    public String encrypt(String text, int shift) {
        // Encryption logic
        StringBuilder encryptStr = new StringBuilder();
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            for (int j = 0; j < alphabet.length - 1; j++) {
                if (c == alphabet[j]) {
                    int posEncrypt = (j + shift) % 31;
                    char charEncrypt = alphabet[posEncrypt];
                    encryptStr.append(charEncrypt);
                    break;
                }
            }
        }
        return encryptStr.toString();
    }

    public String decrypt(String encryptedText, int shift) {
        // Decryption logic
        StringBuilder decryptStr = new StringBuilder();
        encryptedText = encryptedText.toLowerCase();
        for (int i = 0; i < encryptedText.length(); i++) {
            char c = encryptedText.charAt(i);
            for (int j = 0; j < alphabet.length - 1; j++) {
                if (c == alphabet[j]) {
                    int posEncrypt = (j - shift) % 31;
                    char charDecrypt = alphabet[posEncrypt];
                    decryptStr.append(charDecrypt);
                    break;
                }
            }
        }
            return decryptStr.toString();
        }
    }
