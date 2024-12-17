package study.test;

import java.util.Random;
import java.util.Scanner;

public class Level3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		각 타자의 전체 타석 및 안타수를 기록합니다.
		타석에 등장시, 타순 및 타자명 뿐만 아니라 타율도 출력됩니다. (타율 = 안타수 / 타석수)
		참고로, 첫 타석의 타율은 0 입니다.

		*한번 휘두를때를 기준으로 타석수가 증가합니다
		현재는 안타, 아웃 뿐이지만, 이후 스트라이크, 볼 등에 대해서 타석수는 증가합니다.
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
		
		
		
	}

}
