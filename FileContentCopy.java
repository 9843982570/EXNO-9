/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filecontentcopy;
import java.io.*;
/**
 *
 * @author ELCOT
 */
public class FileContentCopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            // Creating a BufferedReader object to read the input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            // Creating a BufferedWriter object to write to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            // Reading lines from the input file until the end is reached
            while ((line = reader.readLine()) != null) {
                // Replacing extra spaces with single space
                String trimmedLine = line.replaceAll("\\s+", " ");
                // Writing the modified line to the output file
                writer.write(trimmedLine);
                // Writing a new line to maintain the original format
                writer.newLine();
            }

            // Closing the reader and writer
            reader.close();
            writer.close();

            System.out.println("File content copied successfully with unnecessary spaces removed.");

        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
    
}



