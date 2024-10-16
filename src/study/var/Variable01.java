package study.var;

public class Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수 선언 내용
		int number1; //정수형 숫자 변수
		int floor; //선언만 한 거임, 값 X
		
		int x,y,z;
		
		int score; //선언만 한 거
		int point = 50; //선언 + 값 저장 = 초기화 했다.
		
		score = 90;
		
		//level = 99; 선언 안 한 변수명 사용 불가능
		
		//time = 16; 변수 선언 이전에는 사용 불가능
		int time;
		time = 16;
		
		int minute = time + 9;
		
		//int myFloor = floor + 7; 값이 없는 변수를 계산할 수 없음
		
		int totalScore = point + score + point + score;
		
		System.out.println("출력합니다.");
		System.out.println(totalScore);
		System.out.println(totalScore + point);
		
		System.out.println(totalScore);
		
		totalScore = totalScore + point;
		System.out.println(totalScore);
		
		x = 10;
		y = x;
		z = x + y;
		

		int a = 10;
		int b = 20;
		
//		서로 값 바꾸기 실패
//		a = b; //a:20 b:20
//		b = a; //a:20 b:20
		
		int c = a; //a:10 b:20 c:10
		a = b; 	//a:20 b:20
		b = c;	//b:20 c:20
	}

}
