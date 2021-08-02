package az.aydazade.ilham.ex13;

import java.io.*;
import java.util.*;

public class InputDoubleIntoFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("fileForEx.txt");

                Scanner scn = new Scanner(System.in);

      System.out.print("Enter a number: ");
      double input = scn.nextDouble();
//        double input = 1;
        System.out.print("");
        
//        FileOutputStream fileOS = new FileOutputStream(file.getPath());
//        DataOutputStream dataQS = new DataOutputStream(fileOS);
//        dataQS.writeDouble(input);
//        dataQS.close();

  
        FileWriter writer = new FileWriter(file);
            
        writer.write(String.valueOf(input));
        writer.append('\n');
        writer.flush();
        writer.close();

        System.out.println("Printing file:");
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
