package Lac4_practice;

import java.util.Scanner;

public class brak_statement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        int i=2;

        while (i<n){

            if (n%i == 0){
                count++;
                break;
            }
            i++;

        }
        if (count==0){
            System.out.println("Prim");
        }
        else {
            System.out.println("Not prime");
        }

    }
}
