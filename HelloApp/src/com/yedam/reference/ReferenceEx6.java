package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx6 {
	public static void main(String[] args) {
		int[][] intAry = { new int[] { 70, 71 }, new int[] { 80, 81 }, new int[] { 90, 91 } };

		System.out.printf("김길동의 수학점수 %d \n", intAry[1][1]);
		int engSum = 0;
		int mathSum = 0;
		for (int i = 0; i < intAry.length; i++) {
			engSum += intAry[i][0];
		}
		System.out.printf("영어점수의 합계 %d\n", engSum);

		for (int i = 0; i < intAry.length; i++) {
			mathSum += intAry[i][1];
		}
		System.out.printf("수학점수의 합계 %d\n", mathSum);

		int totalSum = 0;
		totalSum = intAry[0][0] + intAry[0][1] + intAry[1][0] + intAry[1][1] + intAry[2][0] + intAry[2][1];
		for (int j = 0; j < intAry.length; j++) {
			for (int i = 0; i < intAry[j].length; i++) {
				totalSum += intAry[j][i];
			}
		}
		System.out.printf("전체점수는 %d\n", totalSum);

		String[] nameAry = { "홍길동", "김길동", "박길동" };

		Scanner scn = new Scanner(System.in);
		System.out.print("학생이름을 입력하세요:");
		String searchName = scn.nextLine();

		
		boolean isExist = false;
		for (int i = 0; i <= nameAry.length-1; i++) {
			if (nameAry[i].equals(searchName)) {
				System.out.printf("이름은 %s, 영어점수는 %d 수학점수는 %d",
						nameAry[i], intAry[i][0], intAry[i][1]);
				isExist=true;
			}
		}
		if(isExist == false) {
			System.out.println("찾는 학생이없습니다.");
		}
	}
	
}
