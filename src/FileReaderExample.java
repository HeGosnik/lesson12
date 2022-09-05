import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("sample2.txt")) {
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
