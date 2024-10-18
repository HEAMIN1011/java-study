package study.cond;

public class Cond02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dice = 5;
		
		if(dice == 1) {
			System.out.println("한칸 전진");
		}
		
		if(dice == 1) {
			System.out.println("한칸 전진");
		} else {
			System.out.println("주사위 수 대로 전진");
		}
		
		
		if(dice == 1) {
		
		} else if(dice == 2) {
			
		} else if (dice == 3) {
			
		}else { // 그 외 4,5,6
	}
		
		if(dice == 1) {
		} else if (dice ==2) {
		} else if (dice ==3) {
		} else if (dice ==4) {
		} else if (dice ==5) {
		} else if (dice ==6) {
		}
		
		if(dice == 1) {
		} else if (dice ==2) {
		} else if (dice ==3) {
		} else if (dice ==4) {
		} else if (dice ==5) {
		} else {     //else가 있으면 다 아니여도 최소한 이거는 해당하는 거
		}
		
		System.out.println("======switch======");
		dice = 5;
		
		switch(dice){
		case 1:				//dice == 1 이랑 같냐
			System.out.println("case 1");
		case 2:
			System.out.println("case 2");
		case 3:
			System.out.println("case 3");
			break;
		case 4:
			System.out.println("case 4");
		case 5:
			System.out.println("case 5");
			break;
		case 6:
			System.out.println("case 6");
		default : //else
			System.out.println("default");
		}
		
		
		//8시 출근 : 청소
//		9시 출근 : 회의
//		10시 : 업무
//		11시 : 외근
		
		int showTime = 8;
		
		if(showTime <=8) {
			//청소
		}
		if(showTime <=9) {
			//회의
		}
		if(showTime <=10) {
			//업무
		}
		if(showTime <=11) {
			//외근
		}
		
		
		
		
		
		if(showTime <=8) {
			//청소
			//회의
			//업무
			//외근
		} else if(showTime <=9) {
			//회의
			//업무
			//외근
		}else if(showTime <=10) {
			//업무
			//외근
		}else if(showTime <=11) {
			//외근
		}
		
		
		
		
		switch( showTime) {
		case 8:					//청소
		case 9:					//회의
		case 10:				//업무
		case 11:				//외근
		}
		
		
		switch( showTime) {
		case 8:
			//청소 회의 업무 외근
			break;
		case 9:		
			//회의 업무 외근
			break;
		case 10:
			//업무 외근
			break;
		case 11:	
			//외근
			break;
		}
		
		
		int goBedTime = 21; //잠든 시간
		int sleepTime = 9; //잔 시간
		
		
		//일찍   많이/조금
		//늦게   많이/조금
		if(goBedTime <= 21) {
			//일찍 잤구나
			if(sleepTime >= 9) {
				//많이 잤구나
				if(sleepTime >= 12) {
					//너무 많이 잔 거 같은데
				}
			} else {
				// 조금 잤구나
			}
			
			
		} else {
			//좀 늦게 잤구나
			if(sleepTime >= 9) {
				//많이 잤구나
			} else {
				// 조금 잤구나
			}
		}
		
		
		//일찍   많이/조금
		//늦게   많이/조금
		
		// x == 10   x != 10   !(x==10)
		// x < 10    x > 10    !(x<10)
		// x > 11    x <= 11   !(x > 11)
		
		if(goBedTime <= 21 && sleepTime >=9) {
			//일찍   / 많이
		}else if (goBedTime <=21 && !(sleepTime >=9) ) { //이렇게 쓸 수도 있음
		//else if (goBedTime <=21 && sleepTime < 9) {
			//일찍   / 조금
		} else if ( goBedTime > 21 && sleepTime >= 9) {
			//늦게   / 많이
		}
		
	}
	
	
	
}
