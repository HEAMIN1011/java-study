package study.practice;

public class prac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//	1. 아래 1), 2) 에 맞게 풀이.
//	int x = 10;
//	int y = 4;
//	___result = ___x/y;
//	System.out.println(result);
//
//	1) 결과가 2가 나오도록 작성하세요 O
//		int x = 10;
//		int y = 4;
//		int result = x/y;
//		System.out.println(result);
//	2) 결과가 2.5가 나오도록 작성하세요 O
//		int x = 10;
//		int y = 4;
//		double result =(double)x/y;
//		System.out.println(result);
		
//	2. 결과가 7.5가 나오도록 작성하세요 O
//	double a = 3.5;
//	double b = 4.7;
//	double result = _______________;
//	System.out.println(result);

//		double a = 3.5;
//		double b = 4.7;
//		double c = a + (int)b;
//		System.out.println(c);
		
		
//	3. 계산결과가 12가 나오도록 작성하세요
//	String a = "3.4";
//	String b = "4";
//	______ result = ________;
//	System.out.println(result);
		
//		String a = "3.4";
//		String b = "4";
//		int result = (int)Double.parseDouble(a) * Integer.parseInt(b); //string을 더블로 바꿔주고, 소숫점 없애기 위해 더블을 다시 int로 바꿔줘야 함
//		System.out.println(result);
////
//
//	4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요. O
//	String a = "10";
//	int b = 3;
//	double c = 4.5;
//	_____ result = _______;
//	System.out.println(result);
		
//		String a = "10";
//		int b = 3;
//		double c = 4.5;
//		int d = (int) (b*c);
//		String result2 = a + d;
//		System.out.println(result2);
////
//
//	5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
//	int a = 4;
//	double b = 3.4;
//	String c = "6.8";
//	_____ result = _______;
//	System.out.println(result);
		
		int a = 4;
		double b = 3.4;
		String c = "6.8";
		String result = a * (int)Double.parseDouble(c) +String.valueOf ((int)b);
		System.out.println(result);
//
//	6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.    O
//	int x = 111;
//	int y = 13;
//	int result = _____;
//	System.out.println(result);
//
//	1) 출력결과 : 7
//		int x = 111;
//		int y = 13;
//		int z = x/y-1;
//		System.out.println(z);
//	2) 출력결과 : 8
//		int x = 111;
//		int y = 13;
//		int z = x/y;
//		System.out.println(z);
	}

}
