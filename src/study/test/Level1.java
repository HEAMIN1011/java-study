package study.test;

import java.util.Random;
import java.util.Scanner;

public class Level1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		- 레벨 1
		1회부터 3회까지만 진행합니다.
		각 회는 3아웃 마다 회가 넘어가며, 회가 시작 할 때마다 0아웃으로 시작합니다.
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
		
		System.out.println("3아웃~!~~! 게임 끝~!~!~!~!~");
		
		
		
		int outNum = 3;
		int totalNum = 3;
		
		for(int gameNum=1; gameNum <= totalNum; gameNum++) {
			int out1 = 0;
			
			System.out.println("\n" + gameNum + "회차 시작~~~!~!~!~!~!");
			
			while(out1 < outNum) {
				int tosu1 = random.nextInt(10) + 1;
				System.out.println("1~10까지 숫자 입력: ");
				int user = scanner.nextInt(); 
				
				
				
				if (user < 1 || user > 10) {
				System.out.println("1~10까지 숫자 입력: ");
	            continue;
	            
	            
//			            if(user == tosu) {
//			            	System.out.println("안타");
//			            }else {
//			            	out1++;
//			            	System.out.println("아웃");
//			            }
//	            
	            
	            
	         }
		}
	}
	
		
		
		
		
	}

}
