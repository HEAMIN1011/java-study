package study.test1230;

import java.util.Random;
import java.util.Scanner;

public class Game {

	// 속성: 기기아이디, 지점명, 총합포인트, 성공횟수, 실패횟수, 잔여시도회수, 매출액
	private String deviceId;
	private String branchName;
	private int totalPoints;
	private int successCount;
	private int failCount;
	private int remainingAttempts;
	private int revenue;

	public Game(String deviceId, String branchName) {
		this.deviceId = deviceId;
		this.branchName = branchName;
		this.totalPoints = 0;
		this.successCount = 0;
		this.failCount = 0;
		this.remainingAttempts = 0;
		this.revenue = 0;
	}

	public void charge(int amount) {
		if (remainingAttempts > 0) {
			System.out.println("게임 먼저 소진 후 충전해 주세요.");
			return;
		}
		if (amount % 1000 != 0) {
			System.out.println("충전 금액은 1000원 단위로만 가능합니다.");
			return;
		}

		int attempts = amount / 500;
		this.remainingAttempts += attempts;
		this.revenue += amount;
		System.out.println("\n" + amount + "원이 충전되었습니다. 총 " + attempts + "회가 추가되었습니다.");
	}

	public void playGame() {
		if (remainingAttempts == 0) {
			System.out.println("충전 후 게임을 시작해 주세요.");
			return;
		}

		System.out.println("게임을 시작합니다!");
		Random random = new Random();

		while (remainingAttempts > 0) {
			remainingAttempts--;
			int rouletteResult = random.nextInt(6) + 1;

			if (rouletteResult <= 4) {
				int points = rouletteResult;
				totalPoints += points;
				successCount++;
				System.out.println("성공~! " + points + "점을 획득했습니다. (남은 시도: " + remainingAttempts + ")");
			} else {
				failCount++;
				System.out.println("실패ㅠㅠ (남은 시도: " + remainingAttempts + ")");
			}
		}

		System.out.println("모든 시도를 소진해 게임이 종료됩니다.");
		System.out.println("총합 점수: " + totalPoints + ", 성공 횟수: " + successCount + ", 실패 횟수: " + failCount);

		
		totalPoints = 0; //초기화
		successCount = 0;
		failCount = 0;
	}

	public void closeMachine() {
		if (remainingAttempts > 0) {
			System.out.println("게임을 먼저 소진해주세요.");
			return;
		}

		System.out.println("마감합니다.");
		System.out.println("오늘 총 매출액: " + revenue + "원");
		revenue = 0;
	}
}

