package comm.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {
	public static void main(String[] args) {
		Bank[] accounts = new Bank[3];

		boolean run = true;
		int accountNo=0;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("1.등록 2.조회 3.입금 4.출금 5.종료");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) {// 등록
				System.out.print("계좌를 등록해주세요:");
				 accountNo=Integer.parseInt(scn.nextLine());
				 accounts = new Bank[accountNo];
			} // 조회
			else if (selectNo == 2) {
				for (int i = 0; i < accounts.length; i++) {
					System.out.print("acc[" + i + "]");
					[i] = Integer.parseInt(scn.nextLine());
			} // 입금
			else if (selectNo == 3) {
				//출금
			} else if (selectNo == 4) {
				//종료
			} else if (selectNo == 5) {
				run=false;
				System.out.println("프로그램종료");
			}
		}
	}
}
