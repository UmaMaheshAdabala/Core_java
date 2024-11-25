package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

// We can write into File in 3 ways

// 1. FileOutputStream
// 2. FileWriter
// 3. BufferedWriter

public class WriteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("./sample.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        // FileOutputStream

        FileOutputStream fos = new FileOutputStream(file);

        String tobeWritten = "Hi Hello bro!!";

        for (char ch : tobeWritten.toCharArray()) {
            fos.write((int) ch);
        }

        fos.close();

        // File Writer

        FileOutputStream fw = new FileOutputStream(file);

        for (char ch : tobeWritten.toCharArray()) {
            fw.write((int) ch);
        }

        fw.close();

        // BufferedWriter
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        bw.write(tobeWritten);

        bw.close();
    }
}
