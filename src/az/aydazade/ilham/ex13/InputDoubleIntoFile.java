package az.aydazade.ilham.ex13;

import java.io.*;
import java.util.*;

public class InputDoubleIntoFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("fileForEx.txt");

        Scanner scn = new Scanner(System.in);

        //System.out.print("Enter a number: ");
        //double input = scn.nextDouble();
        double insert = 1;
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.3);
        numbers.add(3.14);
        numbers.add(4.08);
        numbers.add(6.24);
        numbers.add(7.38);

        System.out.print("");

//        FileOutputStream fileOS = new FileOutputStream(file);
//        DataOutputStream dataOS = new DataOutputStream(fileOS);
//        dataOS.writeDouble(input);
//        dataOS.close();
//        FileWriter writer = new FileWriter(file);
//            
//        writer.write(String.valueOf(input));
//        writer.append('\n');
//        writer.flush();
//        writer.close();
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(file);
            DataOutputStream dot = new DataOutputStream(fos);

            dot.writeDouble(insert);

            for (double num : numbers) {
                dot.writeDouble(num);
            }

        } catch (FileNotFoundException ex) {
            // Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                }
            }
        }

        // Printing file
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream(file);
            DataInputStream dit = new DataInputStream(fis);
            
            for (int i = 0; i < file.length(); i++){
                System.out.println(dit.readDouble());
            }
            
        } catch (FileNotFoundException ex) {
            // Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                }
            }
        }

//        System.out.println("Printing file:");
//        FileReader reader = new FileReader(file);
//        Scanner scn_file = new Scanner(file);
//
//        int i = 1;
//
//        while (scn_file.hasNextLine()) {
//            System.out.println(i + " : " + scn_file.nextLine());
//            i++;
//        }
//
//        reader.close();
    }
}
