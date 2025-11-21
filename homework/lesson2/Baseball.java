package homework.lesson2;

import java.util.Scanner;

public class Baseball {

    static int button, computerNumber, humanNumber;
    static Scanner push = new Scanner(System.in);

    public static void main(String[] args) {

        printMenu();
        button = push.nextInt();
        
        switch (button) {
                  
            default:

                computerRandom();
                System.out.println("Play game!");
                System.out.println("3가지 숫자가 정해졌습니다.");
                System.out.println(computerNumber);
                System.out.println("3자리 숫자를 입력해주세요.");
                humanNumber = push.nextInt();
                break;
        }
        

    }

    public static void printMenu() {


            System.out.println(":: B a s e   b a l l   G a m e ::");
            System.out.println(" ○ ● ○ ●  ○ ● ○ ●  ○ ● ○ ●  ○ ● ○ ●");
            System.out.println("○ ● ○ ●  ○ ● ○ ●  ○ ● ○ ●  ○ ● ○ ●");
            System.out.println(" ● ○ ● ○  ● ○ ● ○  ● ○ ● ○  ● ○ ● ○");
            System.out.println("● ○ ● ○  ● ○ ● ○  ● ○ ● ○  ● ○ ● ○");
            System.out.println("Press any key to continue!!!");
            
        

    }

    public static void computerRandom() {
        
        computerNumber = (int)Math.random()*100;

    }

    public static void humanRandom() {
        
       

    }
}
