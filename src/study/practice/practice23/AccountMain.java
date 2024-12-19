package study.practice.practice23;

public class AccountMain {

	// · Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한
	// 저축과 인출을 수행한 후 잔금을 출력
	public static void main(String[] args) {
		Account a1 = new Account("나부자", 5000);
		System.out.println(a1.deposit(3000) + "원 입금했습니다");
		System.out.println("잔액:" + a1.getBalance());

		System.out.println(a1.withdraw(6000) + "원 출금했습니다");
		System.out.println("잔액:" + a1.getBalance());

		System.out.println(a1.withdraw(10000) + "원 출금했습니다");
		System.out.println("잔액:" + a1.getBalance());

		// 메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
		// · 인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
		// · 클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인
		// 출하려는 메소드를 호출하여 출력

	}
}
