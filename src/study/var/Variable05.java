package study.var;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "test";
		
		System.out.println("출력 1");
		System.out.println("출력 2");
		System.out.println(s);
		
		System.out.print("출력 3");
		System.out.print("출력 4");
		System.out.print(s);
		
		int hour = 10;
		int minute = 26;
		
		//현재 10시 26분 입니다.
		System.out.println("현재 " + hour + "시 " + minute + "분 입니다.");
		System.out.printf("현재 %d시 %d분 입니다.\n" , hour, minute);
		
		double rate = 1.15512;
		
		System.out.printf("%10.2f %%", rate); //10자리 차지하는데 소숫점 2번째까지만 보여줌, 퍼센트 출력하고 싶으면 2개 써서 출력
		System.out.printf("%-10.2f\n", rate);
		
		System.out.println(); // 출력 내용은 없는데 이걸 쓰면 줄바꿈 효과가 나타남
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력하세요 : ");
		String input = scanner.nextLine(); //"아무거나 입력"
		System.out.println(input);
		
		System.out.println("당신이 입력한 값은 : " + input );
		System.out.printf("당신이 입력한 값은 : %s\n", input );
		
		System.out.println("점수를 입력하세요 : ");
		int point = scanner.nextInt();
		//String -> int
		System.out.println(point);
		}

}
