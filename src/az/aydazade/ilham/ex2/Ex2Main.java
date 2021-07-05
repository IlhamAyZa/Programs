package az.aydazade.ilham.ex2;

import java.util.Scanner;

public class Ex2Main {

    public static void main(String[] args) {

        Scanner ans = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = ans.nextInt();
        System.out.print("Enter position #1: ");
        int pos1 = ans.nextInt();
        System.out.print("Enter position #2: ");
        int pos2 = ans.nextInt();
        System.out.print("Enter number of elements to swap: ");
        int leng = ans.nextInt();

        System.out.println("");
        
        int[] numberInBytes = changeToByte(number);
        
        for (int i = 0; i < numberInBytes.length; i ++){
            System.out.print(numberInBytes[i]);
        }
        
        System.out.println("");
        
        
        numberInBytes = swapBynaries(numberInBytes,  pos1,  pos2,  leng);
        
        for (int i = 0; i < numberInBytes.length; i ++){
            System.out.print(numberInBytes[i]);
        }
        
        System.out.println("");
        
        int result = changeToInt(numberInBytes);
        
        System.out.println("1Result = " + result);

    }

    public static int[] changeToByte(int number) {
        int length = (int) (number / 2);
        for(int i =0 ; ; i++){
            if ( Math.pow(2, i) > number){
                length = i;
                System.out.println(length);
                break;
            }
            
        }
       
        int[] temp1 = new int[length];
        int[] temp2 = new int[length];

        for (int i = 0; i < length; i++) {

            if (number % 2 == 0) {
                temp1[i] = 0;
            } else {
                temp1[i] = 1;
            }
            
            if (number == 0){
                break;
            }
                        
            number = (int) number / 2;
            System.out.println(number + "   \n");
        }

        for (int i = 0; i < length; i++) {
            temp2[i] = temp1[length - i - 1];
        }
        
        return temp2;
    }

    public static int changeToInt(int[] numberInBytes) {
        int result = 0;

        for (int idx = 0; idx < numberInBytes.length; idx++) {
            result += numberInBytes[idx] * Math.pow(2, idx);
        }

        return result;
    }

    public static int[] swapBynaries(int[] numberInBytes, int pos1, int pos2, int leng) {

        int tempIDX1 = 0;
//        int tempIDX2 = 0;
        int[] temp1 = new int[leng];
//        int[] temp2 = new int[leng];

        for (int idx = pos1; idx < pos1 + leng; idx++) {
            temp1[tempIDX1] = numberInBytes[idx];
            tempIDX1++;
        }

/*        for (int idx = pos2; idx < pos2 + leng; idx++) {
            temp2[tempIDX2] = numberInBytes[idx];
            tempIDX2++;
}*/

        for (int idx = 0; idx < leng; idx++) {
            numberInBytes[idx + pos1] = numberInBytes[idx + pos2];
            numberInBytes[idx + pos2] = temp1[idx];
        }

        return numberInBytes;
    }

}
