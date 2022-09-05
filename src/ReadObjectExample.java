import java.io.*;

public class ReadObjectExample {
    public static void main(String[] args) {
        Person lastPerson = null;
        try (FileInputStream fis = new FileInputStream("objsample.txt")) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                lastPerson = (Person) ois.readObject();
                System.out.println(lastPerson);
            }
        } catch (IOException e) {
            System.out.println("here");

        } catch (ClassNotFoundException e) {
            System.out.println("here 2");
        }
        lastPerson.setAge(48);
        System.out.println(lastPerson);
    }
}
