package finalProjectModule1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;


public class FileManager {
    public String readFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        byte[] bytes = Files.readAllBytes(path);
        return new String(bytes, StandardCharsets.UTF_8);
    }
    public void writeFile(String content, String filePath) {
        // Logic for writing a file
        try {
            Files.write(Path.of(filePath),content.getBytes(StandardCharsets.UTF_8));
            System.out.println("Content successfully inserted!");
        }
        catch (IOException e){
            System.out.println("File does not exist");
        }

    }
}
