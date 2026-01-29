package dailyStudy._0119;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {

	// static LocalDate setTime = LocalDate.now();
	static Scanner userInput = new Scanner(System.in);
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	public static void main(String[] args) throws IOException {
		
		//bookList.txt 생성
		File file = new File("bookList.txt");
		if(file.exists()) {}else {file.createNewFile();}
		
		Book book = new Book();
		while (true) {
			book.readDB();
			System.out.println("도서관리 프로그램입니다.");
			System.out.println("1.도서조회");// 오름차순,내림차순 정렬(버블)
			System.out.println("2.도서대여");
			System.out.println("3.도서반납");
			System.out.println("4.도서추가");
			System.out.println("5.도서삭제");
			System.out.println("6.도서검색");
			System.out.println("0.종료");

			System.out.print(">>");
			int menu = userInput.nextInt();

			switch (menu) {

			case 1:
				book.showBook();
				break;
			case 2:
//				미구현
				break;
			case 3:
//				미구현
				break;
			case 4:
				book.addBook();
				book.saveDB();
				break;
			case 5:
				book.deletebook();
				book.saveDB();
				break;
			case 6:
				break;
			case 0:
				System.out.println("도서관리 프로그램을 종료합니다.");
				return;
			default:
			}
		}

	}

}
