import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Hp\\IdeaProjects\\ObjectExamples\\src\\Example.txt"; // Path to your file

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
