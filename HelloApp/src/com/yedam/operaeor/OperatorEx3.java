package com.yedam.operaeor;

import java.util.Scanner;

public class OperatorEx3 {
	public static void main(String[] args) {
		// method1();

		// 변수 balace 선언.
		// balance 가 0 - 100,000 범위내에서만 추가, 차감
		// 입력값을 판단 1)balace값을 추가. 2)balance 값을 빼기.
		// 3) 현재 balance 값을 콘솔 출력. 4)종료.
		Scanner scn = new Scanner(System.in);
		int balance = 0;

		while (true) {
			System.out.println("1)추가 2)차감 3)balance출력 4)종료");
			int menu = scn.nextInt();

			if (menu == 4) {
				System.out.println("end");
				break;
			} else if (menu == 1) {
				System.out.println("더할값");
				int acct = scn.nextInt();
				balance = balance + acct;
				if (balance + acct > 100000) {
					//System.out.println("100,000초과");
					System.out.printf("현재 balance는 %d 입니다. %d는 추가할수없습니다.\n",balance,acct);
				} else {
					balance = balance + acct;
				}
			} else if (menu == 2) {
				System.out.println("뺄값");
				int acct = scn.nextInt();
				balance = balance - acct;
				if (balance - acct < 0) {
					//System.out.println("0미만");
					System.out.printf("현재 balance는 %d 입니다. %d는 추가할수없습니다.\n",balance,acct);
				} else {
					balance = balance - acct;
				}
			} else if (menu == 3) {
				System.out.printf("현재 balance는 %d 입니다.\n" , balance);
			}
			else {
				System.out.println("메뉴의 없는 값입니다");
			}
		} // while

	}

	public static void method1() {
		// while (condition){}
		int num1 = 1;
		while (num1 <= 10) {
			System.out.println(num1++);
		} // while

		boolean isOk = false;
		isOk = true;
		num1 = 1;
		while (isOk) {
			System.out.println(num1++);
			if (num1 >= 10) {
				isOk = false;
			}
		} // while2

		Scanner scn = new Scanner(System.in);
		isOk = true;
		while (isOk) {
			System.out.println("문장을 입력하세요");
			String str = scn.nextLine();

			if (str.equals("quit")) {
				isOk = false;
				break;
			}
			System.out.println("입력값은:" + str + "입니다.");
		} // while3
		System.out.println("end of program.");
	}
}
