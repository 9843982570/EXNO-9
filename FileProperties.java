/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileproperties;
import java.io.File;
import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class FileProperties {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);

        // Getting file name from the user
        System.out.println("Enter the file name: ");
        String fileName = scanner.nextLine();

        // Creating a file object
        File file = new File(fileName);

        // Checking if the file exists
        if (file.exists()) {
            System.out.println("File exists.");

            // Checking if the file is readable and/or writable
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());

            // Getting the file type
            int index = fileName.lastIndexOf('.');
            if (index > 0 && index < fileName.length() - 1) {
                String extension = fileName.substring(index + 1).toLowerCase();
                System.out.println("File Type: " + extension);
            } else {
                System.out.println("File Type: Not Found");
            }

            // Getting the length of the file in bytes
            System.out.println("File length in bytes: " + file.length());
        } else {
            System.out.println("File does not exist.");
        }

        // Closing the scanner
        scanner.close();
    }
    
}


