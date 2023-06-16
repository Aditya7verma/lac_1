package lac2_practice;

import java.util.Scanner;

public class Pattern8_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int space = 0;
        int space1 =n-2;
        int row =1;

        while (row <= n){

            //space
            int i=1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            //space1
            System.out.print("*" + " ");
            int j=1;
            while (j<=space1){
                System.out.print("  ");
                j++;
            }
            //This if is use for to print only 1 star in n/2+1.
            if(row != (n/2)+1){
                System.out.print("*" + " ");
            }
            if(row<= n/2){
                space++;
                space1 -=2;
            }
            else {
                space--;
                space1 +=2;
            }
            row++;
            System.out.println();
        }

    }
}
