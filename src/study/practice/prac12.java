package study.practice;

import java.util.Scanner;

public class prac12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
//		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		*****
//		****
//		***
//		**
//		*
		
		//1)
//		for(int i=5; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				//i:5 j:1 2 3 4 5
//				//i:4 j:1 2 3 4 
//				//i:3 j:1 2 3 
//				//i:2 j:1 2 
//				//i:1 j:1
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		//2)
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=(6-i); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		//3)
//		for(int i=1; i<=5; i++) {
//			for(int j=0; j<=(5-i); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		//4)
//		for(int i=0; i<=4; i++) {
//			for(int j=1; j<=(5-i); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		//5)
//		for(int i=1; i<=5; i++) {
//			for(int j=5; j>=i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		*
//		**
//		***
//		****
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		3. 입력된 수의 약수를 출력하시오.
//		ex) 입력 : 6
//		1 2 3 6
//		System.out.println("입력: ");
//		int num = scanner.nextInt();
//		
//		System.out.println(num + "의 약수 ");
//		for(int i=1; i<=num; i++) {
//			if(num%i == 0) {
//				System.out.print(i + " ");
//			}
//		}
////
//		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		숫자를 입력받고 아래 문양으로 * 출력하기
//		ex) 입력 : 5
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*

//		System.out.println("입력: ");
//		int num = scanner.nextInt();
//		
//		//~num 늘어나는 형태, 상단부분
//		for(int i=1; i<=num; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//num-1 ~ 줄어드는 형태, 하단부분
//		for(int i=num-1; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
////
//		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
//
		//1)
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			for(int j=1; j<=i; j++) {
//				sum = sum + j;
//			}
//		}
//		System.out.println("총합: " + sum);
		
		//2)
//		sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum = sum + (i*(10-(i-1)));
//		}
//		System.out.println("총합: " + sum);
		
		//3)
//		sum=0;
//		int currentSum = 0;
//		for(int i=1; i<=10; i++){
//			currentSum = currentSum + i;
//			sum = sum + currentSum;
//		}
//		System.out.println("총합: " + sum);
				
//		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
//		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
		
		//1)
		int sum = 0;  // 누적 합을 저장할 변수
        int number = 1;  // 더해질 숫자
        int count = 0;  // 몇 번째 숫자까지 더했는지 카운트

        while (sum < 100) {
            if (number % 2 != 0) {
                sum += number;  // 양수 더하기
            } else {
                sum -= number;  // 음수 빼기
            }
		
            count = number;  // 마지막으로 더한 숫자 저장
            number++;  // 다음 숫자로 넘어감
        }
        System.out.println(count + "까지 더했을 때 총합은 " + sum + "입니다.");
       
        //2)
        int total = 0;
        int i=1;
        for(i=1; total<100; i++) {	//i:200
        	
        	if(i%2 ==0) {//짝수           198
        		total = total - i;		//-198 -> -99
        	}else {//홀수                  199
        		total = total + i;      //-99 + 199 = 100
        	}
        }
        System.out.println("누적합: " + total + " 얼마까지 계산했는가: " + (i-1));
		
        //3)
        total = 0;
        i=1;
        while(true) {
        	if(i%2 == 0) {
        		total = total - i; //199
        	}else {
        		total = total + i;
        	}
        	
        	if(total >= 100) {
        		break;
        	}
        	i++;
        }
        System.out.println("누적합: " + total + " 얼마까지 계산했는가: " + i);
        
        
	}

}

