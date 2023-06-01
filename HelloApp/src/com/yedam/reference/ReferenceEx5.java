package com.yedam.reference;

public class ReferenceEx5 {
	public static void main(String[] args) {
		int[] intAry = new int[3];
		intAry[0] = (int) (Math.random() * 100);
		intAry[1] = (int) (Math.random() * 100);
		intAry[2] = (int) (Math.random() * 100);

		for (int j = 0; j < intAry.length - 1; j++) {
			for (int i = 0; i < intAry.length - 1; i++) {
				int temp = 0;
				if (intAry[i] < intAry[i + 1]) {
					temp = intAry[i];
					intAry[i] = intAry[i + 1];
					intAry[i + 1] = temp;
				}//if
			}//for
		}
		for(int num : intAry) {
			
		}
	}
	public static void method1() {

		int a = (int) (Math.random() * 100);
		System.out.println("a:" + a);
		int b = (int) (Math.random() * 100);
		System.out.println("b:" + b);
		int c = (int) (Math.random() * 100);
		System.out.println("c:" + c);

		int max = 0;
		int min = 0;
		if (a > b) {
			if (a > c) {
				max = a;
			}
		} // if
		else if (b > a) {
			if (b > c) {
				max = b;
			}
		} // elif
		else if (c > a) {
			if (c > b) {
				max = c;
			}
		}
		System.out.println("최대는:" + max);// 최대값

		if (a < b) {
			if (a < c) {
				min = a;
			}
		} // if
		else if (b < a) {
			if (b < c) {
				min = b;
			}
		} // elif
		else if (c < a) {
			if (c < b) {
				min = c;
			}
		}
		System.out.println("최소는:" + min);// 최소

	}
}
