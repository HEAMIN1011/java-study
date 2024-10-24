package study.practice;

import java.util.Scanner;

public class prac11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
//		1.
//		2x + 4y = 10 이 만족하는
//		모든 x, y 쌍을 구하시오.
//		(x와 y는 자연수 1~10)

//		for(int x=1; x<=10; x++) { 
//         for(int y=1; y<=10; y++) {
//            if( (2*x + 4*y) == 10) {
//               System.out.printf("x:%d,y:%d ", x, y);
//            }
//         }
//      }
//		
//		2.
//		정수 2개를 입력 받아서, 
//		아래 계산 결과를 출력하시오.
//		큰수 - 작은수
		
//		System.out.print("첫 정수 입력 : ");
//		int num1 = scanner.nextInt();
//		System.out.print("두번째 정수 입력 : ");
//		int num2 = scanner.nextInt();
//		
//		if(num1<num2) {
//			System.out.println("결과: " + (num2-num1));
//		} else {
//			System.out.println("결과: " + (num1-num2));
//		}
		
//		3.
//		윷놀이 게임
//		4개의 윷을 입력받고 결과를 출력하시오.
//		(뒷도는 없습니다!)
//		0 : 안 뒤집어진 상태
//		1 : 뒤집어진 상태
//		ex) 입력 0 0 1 0
//		결과 도
//		입력 0 1 0 1
//		결과 개
		
//		
//		if(a==0 && b==0 && c==0 & d==0) {
//			System.out.println("윶");
//		} else if((a==1 && b==0 && c==0 & d==0) || (a==0 && b==1 && c==0 & d==0) || (a==0 && b==0 && c==1 & d==0) || (a==0 && b==0 && c==0 & d==1))  {
//			System.out.println("도");
//		} else if((a==1 && b==1 && c==0 & d==0) || (a==1 && b==0 && c==1 & d==0) || (a==1 && b==0 && c==0 & d==1) || (a==0 && b==1 && c==1 & d==0) || (a==0 && b==1 && c==0 & d==1) || (a==0 && b==0 && c==1 & d==1)) {
//			System.out.println("개");
//		} else if((a==1 && b==1 && c==1 & d==0) || (a==1 && b==1 && c==0 & d==1) || (a==0 && b==1 && c==1 & d==1) || (a==1 && b==0 && c==1 & d==1)){
//			System.out.println("걸");
//		} else {
//			System.out.println("모");
//		}
//		
		
//		a + b + c + d = 0 윶
//		a + b + c + d = 1 도
//		a + b + c + d = 2 개
//		a + b + c + d = 3 걸
//		a + b + c + d = 4 모
		/*
		int a1, a2, a3,a4;
		
		System.out.print("입력: ");
		a1 = scanner.nextInt();
		a2 = scanner.nextInt();
		a3 = scanner.nextInt();
		a4 = scanner.nextInt();
		
		int sum = a1+a2+a3+a4;
		*/
		
		int[] yArr = new int[4];		//index: 0 1 2 3
		int count = 0;
		System.out.println("입력: ");
		
		for(int i=0; i<yArr.length; i++) {
			yArr[i] = scanner.nextInt();
			//   1
			count += yArr[i];
			//			1
		}
		
		/*
		int[] yArr = new int[4];
		for(int i=0; i<yArr.length; i++) {
			yArr[i] = scanner.nextInt();
		}
		
		int count = 0;
		for(int i=0; i<yArr.length; i++) {
			//i: 0 1 2 3 
			count = count + yArr[i];
			//				yArr[0] yArr[1] yArr[2] yArr[3]
		}
		*/
		
//		switch(sum) {
//		case 0 :
//			System.out.println("도");
//			break;
//		case 1 :
//			System.out.println("개");
//			break;
//		case 2 :
//			System.out.println("걸");
//			break;
//		case 3 :
//			System.out.println("윷");
//			break;
//		default:
//			System.out.println("모");
//		}
		
	
				
		
		
		
//
//		4. 입력받은 수 만큼 별 출력하기
//		ex) 4
//		****
//		5
//		*****
//		System.out.print("입력 : ");
//		int num = scanner.nextInt();
//		
//			for(int i=1; i<=num; i++) {
//			System.out.print("*");
//		}
		
		
	}

}
