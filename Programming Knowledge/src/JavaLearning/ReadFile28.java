package JavaLearning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile28 {
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();
        readFile.readMethode();
    }
}

class ReadFile {
    public void readMethode() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:/Users/Dell/Desktop/abc.txt"));
            String line = br.readLine();
//            System.out.println(line);   // this will only read the first line. So we have to use the loop to read the whole file

            while ((line) != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                assert br != null;
                br.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
