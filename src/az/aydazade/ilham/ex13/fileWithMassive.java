package az.aydazade.ilham.ex13;

import java.io.*;
import java.util.*;
 
public class fileWithMassive {

    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("ExampleFor13.txt");
            Scanner sc = new Scanner(inputStream, "UTF-8");

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());

            }

        }catch(FileNotFoundException e){
            
        }

    }
}