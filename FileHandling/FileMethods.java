package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) throws IOException {
        File file = new File("Helloworld.txt");
        FileWriter writer = new FileWriter("Helloworld.txt");
        FileReader reader = new FileReader("Helloworld.txt");

        file.createNewFile();
        try {
            if (file.exists()) {
                System.out.println("The file exists.");
                if (file.canWrite()) {
                    writer.write("Hello world, My name is Ashwin Dhougoda.I am going to become a good software developer in the near future.\nThis is my first file write and read.");
                    System.out.println("Written to file: " + file.getPath());
                    writer.close();
                } else {
                    System.out.println("Couldn't write to the file.");
                }
                //Read contents of file. -1 indicate end of file.
                System.out.println();
                System.out.println("Reading contents of the file: ");
                int ch = reader.read();
                while (ch != -1) {
                    System.out.print((char) ch);
                    ch = reader.read();
                }


            } else {
                System.out.println("The file does not exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            System.out.println("\n\nFile handling complete.");
            writer.close();
            reader.close();
        }
    }
}


