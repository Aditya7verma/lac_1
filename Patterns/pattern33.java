package Lac3;

import java.util.Scanner;

public class pattern33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n-1;
        int val = n;

        while (row <= n){
            //space
            int i=1;
            while (i <= space){
                System.out.print("  ");
                i++;
            }
            // star
            int j= 1;
            int num = val;

            while (j <= star){

                if(j==(star/2)+1){
                    System.out.print("0" + " ");
                }
                else {
                    System.out.print(num + " ");
                }
                if(j<=star/2){
                    num++;
                }
                else {
                    num--;
                }
                j++;
            }

            row++;
            System.out.println();
            val--;
            space--;
            star +=2;
        }
    }
}
