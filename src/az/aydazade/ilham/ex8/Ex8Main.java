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

        //Bubble
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


        /*
        QuickSort 
        
        void merge(int Arr[], int start, int mid, int end) {

	int temp[] = new int[end - start + 1];

	int i = start, j = mid+1, k = 0;

	while(i <= mid && j <= end) {
		if(Arr[i] <= Arr[j]) {
			temp[k] = Arr[i];
			k += 1; i += 1;
		}
		else {
			temp[k] = Arr[j];
			k += 1; j += 1;
		}
	}

	while(i <= mid) {
		temp[k] = Arr[i];
		k += 1; i += 1;
	}

	while(j <= end) {
		temp[k] = Arr[j];
		k += 1; j += 1;
	}

	for(i = start; i <= end; i += 1) {
		Arr[i] = temp[i - start]
            }
        }


        void mergeSort(int Arr[], int start, int end) {

        if(start < end) {
		int mid = (start + end) / 2;
		mergeSort(Arr, start, mid);
		mergeSort(Arr, mid+1, end);
		merge(Arr, start, mid, end);
            }
        }
         */
        
        /*
        void sort(int arr[])
        {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
            
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        }
         */
        
        /*
        
        */
        return arr;
    }
}
