package exception;

public class AccountTest {
	public static void main(String[] args) {
		Account account;
		
		// account 객체 생성
		account = new Account("441-0290-1203", 500000, 7.3);
		
		// account 기본 정보 출력
		System.out.printf("계좌정보: %s %.1f %.1f\n", 
						account.getAccount(), account.getBalance(), account.getInterestRate());
		
		// account에 -10원 입금
		try {
			account.deposit(-10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// account에 600000원 출금
		try {
			account.withdraw(600000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// 이자 출력 
		System.out.println("이자: " + account.calculateInterest());
	}

}
