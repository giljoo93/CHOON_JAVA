package homework.lesson2.utils;

import java.util.Scanner;

public class menu {

    public static void printMenu() {

        Scanner number = new Scanner(System.in);

        int menu;
        boolean RunningMenu = true;
        while (RunningMenu) {
            System.out.println();
            System.out.println();
            System.out.println("=====================================");
            System.out.println("     10개 랜덤 정수 정렬 프로그램    ");
            System.out.println("-------------------------------------");
            System.out.println("1.오름차순 2.내림차순 3.초기화 4.종료");
            System.out.println("(원하는 메뉴 번호를 입력해주세요)    ");
            System.out.println("=====================================");
            System.out.println();
            
            menu = number.nextInt();

            switch (menu) {

                case 1:
                    sortAsc.SA();
                    break;
                case 2:
                    sortDes.SD();
                    break;
                case 3:
                    initialize.IL();
                    break;
                case 4:
                    System.out.println("4.프로그램 종료");
                    RunningMenu = false;
                    break;
                default:
                    System.out.println("(1~4)사이의 메뉴를 선택해주세요.");
                    break;

            }

        }
        number.close();

    }

}
