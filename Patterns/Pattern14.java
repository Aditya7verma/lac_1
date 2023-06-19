package lac2_practice;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int row= 1;
        int space =n-1;
        int star= 1;

        while (row <= 2*n-1){
            //space
            int i = 1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            //star
            int j= 1;
            while (j<=star){
                System.out.print("*" + " ");
                j++;
            }

            //mirror
            if (row < n){
                star++;
                space --;
            }
            else{
                star--;
                space++;
            }
            //Preparation for next row
            row++;
            System.out.println();
        }
    }
}
