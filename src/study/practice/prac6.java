package study.practice;

public class prac6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//반복문 샘플 연습
		// 출력은 반복되는 숫자(i) 를 출력
		/*
		for.
		1) i가 0~10으로 11번 반복
		2) i가 1~9로 9번 반복
		3) i가 10 ~ 100 으로 10번 반복
		4) i가 25 50 75 100 해서 4번 반복
		*/

		for(int i=0; i<=10; i++){
			System.out.println(i);
		}
		
		for(int i=1; i<=9; i++){
			System.out.println(i);
		}
		
		for(int i=10; i<=100; i=i+10){
			System.out.println(i);
		}
		
		for(int i=25; i<=100; i=i+25){
			System.out.println(i);
		}
		
		/*
		while
		5) i가 50 ~ 55로 6번 반복
		6) i가 10 ~ 1로 10번 반복
		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		*/
		
//		int i=50;
//		while(i<=55) {
//			System.out.println(i);
//			i++;
//		}
//		i=50;			//true를 쓸 거면 이렇게 해도 됨.
//		while(true) {
//			System.out.println(i);
//			i++;
//			
//			if(i<55)
//				break;
//		}
//		
//		
//		int i=10;
//		while(1<=i) {
//			System.out.println(i);
//			i--;
//		}
//		
//		int i=35;
//		while(5<=i) {
//			System.out.println(i=i-5);
//		}
//		
//		int i=35;
//		while(10<=i) {
//			System.out.println(i=i-5);
//		}
//		
//		int i=30;
//		while(5<=i) {
//			System.out.println(i=i-5);
//		}
		
		
	}

}
