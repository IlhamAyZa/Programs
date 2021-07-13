package az.aydazade.ilham.ex8;

import java.util.*;

public class Ex8Main {

    public static void main(String[] args) {

        int[] anArray = new int[10000];
        
        int[] anArray1 = new int[10000];
        int[] anArray2 = new int[10000];
        int[] anArray3 = new int[10000];
        int[] anArray4 = new int[10000];

        for (int i = 0; i < 10000; i++) {

            anArray[i] = new Random().nextInt(100);
        }

        Date time1 = new Date();

        anArray1 = sortedIntArrayBubble(anArray);

        Date time2 = new Date();

        System.out.println("Time for bubble sort: " + (time2.getTime() - time1.getTime()));

        Date time3 = new Date();

        anArray2 = sortedIntArraySection(anArray);

        Date time4 = new Date();

        System.out.println("Time for selection sort: " + (time4.getTime() - time3.getTime()));

        Date time5 = new Date();

        anArray3 = sortedIntArrayInsertion(anArray);

        Date time6 = new Date();

        System.out.println("Time for insertion sort: " + (time6.getTime() - time5.getTime()));

        Date time7 = new Date();

        anArray4 = sortedIntArrayMerge(anArray);

        Date time8 = new Date();

        System.out.println("Time for merge sort: " + (time8.getTime() - time7.getTime()));

        for (int i = 0; i < 10000; i++) {

            System.out.print(anArray[i] + " ");
            
            if ( i > 1 && i % 50 == 0){
                System.out.println("\n");
            }
        }
    }

    public static int[] sortedIntArrayBubble(int[] arr) {
        Boolean unswapped = true;

        while (unswapped) {

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
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

    public static int[] sortedIntArraySection(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] sortedIntArrayInsertion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        return arr;
    }

    public static int[] sortedIntArrayMerge(int[] arr) {
        int n = arr.length;

        int output[] = new int[n];

        int count[] = new int[256];
        for (int i = 0; i < 256; ++i) {
            count[i] = 0;
        }

        for (int i = 0; i < n; ++i) {
            ++count[arr[i]];
        }

        for (int i = 1; i <= 255; ++i) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        for (int i = 0; i < n; ++i) {
            arr[i] = output[i];
        }

        return arr;
    }
}
