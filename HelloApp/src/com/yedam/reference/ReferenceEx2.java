package com.yedam.reference;

public class ReferenceEx2 {
	public static void main(String[] args) {
		// int s1=90;
		int[] intAry = { 30, 40, 50 };
		double[] dblAry = { 30.0, 40.0, 50.0 };
		String[] strAry = { "y", "e", "D", "a", "M" };
		int[] intAry2 = new int[3];

		System.out.println(intAry[0]);
		intAry[0] = 33;
		System.out.println(intAry[0]);

		int sum = intAry[0] + intAry[1] + intAry[2];
		for (int i = 0; i < 3; i++) {
			sum += intAry[i];
		}
		System.out.println(sum);
		
		//확장 for
		for(String str : strAry) {
			System.out.print(str);
		}
		double sum1 = dblAry[0] + dblAry[1] + dblAry[2];
	}
}
