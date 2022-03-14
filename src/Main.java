import java.io.File;
import java.util.Scanner;

/*
        Ограниченая по месту записная книжкаю.
    Написать программу которая:
        * Считывает данные с клавиатуры
        * Записывает данные в файл .txt
        * По команде выводит данные в консоль
 */

public class Main {
    public static void main(String[] args) throws Exception {

        while(true) {
            Scanner scanner = new Scanner(System.in);
            String st = scanner.nextLine();
            File text = WritingFile.writingFile(st);

            if(st.equals("exit")){
                break;
            } else if(st.equals("view")){
                ReadingFile.readingFile(text);
            }
        }





    }
}
