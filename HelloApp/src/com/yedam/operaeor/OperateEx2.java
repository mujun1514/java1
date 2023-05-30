package com.yedam.operaeor;

import java.util.Scanner;

public class OperateEx2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자");
		int num1 = scn.nextInt();
		System.out.println("숫자");
		int num2 = scn.nextInt();
		
		thirdMethod(num1,num2);
		//firstMethod();
		//secondMethod();
	}

	

	public static void thirdMethod(int num1, int num2) {
		// 매개로 받은 2개의 수를 더하고 결과 출력
		int result = num1 + num2;
		System.out.print("값:" + result);
	}

	public static void secondMethod() {

		Scanner scn = new Scanner(System.in);
		System.out.println("입력");
		String str = scn.nextLine();
		System.out.println("숫자");
		int num = scn.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println(str);
		}

	}// second method

	public static void firstMethod() {
		Scanner scn = new Scanner(System.in);

		int num = 0;
		int gob = 0;
		int result = 1;
		try {
			System.out.println("숫자입력:");
			num = scn.nextInt();
			System.out.println("숫자입력:");
			gob = scn.nextInt();

			for (int i = 1; i <= gob; i++) {
				result *= num;
			}
		} catch (Exception e) {
			System.out.println("숫자아님");
		}
		System.out.println(result);

	}// first method
}