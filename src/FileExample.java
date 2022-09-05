import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("src");
        System.out.println(file.exists());//существует ли фаил? проверяем
        System.out.println(file.isDirectory());//проверяет, что это папка
        System.out.println(file.isFile());//проверяет, что это фаил
        System.out.println(file.isHidden());//является ли фаил скрытым?
        System.out.println(file.getAbsolutePath());//пусть к этому файлу
        System.out.println(file.getParent());//проверка родителей файла(надо вставлять полный пусть, а не название, например С://..)
        System.out.println();
        // file.delete();// удалить фаил
        file.mkdir();//создать папку
        System.out.println("my st\trin\ng");


        System.out.println(Arrays.toString(file.list()));//
        for (File currentFile: file.listFiles(new MyFileFilter())){
            System.out.println(currentFile.getName());//проверяет файлы в папке с их расширением
        }


        try {
            file.createNewFile();//создать новый фаил
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
