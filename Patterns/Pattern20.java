package lac2_practice;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        int space=n/2;
        int star= 1;


        while (row <=n){
            //space
            int i=1;
            while (i<= space) {

                System.out.print("  ");
                i++;
            }
            //star
            int j=1;
            while (j<= star) {
                if(j==1 || j== star) {
                    System.out.print("*" + " ");
                }
                else {
                    System.out.print("  ");
                }
                    j++;
            }

            //mirror
            if(row<= n/2){
                star +=2;
                space --;

            }
            else {
                star -=2;
                space ++;


            }
            row++;
            System.out.println();
        }
    }
}
