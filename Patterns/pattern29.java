package Lac3;

import java.util.Scanner;

public class pattern29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n-1;

        while (row <= n){
            //space
            int i=1;
            while (i <= space){
                System.out.print("  ");
                i++;
            }
            // star
            int j= 1;
            int val =row;

            while (j <= star){

                if(j==1|| j== star){
                    System.out.print(val + " ");
                }
                else {
                    System.out.print("0 ");
                }
                j++;

            }
            row++;
            System.out.println();
            space--;
            star +=2;
        }
    }
}
