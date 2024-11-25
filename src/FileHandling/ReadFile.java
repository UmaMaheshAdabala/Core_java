package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// 4 Ways to read from file 
// 1. FileInputStream
// 2. Scanner
// 3. File Reader
// 4. Buffer Reader

class ReadFile {
    public static void main(String[] args) throws IOException {

        File file = new File("./sample.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        // FileInputStream

        FileInputStream fis = new FileInputStream(file);
        String s = "";
        int data;
        while ((data = fis.read()) != -1) {
            s += (char) data;
        }
        System.out.println(s);
        fis.close();

        // Scanner

        Scanner sc = new Scanner(file);
        String scannerString = "";
        while (sc.hasNextLine()) {
            scannerString += sc.nextLine() + "\n";
        }
        System.out.println(scannerString);
        sc.close();

        // FileReader

        FileReader fr = new FileReader(file);
        String fileReader = "";
        int fileData;
        while ((fileData = fr.read()) != -1) {
            fileReader += ((char) fileData);
        }
        System.out.println(fileReader);

        fr.close();

        // BufferedReader

        BufferedReader bf = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = bf.readLine()) != null) {
            System.out.println(line);
        }
    }
}