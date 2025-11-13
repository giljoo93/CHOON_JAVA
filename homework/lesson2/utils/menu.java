package homework.lesson2.utils;

public class menu{




    public static void printMenu() {

        initialize init = new initialize();
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("=====================================");
        System.out.println("     10개 랜덤 정수 정렬 프로그램    ");
        System.out.println("-------------------------------------");
        System.out.println("1.오름차순 2.내림차순 3.초기화 4.종료");
        init.showNumber();
        System.out.println();
        System.out.println("=====================================");

    }
}
