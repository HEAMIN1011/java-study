package study.test;

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		스크린 야구 게임을 제작하려고 합니다.
		해당 게임은 항상 공격만 하는 게임으로, 투수가 공을 던지는 것을 치기만 하면 됩니다.
		투수의 공은 컴퓨터이며, 타자는 사용자 입니다.
		(반복문, 조건문, 배열을 최대한 사용하시면 됩니다.)

		- 기본 문제
		투수가 매번 던지는 공은 1 ~ 10의 난수로 설정합니다.
		사용자의 입력도 1 ~10까지 이며,
		투수의 공과 사용자의 입력과 동일하면 안타로, 동일하지 않으면 아웃으로 간주합니다.
		해당 게임은 3아웃이면 종료됩니다.
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
		
		
		//for(int i=0; i<10; i++)
		//System.out.println((int)(Math.random()*10)+1);
		
	

		

	
	}
	


}
