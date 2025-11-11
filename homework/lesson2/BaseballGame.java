package homework.lesson2;

import java.util.Scanner;

public class BaseballGame {
    

    //3개 숫자 랜덤 변수 저장

    public static void main(String[] arg){

        // double randomValue = Math.random();
        // int randomInt = (int)(Math.random()*100);

        // System.out.println("랜덤 실수 : " + randomValue);
        // System.out.println("랜덤 정수: " + randomInt);



        // // 스왑 -------
        // int a = 10 ;
        // int b = 20 ;
        // int c ; //스왑을 위한 변수명 temp;

        // c = a;
        // a = b;
        // b = c;
        
        // System.out.println(a + " " + b);



        // 1 차원 배열 --------

        Scanner scanner = new Scanner(System.in);

        
        int sum = 0;
        System.out.println("숫자를 입력하시오.");
        int n;
        
        

        n = scanner.nextInt();

        // for(int i=1; i<=n; i++) {
    
        //     sum = sum + i;
        // }


        sum = n*(n+1) /2; 

        // for(int i=0; i<5; i++) {
        //     sum+= intArray[i];
        // }

        System.out.print("입력된 배열의 총합은 " + sum + "입니다.");

        scanner.close();



    }


    //1~10회차 반복 :숫자 3개를 입력

    //strike,ball 판별

    //


}
