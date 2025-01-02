package study.test1230;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("룰렛 게임 기기 초기화");
		System.out.print("기기 아이디를 입력하세요: ");
		String deviceId = scanner.nextLine();

		System.out.print("지점명을 입력하세요: ");
		String branchName = scanner.nextLine();

		Game machine = new Game(deviceId, branchName);

		while (true) {
			System.out.println("메뉴: 1.충전 2.게임시작 3.마감");
			System.out.print("1,2,3번 중에 선택하세요 : ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("충전 금액을 입력하세요 (1000원 단위): ");
				int amount = scanner.nextInt();
				machine.charge(amount);
				break;
			case 2:
				machine.playGame();
				break;
			case 3:
				machine.closeMachine();
				scanner.close();
				return;
			default:
				System.out.println("잘못된 선택입니다. 다시 입력하세요.");
			}
		}
	}
}