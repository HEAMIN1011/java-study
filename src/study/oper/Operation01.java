package study.oper;

public class Operation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//산술연산
		System.out.println(1+1);
		System.out.println(9-4);
		System.out.println(3*1);
		System.out.println(7/3);  //소숫점까지 나타내려면 강제형변환 필요 ㄴㄴ 7/3.0 으로 적어주면 됨
		System.out.printf("%.2f\n", 7/3.0);
		System.out.println(9%5);
		
		//부호연산
		System.out.println(10);
		System.out.println(+10);
		System.out.println(-10);
		
		System.out.println("--------");
		
		//증감
		int x = 10;
		System.out.println(x--); //9 //++변수 +를 먼저, 변수++ +를 나중에
		System.out.println(x);
		
		int y = 20;
		System.out.println(++y);
		System.out.println(y);
		
		int z = 30;
		System.out.println(z+1);
		System.out.println(z);
		
		int q = 1;
		int w = 3;
		int e = 10 + ++q; //10 + 2 
		int r = 3 + w--; //3 + 3 -> 6 이후 w--
		
		System.out.printf("%d %d %d %d\n", q, w, e, r);
		
		boolean isFinished = false;
		System.out.println(!isFinished);
		System.out.println(isFinished);
		
		System.out.println("--------");
		
		//비교
		System.out.println( 1 == 2);
		System.out.println(1 != 2);
		System.out.println(3 < 5);
		System.out.println(4 <= 4);
		System.out.println(5 > 10);
		System.out.println(9 >= 8);
		boolean b1 = (9 >= 8);

		System.out.println("--------");
		
		//논리
		boolean b2 = ( 10 > 6 ) && (10 > 5); // 둘다 참이여야 T
		System.out.println(b2);
		
		boolean b3 = (5 != 1) || (10<4); // OR연산은 둘중 하나만 참이여도 T
		System.out.println(b3);
		
		boolean b4 = ( 2>=1 ) && (3<4);
		System.out.println( !b4 );
		
		//대입
		int a = 30;
		
		a += 30;	// a = a + 30;
		a -= 5;     // a = a - 5;
		a *= 3;		// a = a * 3;
		a /= 2;		// a = a / 2;
		a %= 4;		// a = a % 4;
		
		// a += 1;   a = a + 1 ;
		
		//삼항
		int point = 300;
		
		// 0~200 : 생수
		// 201 ~ : 커피
	
		String eventItem = (point <= 200) ? "생수" : "커피";
		System.out.println(eventItem);
		
		eventItem = (point > 200 ) ? "커피" : "생수";
		
		// 0 ~ 200 : 생수
		// 201 ~ 300 : 커피
		// 301 ~ : 맥주
		
		eventItem = (point > 200 ) ? (point > 300 ? "맥주" : "커피") : (point >= 0 ? "생수" : "사은품 없음");
		
		System.out.println(eventItem);
		
		eventItem = (point > 200 ) ? ( (point>=201 && point <=300) ? "맥주" : "커피") : "생수";
		
		// (point >= 0 && point <=200)
		
	}

}
