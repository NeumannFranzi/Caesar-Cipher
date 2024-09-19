package finalProjectModule1;
 import java.io.File;
public class Validator {
    public boolean isValidKey(int key, char[] alphabet) {
        // Key Check
        if (key >0 && key < alphabet.length-1){
            return true;
        } else {
            return false;
        }
    }
    public boolean isFileExists(String filePath) {
        // Check if the file exists
        File file = new File (filePath);
        if (file.exists())  {
            return true;
        } else {
            return false;

            
        }
    }
}
