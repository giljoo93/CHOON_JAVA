package calculator;

import java.util.Scanner;

public class calculator {

    static Scanner number = new Scanner(System.in);

    static int number_a, number_b, sign, value;
    static float valuef;
    static String showsign;
    static boolean Running = true;

    public static void screen() {

        while (Running == true) {
            Running = false;
            topTitle();
            System.out.println("====== 값을 입력하세요 ====== ");           //숫자입력
            System.out.println("====== --> : ");
            bottomTitle();
            System.out.print("      --> ");
            number_a = number.nextInt();
            topTitle();
            System.out.println("======   숫자로 입력   ====== ");           //수식입력
            System.out.println("====== (1).더하기 (2).빼기");
            System.out.println("====== (3).곱하기 (4).나누기");
            System.out.println();
            System.out.println("====== --> " + number_a);
            bottomTitle();
            System.out.print("      --> ");
            sign = number.nextInt();
            showsign();
            topTitle();
            System.out.println("====== --> " + number_a + " " + showsign);      //숫자입력
            bottomTitle();
            System.out.print("      :: : ");
            number_b = number.nextInt();

            switch (sign) {
                case 1:
                    plus();
                    break;

                case 2:
                    minus();
                    break;

                case 3:
                    times();
                    break;

                case 4:
                    percent();
                    break;

                default:
                    break;
            }
            next();
        }

    }

    public static void plus() {

        value = number_a + number_b;
        topTitle();
        System.out.println("====== --> " + number_a + " " + showsign + " " + number_b + " = " + value);
        bottomTitle();
        return;
    }

    public static void minus() {

        value = number_a - number_b;
        topTitle();
        System.out.println("====== --> " + number_a + " " + showsign + " " + number_b + " = " + value);
        bottomTitle();
        return;
    }

    public static void times() {

        value = number_a * number_b;
        topTitle();
        System.out.println("====== --> " + number_a + " " + showsign + " " + number_b + " = " + value);
        bottomTitle();
        return;
    }

    public static void percent() {
        valuef = (float)number_a / (float)number_b;
        topTitle();
        System.out.println("====== --> " + number_a + " " + showsign + " " + number_b + " = " + valuef);
        bottomTitle();
        return;
    }

    public static void showsign() {
        switch (sign) {
            case 1:
                showsign = "+";
                return;
            case 2:
                showsign = "-";
                return;
            case 3:
                showsign = "*";
                return;
            case 4:
                showsign = "/";
                return;
            default:
                return;
        }
    }

    public static void next() {
        System.out.println("이어서 하시려면 0을 입력하세요.");
        int presszero = number.nextInt();
        switch (presszero) {
            case 0:
                Running = true;
                break;

            default:

                break;
        }
    }

    public static void topTitle() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=============================");
        System.out.println("=======사칙연산 계산기=======");
        System.out.println("======       -         ======");
        System.out.println("======     +      /    ======");
        System.out.println("======   =     *       ======");
        System.out.println();

    }

    public static void bottomTitle() {
        System.out.println("------                 ------");
        System.out.println("=============================");

    }

    public static void main(String[] args) {

        screen();

    }
}


// 파라미터를 적용해서 함수 다시 만들기.