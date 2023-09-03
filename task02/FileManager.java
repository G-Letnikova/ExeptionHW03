package task02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public void copyAnyFile (String path) throws IOException {
        try (FileReader reader = new FileReader(path);
            FileWriter writer =  new FileWriter("task02\\fileCopy.txt")) {
                while (reader.ready()) {
                    writer.write(reader.read());
                }          
        System.out.println("копирование выполнено успешно.");
        } catch (IOException e) {
            throw new IOException(e);
        }
    }


    public void readAnyFile (String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null;
            String text = "";

            while ((line = reader.readLine()) != null) {
                text += line + "\n";
            }        
            System.out.println("чтение выполнено успешно.");
            System.out.println(text);
        
        } catch (IOException e) {
            throw new IOException(e);
        }     
    }
    public void writeAnyFile (String text, String path) throws IOException {
        try (FileWriter writer =  new FileWriter(path)) {
            writer.write(text);      
            System.out.println("запись выполнена успешно.");

        } catch (IOException e) {
            throw new IOException(e);
        } 
    }
}