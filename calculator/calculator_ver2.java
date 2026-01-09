package calculator;

import java.util.Scanner;

public class calculator_ver2 {

    static Scanner number = new Scanner(System.in);
    static int number_a, number_b, sign, value;
    static float valuef;
    static String showsign;

    public static void main(String[] args) {



        
        while (true) {
            System.out.println();
            System.out.println("첫번재 값을 입력하세요");
            number_a = number.nextInt();
            System.out.println("두번재 값을 입력하세요");
            number_b = number.nextInt();

            screenCal();
            sign = number.nextInt();

            if (sign == 0) 
            return;

            System.out.println("값은"+ calculator_11((float)number_a,(float)number_b,(float)sign));

            // depth 를 알잘딱깔센 구성해야 한다.
        }
    }

    public static float calculator_11(float a, float b, float c) {
        if (c == 1)
            return a + b;
        
        if (c == 2)

            return a - b;
        if (c == 3)

            return a * b;
        if (c == 4)

            return a / b;
    
        return 0;

    }

    public static void  screenCal() {
        System.out.println("======   숫자로 입력   ====== ");
        System.out.println("====== (1).더하기 (2).빼기");
        System.out.println("====== (3).곱하기 (4).나누기");
    }

  
}
