package JavaLearning;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteAFile27 {
    public static void main(String[] args) throws IOException {
        WriteAFile writeAFile = new WriteAFile();
        writeAFile.writeMethod();
    }
}

class WriteAFile {
    public void writeMethod() throws IOException {
        File file = new File("C:/Users/Dell/Desktop/abc.txt");    // C:/Users/Dell/Desktop/
        try {
            if(!file.exists()) {
                file.createNewFile();
            }

            PrintWriter pw = new PrintWriter(file);
            pw.println("This will be added in the file.");
            pw.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
