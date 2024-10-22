package study.practice;

import java.util.Scanner;

public class prac8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		몇번째 수인가요? : 그에 해당하는 수를 출력
//		ex) 10 20 30 50 90
//		몇번째 수인가요? 5
//		결과 : 90
		
		Scanner scanner = new Scanner(System.in);
		
		
//		int[] nums = new int[5];
//		
//		System.out.print("5개 정수를 입력하세요: ");
//		
//		for(int i=0; i<nums.length; i++) {
//			nums[i]  = scanner.nextInt();
//		}
//		
//		System.out.print("몇번째 수인가요?: ");		//인덱스 : 0 1 2 3 4 , 순번 : 1 2 3 4 5
//		int index = scanner.nextInt();
//		System.out.println("결과 : " + nums[index-1]);
		
		
//		nums[0] = scanner.nextInt();
//		nums[1] = scanner.nextInt();
//		nums[2] = scanner.nextInt();
//		nums[3] = scanner.nextInt();
//		nums[4] = scanner.nextInt();
		

		
//		2.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		받은후에 순서를 거꾸로 출력하세요.
//		ex) 1 2 3 4 5
//		결과 : 5 4 3 2 1
		
		
		
//		int[] nums = new int[5];
//		
//		System.out.print("정수 5개를 입력하세요: ");
//		
//		// i = 0 1 2 3 4 
//		for(int i=0; i<nums.length; i++) {
//			nums[i] = scanner.nextInt();
//		}
//		
//		//i = 4 3 2 1 0
//		System.out.print("결과 : ");
//		for(int i=4; i>=0; i--) {
//			System.out.print(nums[i] + " ");
//		}
		
//
//		3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
//		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
//		1   2   3   4
//		5   6   7   8
//		9  10 11 12
//		13 14 15 16
		
		// int [][] nArr = new int [4][4]; // 이거나
		//int [][] nArr1 = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}}; //이거 둘 중 하나만 사용해도 됨
		
		int [][] nArr1 = new int [4][4];
		
		int num = 1;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				//i : 0 0 0 0 1 1 1 1 ...
				//j : 0 1 2 3 0 1 2 3 ...
				//num:1 2 3 4 5 6 7 8 ...
				nArr1[i][j] = num;
				num = num+1;
			}
		}
		
		for(int i=0; i<nArr1.length; i++) {
			for(int j=0; j<nArr1.length; j++) {
				//System.out.print(nArr1[i][j] + " ");
				System.out.printf("%3d", nArr1[i][j]); //%3d를 사용하면 더 정렬된 느낌을 줄 수 있음
			}
			System.out.println();
		}
		
		
	}

}
