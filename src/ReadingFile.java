import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class ReadingFile {

    protected static void readingFile(File file) throws Exception{
        if(file.exists()) {
            Reader read = new FileReader("text.txt");
            char [] charArr = new char[1024];

            int i;
            int j = 0;
            while ((i = read.read()) != -1) {
                charArr[j] = (char) i;
                j++;

            }
            StringBuilder st = new StringBuilder("");

            for (char s: charArr){
                st.append(s);
            }
            System.out.println(st);
        } else {
            System.out.println("Файл не найден");
        }


    }
}
