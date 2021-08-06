package az.aydazade.ilham.ex13;

import java.io.*;

public class fromOneFileToAnother {

    public static void main(String[] args) {
        File file1 = new File("ExampleFor13.txt");
        File file2 = new File("fileForEx.txt");

        FileOutputStream fos = null;
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file1);
            DataInputStream dit = new DataInputStream(fis);
            fos = new FileOutputStream(file2);
            DataOutputStream dot = new DataOutputStream(fos);

            for (int i = 0; i < file1.length(); i++) {
                dot.writeDouble(dit.readDouble());
            }

        } catch (FileNotFoundException ex) {
            System.out.println("TRY #1, Ex #1");
            // Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("TRY #1, Ex #2");
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fis != null && fos != null) {
                try {
                    fos.flush();
                    fos.close();
                    fis.close();
                } catch (Exception e) {
                }
            }
        }
        
        try {
            fis = new FileInputStream(file2);
            DataInputStream dit = new DataInputStream(fis);
            
            for (int i = 0; i < file2.length(); i++){
                System.out.println(dit.readDouble());
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("TRY #2, Ex #1");
            // Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("TRY #2, Ex #2");
            // Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                }
            }
        }

    }
}
