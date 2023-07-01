package Lac3;

import java.util.Scanner;

public class pattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int row= 1;
        int star= n;
        int k=n;

        while (row <= n){

            //star
            int i= 1;
            int val= n;

            while (i <= star){
            if (i==k){
                System.out.print("* ");
            }

            else
                System.out.print(val + " ");
                i++;
                val--;
            }

            row++;
            k--;
            System.out.println();
        }

    }
}
