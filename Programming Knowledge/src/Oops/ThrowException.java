package Oops;

import java.io.*;

public class ThrowException {

    public void throwExplained () {
        ReadAndWrite readAndWrite = new ReadAndWrite();
        try {
            readAndWrite.readFile();
            readAndWrite.saveFile();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

class ReadAndWrite {
    void readFile() throws IOException {
        FileInputStream fis = new FileInputStream("d:/abc.txt");
        fis.read();
    }

    void saveFile() throws FileNotFoundException {
        String text = "Hello World";
        FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
//        fos.write(text.getBytes(), b);
    }
}
