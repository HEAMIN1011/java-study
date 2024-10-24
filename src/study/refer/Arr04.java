package study.refer;

public class Arr04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열 참조타입 VS int 기본타입
		
		int a = 10;
		int b = a;
		System.out.println(a + " " + b);
		
		b= 20;
		System.out.println(a + " " + b);
		System.out.println();
		
		/*
		*복사가 안 된 케이스*
		int[] arr1 = {10,20,30};
		int[] arr2 = arr1;
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		arr2[0] = 999;
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		*/
		
		/*for문으로 개별 복사
		int[] arr1 = {10,20,30};
		int[] arr2 = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			arr2[i] = arr1[i];
			//	0		0
			//	1		1
			// int = int 값 저장하겠다 -> 복사가 됨
		}
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		arr2[0] = 999;
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		*/
		
		
		
		int[] arr1 = {10,20,30};
		int[] arr2 = new int[3];
		
		//			   복사대상, 위치,저장할대상,위치,개수
		System.arraycopy(arr1, 0, arr2, 0, 3);
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		arr2[0] = 999;
		
		for(int i=0; i<3; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}

}
