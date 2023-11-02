/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bytestreamexample;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author ELCOT
 */
public class ByteStreamExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          try {
            FileOutputStream outputStream = new FileOutputStream("binaryFile.bin");
            String data = "This is an example of writing to a binary file using Byte Stream.";
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);
            outputStream.close();
            System.out.println("Data has been written to the binary file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}



