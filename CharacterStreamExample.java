/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package character.streamexample;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/**
 *
 * @author ELCOT
 */
public class CharacterStreamExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          try {
            Writer writer = new FileWriter("binaryFile.txt");
            String data = "This is an example of writing to a binary file using Character Stream.";
            writer.write(data);
            writer.close();
            System.out.println("Data has been written to the binary file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}


