package lac2_practice;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int row =1;
        int star =n;

        while (row <= n){

            //star
            int i= 1;
            while (i<=star){
                System.out.print("*" + " ");
                i++;
            }
            row++;
            System.out.println();
            star--;
        }
    }
}
