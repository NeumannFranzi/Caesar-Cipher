package finalProjectModule1;

import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {
        // Logic for selecting the operating mode, calling the appropriate methods

        Scanner scanner = new Scanner (System.in);
        Cipher cipher = new Cipher();
        BruteForce bruteForce = new BruteForce();
        Validator validator = new Validator();
        char []alphabet = cipher.getAlphabet();


        System.out.println("Caesar Cipher Program");
        System.out.println("Choose an option:");
        System.out.println("1. Encrypt text");
        System.out.println("2. Decrypt text");
        System.out.println("3. Decrypt the text with brutforce method");

try {
    int choice = Integer.parseInt(scanner.nextLine());

        //scanner.nextLine();
        String text;
        String decryptedText;
        int shift;

        switch (choice) {
            case 1: //encrypt text
                System.out.println("Enter the text to encrypt:");
                text = scanner.nextLine();
                System.out.println("Enter the shift of number:");
                shift = scanner.nextInt();
                validator.isValidKey(shift,cipher.getAlphabet());
                String encryptedText = cipher.encrypt(text, shift);
                System.out.println("Encrpyted text: " + encryptedText);
                break;
            case 2: //decrypt text

                System.out.println("Enter the text to decrypt:");
                text = scanner.nextLine();
                System.out.println("Enter the shift of number:");
                shift = scanner.nextInt();
                validator.isValidKey(shift,cipher.getAlphabet());
                decryptedText = cipher.decrypt(text, shift);
                System.out.println("Encrypted text: " + decryptedText);
                break;

            case 3: //brutforce

                System.out.println("Enter the text to decrypt:");
                text = scanner.nextLine();
                decryptedText= bruteForce.decryptByBruteForce(text,cipher.getAlphabet());
                System.out.println("Encrypted text: " + decryptedText);

        }
} catch (NumberFormatException e){
    System.out.println("Invalid entry.Please insert a number.");
}
    }
}
