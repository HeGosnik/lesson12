import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("sample2.txt",true);// создаем//ставим тру, если хотив в 11 строке не перезапиисывать, а дозаписывать фаил
            fileWriter.write("This is first line\n");
            fileWriter.write("This is second line\n");
            fileWriter.close();//закрытие файла
            fileWriter.flush();//перезаписываем фаил

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
