package study.practice;

import java.util.Scanner;

public class prac9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		국어, 영어, 수학 => 합계, 평균 -> 합격/ 불합격
//				(합격 조건 : 세 과목의 점수가 각각 40점 이상, 평규 60점 이상)
//				합격 : "축하합니다, 합격입니다!"
//				불합격 : "불합격입니다." 출력
		결과를 boolean으로 받기
		
		
		int k;
		int m;
		int e;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어점수: ");
		int k1 = scanner.nextInt();
		System.out.print("수학점수: ");
		int m1 = scanner.nextInt();
		System.out.print("영어점수: ");
		int e1 = scanner.nextInt();
		
		int sum;
		sum = k1 + m1 + e1 ;
		System.out.println("합계: " + sum);
		
		int arg;
		arg = (k1+m1+e1)/3 ;
		System.out.println("평균: " + arg);
		
		if(k1>=40 && m1 >= 40 && e1 >= 40 && (k1+m1+e1)/3>=60) {
			//System.out.println("축하합니다. 합격입니다!");
			return true;
		} else {
			//System.out.println("불합격입니다.");
			return false;
		}
		
		
		boolean result = pass(k1, m1, e1);
		
		if(result) {
			
		}else(result)
		
	}

}
