package lac2_practice;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int row = 1;
        int star= n;

      // how many rows
          while (row<= n){
            //how many stars eg:- *****

            int i=1; //initialisation

            while (i<= star) //condition
            {
                System.out.print("*" + " ");

                i++; // re-initialization

            }
            // next row preparation
              // i) increment of row , ii) line change take place
            row++;
            System.out.println();
        }
    }
}
