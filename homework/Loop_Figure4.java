package homework;

import java.util.Scanner;

public class Loop_Figure4 {

    public static void main(String[] arg) {

        // ==========================================================================
        // 역트리모양으로 점점 차감되는 도형

        Scanner number = new Scanner(System.in);
        int i, j, l=1;
        System.out.println("몇단으로 구성할까요?");
        int m = number.nextInt();
        int n = m+1;

        for(j=1; j<n; j++){

            for(l=2; l<=j; l++){
                System.out.print(" ");
            
            }

            for(i=1; i<=(n-j)*2-1; i++){
                System.out.print("*");
            }

            for(l=2; l<=j; l++){
                System.out.print(" ");
            
            }

            System.out.println();
        }

        number.close();
    
    
        // ==========================================================================
    
        // m 3 j1 j<3+1
        // l 2 l2 x
        // i 1 i5 *****

        // m 3 j2 j<3+1
        // l 2 l2 0
        // i 1 i3 ***

        // m 3 j3 j<3+1
        // l 2 l2 00
        // i 1 i1 *


    }


}


