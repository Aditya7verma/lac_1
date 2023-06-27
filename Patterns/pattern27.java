package Lac3;

import java.util.Scanner;

public class pattern27 {
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
                System.out.print("\t");
                i++;
            }
            // star
            int j= 1;
            int val =1;

            while (j <= star){

                System.out.print(val + "\t");
                if(j<=star/2){
                    val++;
                }
                else {
                    val--;
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
