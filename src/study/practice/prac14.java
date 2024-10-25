package study.practice;

import java.util.Scanner;

public class prac14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int menu;
		int count;
		String add;
		
		int menu1Count = 0;
		int menu2Count = 0;
		int menu3Count = 0;
		
		while(true) {
		System.out.println("======메뉴======");
		System.out.println("1.아메리카노 3500원");
		System.out.println("2.카페라떼  4100원");
		System.out.println("3.바닐라라떼 4300원");
		System.out.println("==============");
		
		System.out.println("메뉴 선택: ");
		menu = scanner.nextInt();
		if(menu==1 || menu ==2 || menu==3) {
			
			System.out.println("수량 선택: ");
			count = scanner.nextInt();
			
			if(menu == 1)
				menu1Count += count;
			
			if(menu == 2)
				menu2Count += count;
			
			if(menu == 3)
				menu3Count += count;
			
			
			
			
			
			scanner.nextLine();	//입력값 청소용
			
			while(true) {
				System.out.println("추가 주문하시겠습니까?(y/n): ");
				add = scanner.nextLine();
				
				if(add.equals("y") || add.equals("n")) {
					break;
				}else {
					System.out.println("잘못 입력했습니다. 다시 입력하세요.");
			}
			//잘못된 입력, 정상입력
			
			if(add.equals("n")) {
				//입력받는 반복문 끝
				//주문한 메뉴 보여주고
				//아메 몇 개
				if(menu1Count > 0)
					System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count*3500);
				
				//라뗴 몇 개
				if(menu2Count > 0)
					System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count*4100);
				
				//바라 몇 개
				if(menu3Count > 0)
					System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count*4300);
				
				//총 금액 보여주기 -> 끝
				int total = menu1Count*3500 + menu1Count*4100 + menu1Count*4300;
					System.out.println("총액 : " + total + "원");
					break;
			}
		 else {
			System.out.println("잘못입력하셨습니다. 다시 입력하세요");
		 	}
			}
		
		
		}
	}
	}
}


