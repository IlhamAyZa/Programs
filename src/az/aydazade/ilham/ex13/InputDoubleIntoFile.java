package az.aydazade.ilham.ex13;

import java.io.*;
import java.util.*;

public class InputDoubleIntoFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("fileForEx.txt");

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scn.nextLine();
        System.out.print("");
        
        FileWriter writer = new FileWriter(file);
            
        writer.write(input);
        writer.append('\n');
        writer.flush();
        writer.close();
        
        FileReader reader = new FileReader(file);
        Scanner scn_file = new Scanner(file);
        
        int i = 1;
        
        while (scn_file.hasNextLine()) {
            System.out.println(i + " : " + scn_file.nextLine());
            i++;
        }
        
        reader.close();
    }
}
