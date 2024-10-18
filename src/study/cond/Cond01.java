package study.cond;

public class Cond01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if 문
		
		int num = 14;
		int x = 10;
		
		if(num > 10) {
			System.out.println("확인하니까");
			System.out.println("10보다 큼");
			x = 20;
			int y = 30;
		} else {
			System.out.println("10보단 안 크던데");
		}
		
		boolean b = num == 15;     //결과가 T 아니면 F로 나옴
		
		if(!b) {
			System.out.println("한번 더 보니");
			System.out.println("15랑 같음");
			int z = 10;
		}
		
		int y = 44;
		int z = 222;
		
		
		System.out.println("끝");
	}

}
