package com.yedam.operaeor;

public class ControlEx4 {
	public static void main(String[] args) {
		// 1부터 100까지의 수중에서 3의 배수의 합계. method1()
		// Math.random() 의 2번 실행. = > 두수의 합이 5 method2
		//

//		method1();
		method4();
	}

	public static void method1() {
		int sum = 0;
		for (int i = 0; i <= 100; i += 3) {
			sum += i;
		}
		System.out.println(sum);
	}

	public static void method2() {

		while (true) {
//			int dice1 = (int) (Math.random()*10 % 6) + 1;
			int dice1 = (int) (Math.random()*6) + 1;
			System.out.println("첫번쨰 주사위는:" + dice1);
			int dice2 = (int) (Math.random() * 6) + 1;
			System.out.println("두번째 주사위는:" + dice2);
			int result = dice1 + dice2;
			System.out.println("주사위의 합은:" + result);
			if (result == 5) {
				break;
			}
			System.out.println("---");
		}

	}

	public static void method3() {
		for (int i = 1; i < 5; i++) {
			String st = "";
			for (int j = 1; j <= i; j++) {
				st += "*";
			}
			System.out.println(st);
		}

	}
	public static void method4() {
		for (int i = 1; i < 5; i++) {
			for(int k=5; k>i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	

	}
}
