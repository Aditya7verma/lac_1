package lac2_practice;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int row =1;
        int star=n;
        int space= -1;

        while (row<=n){
            //star
            int i=1;
            if(row==1){
                i=2;
            }

            while (i<=star){
                System.out.print("*" + " ");
                i++;
            }
            //space
            int j=1;
            while (j<=space){
                System.out.print("  ");
                j++;
            }
            //star
            int k=1;

            while (k<=star) {

                System.out.print("*" + " ");
                k++;
            }
            star--;
            space+=2;
            System.out.println();
            row++;
        }
    }
}
