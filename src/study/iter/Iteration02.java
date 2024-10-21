package study.iter;

public class Iteration02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(초기; 조건; 증감) {
//			실행문;
//		}
//		
//		while(조건) {
//			실행문;
//		}
		
		
		for(int i=1; i<=5; i++) {
			System.out.println("피곤하다");
		}
		
		int j=1;
		while(j<=5) {
			System.out.println("졸리다");
			j++;
		}
		
//		while(true) {
//			System.out.println("무한");
//		}
		
		int k=10;
		do {
			System.out.println("k do while");
		} while(k<5);
		
		
		k=1;
		while(true) {
			//무한루프
			k++;
			
			
			
			if(k == 10) {
				break; //for, while, switch문에서 다 쓸 수 있음
			}
			System.out.println(k);
			
		}
		
		System.out.println("----------------------");
		
		for(int i=1; i<=10; i++) {
			
			if(i == 5)
				continue; //밑에 있는 출력 부분을 생략하는 기능, 그래서 출력하면 5는 안 나옴 -> 한 턴을 넘기는 거
			
			System.out.println(i);
		}
		
		
	}
	
	
	
	
	

}
