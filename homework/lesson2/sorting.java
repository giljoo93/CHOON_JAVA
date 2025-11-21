package homework.lesson2;

import java.util.Scanner;

import homework.lesson2.utils.initialize;
import homework.lesson2.utils.menu;
import homework.lesson2.utils.sortAsc;
import homework.lesson2.utils.sortDes;

public class sorting {
    

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int choice;

        initialize init = new initialize(); // 객체생성
        
        while (true) {
        
        
        menu.printMenu();
  
        choice = number.nextInt();

            switch (choice) {

                case 1:
                    sortAsc.SA();
                    break;
                case 2:
                    sortDes.SD();
                    break;
                case 3:
                    init.IL();
                    break;
                case 4:
                    System.out.println("4.프로그램 종료");
                    number.close();
                    System.exit(0);
                default:
                    System.out.println("(1~4)사이의 메뉴를 선택해주세요.");
                    break;

            }

        }
        
    }

}
// Try ~ catch : 예외처리 :: GPT 설명듣고 JAVA ESSENTIAL ~~

