package study.var;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();   // 10\n
		
		System.out.println(num);
		System.out.println( num == 10); // 결과값이 T / F 로 나옴
		// == 같다를 의미하는 비교연산자
	
		scanner.nextLine(); //엔터까지 입력을 받아라 -> 남은 \n 청소용
		
		String str = scanner.nextLine(); // \n
		
		System.out.println(str);
		System.out.println(str == "밥"); //문자열을 비교할 땐 == 이 아니라 equals() 로 비교해야 함!!!
				
		System.out.println(str.equals("밥"));
		System.out.println("밥".equals(str));
	}
}
