package homework;

import java.util.Scanner;

public class Loop_Figure3 {

    public static void main(String[] arg) {

        // ==========================================================================
        // 트리모양으로 점점 증감되는 도형

        Scanner number = new Scanner(System.in);
        int i, j, l=1;
        System.out.println("몇단 트리를 만들까요?");
        int m = number.nextInt();
        int n = m+1;

        for(j=1; j<n; j++){

            for(l=1; l<=m-j; l++){
                System.out.print(" ");
            
            }

            for(i=1; i<=j*2-1; i++){
                System.out.print("*");
            }

            for(l=1; l<=m-j; l++){
                System.out.print(" ");
            
            }

            System.out.println();
        }

        number.close();
    
    
        // ==========================================================================
    }

}


