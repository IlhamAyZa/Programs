package az.aydazade.ilham.ex2;

import java.util.Scanner;

public class Ex2Main_v2 {

    public static void main(String[] args) {
        Scanner ans = new Scanner(System.in);

        int number = ans.nextInt();
        int pos1 = ans.nextInt();  
        int pos2 = ans.nextInt();
        int strOfMove = ans.nextInt();

        int result = swapBits(number, pos1, pos2, strOfMove);
        System.out.println("Result = " + result);
    }

    public static int swapBits(int number, int position1, int position2, int strOfMove) {
        int shift1, shift2, value1, value2;
        while (strOfMove-- > 0) {

            System.out.println(number);

            shift1 = 1 << position1;  //1001 >> 0010

            System.out.println(shift1);

            shift2 = 1 << position2;  //

            System.out.println(shift2);

            value1 = ((number & shift1));
            value2 = ((number & shift2));

            if ((value1 == 0 && value2 != 0) || (value2 == 0 && value1 != 0)) {

                if (value1 != 0) {

                    number = number & shift1;

                    number = number | shift2;
                } else {

                    number = number & (~shift2);

                    number = number | shift1;
                }
            }

            System.out.println(number);

            position1++;
            position2++;
        }

        return number;
    }
}
