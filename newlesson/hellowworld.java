package newlesson;

public class hellowworld {

    // public - 누구나 접근 가능.
    // private - 외부 접근 불가 , protected - 상속(extend) 받은 것만 가능

    // 모든 객체가 메모리를 공유 한다.
    //

    public static void hello() {

        System.out.println("Hello World-1");

    }

    public static int plus(int a, int b) {

        // int returnV = a + b ;
        // return returnV;

        return a + b;

    }

    public static int plus(int a) {

        // int returnV = a + b ;
        // return returnV;

        return a + 10;

    }

    public static int plus(String a) {

        if (a == "a") {
            return 10;
        } else {
            return 20;
        }

    }

    public static void main(String[] args) {

        System.out.println("Hello World-2");

        hello();

        System.out.println("더하기" + plus(1, 2));
        System.out.println("더하기" + plus(1));
        System.out.println(plus("b"));

    }

}


// ========== 계산기 만들기( + , - , * , / )