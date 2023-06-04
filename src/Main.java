import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int countF=0;
        while (true) {
            System.out.println("Введите путь к файлу и нажмите <Enter>: ");
            String path = new Scanner(System.in).nextLine();
            //System.out.println("Файл для сканирования: " + path);
            File file= new File(path);
            boolean fileExists=file.exists();
            boolean isDirectory=file.isDirectory();
            if (!fileExists) {
                System.out.println("Не существует файла по указанному пути: " + path);
                continue;}
            if (isDirectory) {
                System.out.println("По указанному пути расположена директория: " + path);
                continue;}
            countF++;
            System.out.println("Путь указан верно");
            System.out.println("Это файл № " + countF +": "+ path);
            }
    }
}
