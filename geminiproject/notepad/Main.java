package geminiproject.notepad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Notepad notepad = new Notepad(); // 사용자 구현 필요

        while (true) {
            System.out.println("\n--- 콘솔 메모장 ---");
            System.out.println("1. 메모 작성");
            System.out.println("2. 메모 목록 보기");
            System.out.println("3. 특정 메모 보기"); // 나중에 구현
            System.out.println("4. 종료");
            System.out.print("선택: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("새 메모를 입력하세요: ");
                    String content = scanner.nextLine();
                    notepad.addNote(content); // 사용자 구현 필요
                    System.out.println("메모가 작성되었습니다.");
                    break;
                case "2":
                    // 사용자 구현 필요: notepad.getNotes() 호출하여 출력
                    System.out.println("\n--- 메모 목록 ---");
                    /*
                    for (Note note : notepad.getNotes()) {
                        System.out.println(note);
                    }
                    if (notepad.getNotes().isEmpty()) {
                        System.out.println("작성된 메모가 없습니다.");
                    }
                    */
                    System.out.println("메모 목록 표시 기능은 Notepad 클래스 구현 후 사용할 수 있습니다.");
                    break;
                case "3":
                    System.out.println("특정 메모 보기 기능은 나중에 구현합니다.");
                    break;
                case "4":
                    System.out.println("메모장을 종료합니다.");
                    scanner.close();
                    return; // 프로그램 종료
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}
