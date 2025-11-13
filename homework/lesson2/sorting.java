package homework.lesson2;

import java.util.Scanner;

import homework.lesson2.utils.initialize;
import homework.lesson2.utils.menu;
import homework.lesson2.utils.sortAsc;
import homework.lesson2.utils.sortDes;

public class sorting {
    

    // 10개의 랜덤 숫자(1~99)를 생성 (중복x) (컴퓨터가 생성)
    // 10개의 숫자를 출력.

    // 1.오름차순 정렬 2.내림차순 정렬 3.초기화 4.종료

    // 1. 오름차순 정렬 이후 메뉴 다시 로드
    // 2. 내림차순 정렬 이후 메뉴 다시 로드
    // 3. 다시 10개의 숫자를 출력

    // 메뉴 함수 , 오름차순 , 내림차순 , 초기화 함수
    // switch ~case 문 사용
    //  113page (메소드 /임의의 사용자 정의 함수)

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int Menu;

        menu.printMenu();
  
        Menu = number.nextInt();

            switch (Menu) {

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
                    number.close();
                    break;
                default:
                    System.out.println("(1~4)사이의 메뉴를 선택해주세요.");
                    break;

            }

        }
        
    }
// Try ~ catch : 예외처리 :: GPT 설명듣고 JAVA ESSENTIAL ~~

