package homework;

import java.util.Scanner;

public class Loop_Figure6 {

    public static void main(String[] arg) {

        // ==========================================================================
        // 다이아몬드꼴 도형의 반복

        Scanner number = new Scanner(System.in);
        int i, j, l = 1;
        System.out.println("마름모의 층을 몇으로 할까요?(이등변 삼각형 높이)");
        int m = number.nextInt();
        int n = m + 1;
        System.out.println("마름모의 개수를 몇개로 할까요?");
        int z = number.nextInt();
        int y;

        for (j = 1; j < n; j++) {

            for (y = 1; y <= z; y++) {

                for (l = 1; l <= m - j; l++) {
                    System.out.print(" ");

                }

                for (i = 1; i <= j * 2 - 1; i++) {
                    System.out.print("*");
                }

                for (l = 1; l <= m - j; l++) {
                    System.out.print(" ");

                }

            }

            System.out.println();
        }

        for (j = 2; j < n; j++) {

            for (y = 1; y <= z; y++) {

                for (l = 2; l <= j; l++) {
                    System.out.print(" ");

                }

                for (i = 1; i <= (n - j) * 2 - 1; i++) {
                    System.out.print("*");
                }

                for (l = 2; l <= j; l++) {
                    System.out.print(" ");

                }

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
