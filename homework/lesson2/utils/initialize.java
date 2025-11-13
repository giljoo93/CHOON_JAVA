package homework.lesson2.utils;

public class initialize {
    // 초기화 및 배열에 10가지 숫자 받기

    protected int i, n, m;
    protected boolean t = true;
    protected static int randomArray[] = new int[10];

    public void IL() {
        t=true;

        while (t) {

            for (i = 0; i < 10; i++) {
                randomArray[i] = (int) (Math.random() * 100);
                System.out.println("make number");
                // 숫자 생성
            }

            m = 0; // 겹치는 것이 있는 회수

            for (i = 0; i < 10; i++) {
                for (n = 1; n <= 9 - i; n++) {
                    if (randomArray[i] == randomArray[i + n]) {
                        m++;
                        System.out.println("test number");
                    }

                }
            }

            if (m == 0) {
                t = false;
                System.out.println("finish numbering");
            }

        }
  
        for (i = 0; i < 10; i++) {
            System.out.print(randomArray[i] + " ");
        }
    
    }

    public void showNumber() {
        for (i = 0; i < 10; i++) {
            System.out.print(randomArray[i] + " ");
        }
    }
}
