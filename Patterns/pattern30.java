package Lac3;

import java.util.Scanner;

public class pattern30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row =1;
        int star = n;

        while (row <= n){
            //star
            int i = 1;
            int val = n;
            while (i<= star){
                System.out.print(val + " ");
                i++;
                val--;
            }
            row++;
            System.out.println();
        }
    }
}
