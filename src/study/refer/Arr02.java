package study.refer;

public class Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//int[] 1차원 배열
		//int[][] 3차원 배열
		int[][] nArr1 = new int[3][5];
		
		
		/*  0  1  2  3  4		<-- int[][] nArr1 = new int[3][5];
		 0  ㅁ  ㅁ ㅁ  ㅁ  ㅁ
		 1  ㅁ  ㅁ ㅁ  ㅁ  ㅁ
		 2  ㅁ  ㅁ ㅁ  ㅁ  ㅁ
		 */
		
		int [][] nArr2 = new int [2][3];
		
		
		int [][] nArr3 = { {1,2,3}, {4,5,6}};
		System.out.println(nArr3[1][1]);
		
		
		
		//		[2][3]   행의 길이 2
		for(int i=0; i<nArr3.length; i++) {
			
			
			//				nArr3[0].length
			//			    nArr3[1].length
			for(int j=0; j<nArr3[i].length; j++) {
				System.out.println(nArr3[i][j] + " ");
				//i : 0 0 0 1 1 1 
				//j : 0 1 2 0 1 2
				// nArr3[0][0] nArr3[0][1] nArr3[0][2]
				// nArr3[1][0] nArr3[1][1] nArr3[1][2]
			}
			System.out.println();
			
			
		}
		
		int[][]nArr4 = new int[5][3];
		
		
		
		
		
	}

}
