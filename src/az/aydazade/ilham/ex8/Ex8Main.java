package az.aydazade.ilham.ex8;

import java.util.*;

public class Ex8Main {

    public static void main(String[] args) {

        int[] anArray = new int[20];

        for (int i = 0; i < 20; i++) {

            anArray[i] = new Random().nextInt(100);
        }

        anArray = sortedIntArray(anArray);

        for (int i = 0; i < 20; i++) {

            System.out.print(anArray[i] + " ");
        }
    }

    public static int[] sortedIntArray(int[] arr) {
        //Arrays.sort(arr);
        
        Boolean unswapped = true;

        while (unswapped) {

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) /* For descending order use < */ {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                        unswapped = false;
                    }
                }
            }
        }

        return arr;
    }
}
