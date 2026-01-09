package dailyStudy;

public class _0108 {
	/*
	식별자란 = 클래스, 변수, 상수, 메소드에 붙이는 이름을 말한다.
	~~명 = 식별자다.
	
	식별자 이름의 규칙.
	특수문자(%,*,&,@,^ 등)
	
	 * 
	특수문자 읽는 방법 (일반적인 발음/호칭)
	- % → 퍼센트(percent), 모듈로(modulo) 연산자일 때는 "mod"
	- * → 별(star), 애스터리스크(asterisk), 곱셈 연산자일 때는 "times"
	- & → 앰퍼샌드(ampersand), 주소 연산자(address-of) 또는 AND 연산자
	- @ → 앳(at), 어노테이션(annotation, Java)에서 사용
	- ^ → 캐럿(caret), XOR 연산자 또는 제곱 표현(언어에 따라 다름)
	-- 위의 특수문자들은 식별자로 쓸 수 없음.
	
	- _ → 언더스코어(underscore)
	- $ → 달러
	-- 둘은 식별자로 사용 할 수 있음.

	특수문자 + 공백(tab, space) 식별자로 사용 할 수 없다. '_' + '$' 예외다.


	식별자로 한글을 사용 할 수 있다.
	
	if, while, class 등 자바 언어의 키워드는 식별자로 사용 할 수 없다.
	
	식별자의 첫 문자로는 숫자는 사용 할 수 없다.

	true, false, null은 식별자로 사용 할 수 없다.
	
	대소문자를 구분한다.
	
	길이의 제약이 없다.


	JAVA DATA Type.
	
	- 기본타입 : 
	
	-논리 타입-
	boolean = true / false
	
	-문자 타입-
	char = 2byte == 2^16 65,536 (-~~ ~ ~~-1)
	1byte = 8bit == 2^8 256 (-128 ~ 127)/ 
	1bit = 0 or 1  == 2^1 2
	'A' '65'
	
	-정수형 타입-
	byte 2^8 (-128 ~ 127)
	short 2byte 2^16 (-32,768 ~ 32767)
	int 4byte 2^32 4294967296( -2^31 ~ 2^31 -1)
	long 8byte 2^64 (-2^63 ~ 2^63 -1)
	
	-실수형 타입-
	float 4byte (-3.4E38 ~ ~ 3.4E38)
	double 8byte (-1.7E308 ~ 1.7E308)
	
	
	- 레퍼런스 타입 : 참조형 타입
	-문자열 타입-
	String toolName = "JDK";


	System.out.println("문자입니다." + toolName )
	
	문자입니다.JDK



	변수와 선언
	
	int price;
	
	(int - 데이터의 타입)
	(price - 변수 이름)

	- 클래스 식별자 (Class identifier)
	- 메서드 식별자 (Method identifier)
	- 변수 식별자 (Variable identifier)

	동일한 타입의 변수를 여러 개 선언 할 때, 콤마로 분리하여 나열하고,
	선언시에 초깃값(초기화==intialize)을 지정할 수 있다.

	int radius;
	double weight = 75.56;
	char c1, c2, c3='a';
	
	리터럴(literal)
	리터럴이란, 프로그램에 직접 표현한 값을 말하고, 정수, 실수, 문자, 논리, 문자열 타입 모두
	리터럴이 있으며, 예를 들면 다음과 같다.
	
	34, 42.195, '%', true, "hello"
	
	데이터의 값 == 리터럴

	정수 리터럴은 4가지의 유형이 있다.
	
	10진수 = 1~10   n = 15; (10진수) 15
	8진수 = 1~8	n = 015; (8진수) 1x8 + 5 = 13 
	16진수 = 1~16 n = 0x15 (16진수) 1x16 + 5 = 21
	2진수 = 0~1 n = 0b0101; (2진수) 5

	
	
	
	long l L
	float f F
	double d D
	
	프로그래밍 언어에서 숫자 리터럴 뒤에 붙는 l이나 f 같은 것은 
	"접미사(suffix)" 또는 **"타입 접미사(type suffix)"**라고 부릅니다
	 

	실수 리터럴
	소수점 형태나, 지수(exponent) 형태로 실수를 표현한 것입니다.
	12.
	12.0
	.1234
	1234E-4 (10의 4승)
	== 0.1234

	문자 리터럴
	단일 인용부호('')로 문자를 표현하거나, u 다음에 문자의 유니코드 값을 이용한다.
	'a' 'W' '가' '*' '3' '글'
	char a = 'a';
	char c = \uae00 (ae00 == 유니코드 상에서 '글')

	특수문자 리터럴 (escape sequence)
	

	논리타입 리터럴
	true false 10>0

	




	var 키워드

	int price = 200;
	var price2 = 200;
	
	
	지역 변수에 한정되고, 선언시 초기값을 정해줘야한다.
	
	상수
	
	static final double PI = 3.141592; 
	
	타입 변환 
	
	자동 타입 변환
	
	long m = 25;
	
	
	
	강제 타입 변환
	
	 int n = 300;
	 byte b = n; //컴파일 오류 int 타입은 byte 타입으로 자동 변환이 안됨
	 
	 byte b = (byte)n;
	 300 - max = 44
	
	 casting 이라 부른다.
	
	
	
	
	
	
*
*
*
*
*/
	
	
	
	
}
















































































