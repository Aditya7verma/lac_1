package lac2_practice;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int row =1;
        int space =0;
        int star =n;

        while (row <= n){
            //space
            int i =1;
            while (i <= space){
                System.out.print("  ");
                i++;
            }
            //star
            int j=1;
            while (j <= star){
                System.out.print("*" + " ");
                j++;
            }
            //prep for next row
            row++;
            System.out.println();
            space +=2;
            star --;
        }
    }
}
