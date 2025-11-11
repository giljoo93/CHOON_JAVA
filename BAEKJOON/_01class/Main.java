package BAEKJOON._01class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m ;

        for (m=0; m < n/4; m++){
            System.out.print("long ");
        }
        System.out.print("int");
        

        input.close();

    }

}
