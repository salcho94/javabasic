import java.util.Scanner;

public class Atm {
	/*
	 * ATM 1.입금 2.출금
	 */

	public static void main(String[] args) {
		int money = 5000;//가진돈
		int wallet = 10000;//계좌잔액
		int password = 1111;//비밀번호
		Scanner sc = new Scanner(System.in);
		System.out.println("입금하시려면 1 ,출금하시려면 2");
		int insert = sc.nextInt();
		if (insert == 1) {
			System.out.println("입금을 시작합니다");
			int don = sc.nextInt();
			if (don <= money) {
				System.out.println("입금하실 금액을 입력하시오");
				System.out.println(wallet + don);
				int total = wallet + don;
				System.out.println("입금되었습니다 계좌잔액은" + total);
			} else {
				System.out.println("금액이 부족합니다 ");
			}
		} else if (insert == 2) {
			System.out.println("출금을 시작합니다 , 비밀번호 입력하세요");
			int pass = sc.nextInt();
			if (pass == password) {
				System.out.println("출금할 금액을 입력");
				int count = sc.nextInt();
				if (count <= wallet) {
					System.out.println(count + "원이 출금되었습니다.");
					System.out.println("현재 잔액은" + (wallet - count));
				} else {
					System.out.println("계좌에 잔액이 부족합니다");

				}
			} else {
				System.out.println("비밀번호가 다릅니다");
			}
		}
		System.out.println("이용해 주셔서 감사합니다");

	}
}
