package study.refer;

public class Arr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array 배열
		
		int score1 = 100;
		int score2 = 85;
		int score3 = 75;
		int score4 = 65;
		int score5 = 40;
		
		int sum = 0;
		
		sum = score1 + score2 + score3 + score4 + score5;
		double avg = sum / 5.0;
		
		System.out.printf("총점:%d 평균:%.2f\n", sum, avg);
		
		sum = sum + score1;		//sum += score1;
		sum = sum + score2;
		sum = sum + score3;
		sum = sum + score4;
		sum = sum + score5;
		
		
		//scores coreArr scoreArray 같은 배열 느낌 변수로 만들어줘야 함
		int[] scoreArr = {100, 85, 75, 65, 40};
		
		sum = 0;
		sum = scoreArr[0] + scoreArr[1]  + scoreArr[2] + scoreArr[3] + scoreArr[4];
		
		sum = 0;
		sum = sum + scoreArr[0];
		sum = sum + scoreArr[1];
		sum = sum + scoreArr[2];
		sum = sum + scoreArr[3];
		sum = sum + scoreArr[4];
		
		sum = 0;
		for(int i=0; i<=4; i++) {
			sum = sum + scoreArr[i];
			//					0 1 2 3 4 
		}
		System.out.println("총합:" + sum);
		
		
		int[] pointArr = null;
		//pointArr = {1,2,3,4,5}; XXX
		
		pointArr = new int[] {1,2,3,4,5}; //O
		
		pointArr = new int[5];
		pointArr[0] = 1;
		pointArr[1] = 2;
		pointArr[2] = 3;
		pointArr[3] = 4;
		pointArr[4] = 5;
		
		
		for(int i=0; i<5; i++) {
			// i = 0 1 2 3 4
			// 값 : 1 2 3 4 5
			
			pointArr[i] = i+1;
			
		}
		
		for(int i=1; i<=5; i++) {
			// i : 1 2 3 4 5 저장할 값
		// index : 0 1 2 3 4 
			pointArr[i-1] = i;
		}
		
		
		for(int i=0; i<5; i++) {
			System.out.print(pointArr[i] + " ");
		}
		System.out.println();
		
		
		
		int[] intArr = new int[5];
		double[] doubleArr = new double[10];
		String[] strArr = new String[30];
		boolean[] boolArr = new boolean[4];
		
		for(int i=0; i< intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		
		for(int i=0; i<doubleArr.length; i++) {
			System.out.print(doubleArr[i] + " ");
		}
		
		for(int i=0; i<strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		System.out.println();
		
		boolArr[2] = true;
		for(int i=0; i<boolArr.length; i++) {
			System.out.print(boolArr[i] + " ");
		}
		System.out.println();
	}


}
