package study.quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//퀴즈
//		//1번. num 값을 확인하여 "양수" "음수" "0" 이라고 출력하도록 코드를 작성하세요.
//		int num = 10;
//		System.out.println( _______);
		
//		int num = 0;
//
//		String result = (num <0 ) ? "음수" : ( num > 0) ? "양수" :(num==0)?  "0" : "";
//		System.out.println(result);
//
//		//2번. 아래와 같이 프로그램이 진행되면서 숫자 2개를 입력받고 각각의 결과를 출력하세요.
//		// ㅇ 모양은 사용자가 입력한 숫자와 계산된 결과입니다.
//		// 나누기 결과는 소수점을 포함하여 나타나도록 해주세요.
//		첫번째 숫자를 입력하세요 : ㅇ
//		입력한 숫자=ㅇ
//		두번째 숫자를 입력하세요 : ㅇ
//		입력한 숫자=ㅇ
//
//		더하기 : ㅇ+ㅇ=ㅇㄱㅇ
//		뺴기 : ㅇ-ㅇ=ㅇ
//		곱하기 : ㅇ*ㅇ=ㅇ
//		나누기 : ㅇ/ㅇ=ㅇ
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int one = scanner.nextInt();
		System.out.println(one);
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int two = scanner.nextInt();
		System.out.println(two);
		
		int result = one + two ;
		System.out.println( " 더하기 : " + result);
		
		int result2 = one - two;
		System.out.println( " 빼기 : " + result2);
		
		int result3 = one*two;
		System.out.println( " 곱하기 : " + result3);
		
		double result4 = (double)one/(double)two ;
		System.out.println( " 나누기 : " + result4);
	}

}
