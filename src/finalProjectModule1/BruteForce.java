package finalProjectModule1;

public class BruteForce {
    public String decryptByBruteForce(String encryptedText, char[] alphabet) {
        // Brute force logic

        //alle möglichen shift kombinationen

        Cipher cipher = new Cipher(alphabet);
        for (int shift = 1; shift <= 30; shift++){
            cipher.decrypt(encryptedText,shift);

        }
        return encryptedText;
    }
}
