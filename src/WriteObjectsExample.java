import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectsExample {
    public static void main(String[] args) {
        Person firstPerson=new Person("first",20);
        Person secondPerson=new Person("second",30);
        try (FileOutputStream fos = new FileOutputStream("objsample.txt")) {
            ObjectOutputStream outputStream = new ObjectOutputStream(fos);
            outputStream.writeObject(firstPerson);
            outputStream.writeObject(secondPerson);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
