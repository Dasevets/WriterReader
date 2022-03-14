import java.io.*;


public class WritingFile {
    static protected File writingFile(String st) throws Exception {
        File text = new File("text.txt");
        FileWriter fw = new FileWriter(text, true);
        if(st.equals("view") != true) {
            fw.append(st);
            fw.append("\n");
            fw.close();
        }
        return text;
    }
}
