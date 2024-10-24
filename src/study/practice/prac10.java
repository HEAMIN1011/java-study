package study.practice;

import java.util.Scanner;

public class prac10 {

	private static int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
//		1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
//		System.out.println("정수를 입력하세요 : ");
//		int num = scanner.nextInt();
//		
//		if(num%2 == 0) {
//			System.out.println("even");
//		} else if(num%2 != 0) {
//			System.out.println("odd");
//		}
//
//		2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
//		System.out.println("정수를 입력하세요 : ");
//		int num = scanner.nextInt();
//		
//		if(num%7 ==0) {
//			System.out.println("7의 배수입니다.");
//		} else {
//			System.out.println("아닙니다.");
//		}
		
//		3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
//		int sum = 0;
//		for(int i = 1; i<=1000; i++) {
//			if(i%5 == 0) {
//			sum = sum + i;}
//		} System.out.println("이 중 5의 배수의 합은? " + sum);
		
		//이렇게 해도 됨
//		sum=0;				
//		for(int i=5; i<=1000; i=i+5) {
//			sum = sum + i
//		}
		
		//while문으로 해도 됨
//		sum=0;
//		int i = 1;
//		while(i<=1000) {
//			if(i%5 == 0)
//				sum = sum + 1;
//			
//			i++;
//		}
		
				
//		4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
//		ex) 입력 : 10
//		결과 : **********
		
//		System.out.print("입력 : ");
//		int num = scanner.nextInt();
//		
//		if(num <=50) {
//			for(int i=1; i<=num; i++) {
//			System.out.print("*");
//			}
//		}

//		5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
//		ex) 1 - 2 + 3 - 4 .....
		
//		홀수 : +1+3+5+7+9 : 25
//		짝수 : -(2+4+6+8+10) : -30
		
//		int sum = 0;
//	    for(int i=1; i<=10; i+=2) {
//	         sum = sum + i;
//	      }
//	      for(int i=2; i<=10; i+=2) {
//	         sum = sum - i;
//	      }
//	      System.out.println("결과: " + sum);
		

//		6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
//		1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.
//		int sum = 0;
//		int i=1;
//		
//		while(sum < 1000) {
//			sum = sum + i++;
//		}
//		System.out.println("결과 : " + sum);
		
//
//		7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
//		ex) 입력 3
//		3 * 1 = 3
//		3 * 2 = 6
//		3 * 3 = 9
//		...
//		3 * 9 = 27
		
	      System.out.print("구구단 입력: ");
	      int num = scanner.nextInt();

	      if( 1 <= num && num <= 9) {
	         for(int i=1; i<=9; i++) {
	            System.out.printf("%d * %d = %d\n", num, i, num*i );
	         }
	      }

		
		
	}
	

}
