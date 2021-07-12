package az.aydazade.ilham.ex8;

import static java.lang.Math.*;
import java.util.*;

public class Ex8Main {
        
    public static void main(String[] args) {
    
        ArrayList<Integer> anArrayList = new ArrayList<Integer>(20);

        for (int i = 0; i < 20 ; i++){
            
            anArrayList.add(new Random().nextInt(100));
        }
        
        System.out.println(anArrayList);
    }
}
