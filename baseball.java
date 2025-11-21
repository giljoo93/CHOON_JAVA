import java.util.Scanner;

public class baseball {

    public static void main(String[] args) {

        int start = 1, R = 1, i = 0, j = 0;
        int computer, user = 0;
        String computerStr, userStr, temp;
        String computerArray[] = new String[3];
        String userArray[] = new String[3];
        int strike = 0, ball = 0, out = 0, outCount = 0;
        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.println("숫자 야구 게임 :: 시작하시려면 '0'을 입력하세요.");
            R = 1;
            computer = (int) (Math.random() * 100000000);
            computerStr = Integer.toString(computer);
            temp = computerStr.substring(1, 2);
            computerArray[0] = temp;
            temp = computerStr.substring(3, 4);
            computerArray[1] = temp;
            temp = computerStr.substring(5, 6);
            computerArray[2] = temp;


            start = input.nextInt();

            while (start == 0) {
                strike = 0;
                ball = 0;
                out = 0;

                System.out.println(R + "회차 게임 시작합니다!");

                System.out.println("투수와 포수가 사인을 주고 받고 있습니다.");

                System.out.println("타자 타석에 들어와서 준비합니다.");
                System.out.println("(3자리 숫자를 입력하세요.)");
                user = input.nextInt() + 1000;
                userStr = Integer.toString(user);
                temp = userStr.substring(1, 2);
                userArray[0] = temp;
                temp = userStr.substring(2, 3);
                userArray[1] = temp;
                temp = userStr.substring(3, 4);
                userArray[2] = temp;


                for (i = 0; i < 3; i++) {

                    for (j = 0; j < 3; j++) {
                        if (j==0){outCount=0;}

                        if (userArray[i].equals(computerArray[j])) {

                            if (i == j) {

                                strike++;

                            } else {

                                ball++;

                            }

                        } else {

                            outCount++;
                            
                            if (outCount == 3) {
                                outCount = 0;
                                out++;
                            }

                        }

                    }

                }

                if (strike == 3) {
                    System.out.println("홈런입니다!");
                    System.out.println("경기의 승리를 거머쥐었습니다.");
                    start = 1;
                    
                } else {

                    System.out.println("힘껏 칩니다!");
                    System.out.println(strike + " Strike, " + ball + " ball, " + out + " out!");
                }

                R++;

            }

        }

    }

}

// ===============================

// 문자열을 이용해서, 사용 할 것.
// 계산기 만들기.

// ===============================
