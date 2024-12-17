package study.test;

import java.util.Random;
import java.util.Scanner;

public class Level2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   - 레벨 2
			9명의 타자(선수)를 등록합니다.
			각 타자가 타격하기 위해 타석에 등장시, 타순 및 타자명이 출력됩니다.
			9번 타자 다음 순서는 1번 타자로 9명이 로테이션 됩니다.
			1회차가 끝나는 기준이 3아웃입니다.
			타자(선수)는 1아웃이면 다음 선수로 넘어갑니다.
			타자가 안타를 쳐도, 출루 했다고 가정하고 다음 선수로 넘어갑니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int out = 0;
		int index = 0;
		
		int[] tosu = new int[3];
		
		
		System.out.println("-----야구 게임 시작-----");
		
		
		while(out<3) {
			tosu[index] = random.nextInt(10) + 1;
			System.out.println("1~10까지 숫자 입력: ");
			int user = scanner.nextInt();
			
			if(user<1 || user>10) {
				System.out.println("1~10까지 숫자 입력: ");
				continue;
			}
			
			if(user == tosu[index]) {
				System.out.println("안타");
			}else {
				out++;
				System.out.println("아웃");
			}
			
			index = (index + 1) % tosu.length;
		}
		
		System.out.println("3아웃~ 게임 끝");
		
		
		String[] players = {
				"가가","나나","다다","라라","마마","바바","사사","아아","자자"};
		}
	
	int playerIndex = 0;
	
	
	while(out < outNum) {
		System.out.println(players[playerIndex]);
		
		
		Random random;
		int tosu = random.nextInt(10)+1;
		
		System.out.println("1~10까지 숫자 입력: ");
		int user = scanner.nextInt();
		
		
		if(user < 1 || user >10) {
			System.out.println("1~10까지 숫자 입력: ");
			continue;
	}
		
		if(user == tosu) {
			System.out.println("다음 타자 등ㅈ장~!~!~");
		}else {
			
		}

}
}
}
