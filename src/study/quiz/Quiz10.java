package study.quiz;

public class Quiz10 {
	public static void main(String[] args) {

		// 문제: 두 개의 스레드를 생성하여 각각 짝수와 홀수를 출력하는 프로그램을 작성하세요.

		// 예를 들어, 첫 번째 스레드는 1, 3, 5, 7, ... 순서로 홀수를 출력하고,
		// 두 번째 스레드는 2, 4, 6, 8, ... 순서로 짝수를 출력해야 합니다.
		// (범위는 1~ 100까지 ..)

		// Runnable 인터페이스 or Thread 클래스 사용은 자유 선택
		EvenThread et = new EvenThread();
		OddThread ot = new OddThread();

//		et.start();
//		ot.start();

		EvenRunnable er = new EvenRunnable();
		Thread t1 = new Thread(er);
		Thread t2 = new Thread(new OddRunnable());

//		t1.start();
//		t2.start();

		NumberThread nt1 = new NumberThread(true);
		NumberThread nt2 = new NumberThread(false);
		nt1.start();
		nt2.start();
	}
}

class NumberThread extends Thread {

	boolean isOdd;
	int remain;

	public NumberThread(boolean isOdd) {
		this.isOdd = isOdd;
		if (isOdd) {
			remain = 1;
		} else {
			remain = 0;
		}
	}

	public void run() {

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == remain) {
				System.out.println(i);
			}
//			if(isOdd) {
//				if(i%2 == 1) {
//					System.out.println(i);
//				}
//			} else {
//				if(i%2 == 0) {
//					System.out.println(i);
//				}
//			}

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class EvenThread extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);

				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}
}

class OddThread extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class EvenRunnable implements Runnable {

	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);

				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}

}

class OddRunnable implements Runnable {
	public void run() {
		for (int i = 1; i <= 100; i += 2) {
			System.out.println(i);

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}