package Lac3;

import java.util.Scanner;

public class pattern32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row =1;
        int star= 1;
        int val =row;

        while (row <= 2*n-1){

            int i = 1;

            while (i <= star) {
                if (i % 2 == 0) {
                    System.out.print("* "+ " ");
                } else {
                    System.out.print(val + " ");
                }
                i++;
            }
                if (row < n) {
                    star+=2;
                    val++;

                } else {
                    star-=2;
                    val--;

                }

            row++;
            System.out.println();
        }
        
    }
}
