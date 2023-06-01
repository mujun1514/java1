package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx8 {
	public static void main(String[] args) {
		// 학생수 => 점수입력 , 출력, 최고 점수,평균점수
		Scanner scn = new Scanner(System.in);

		int studentNum = 0;
		int[] scores = null;
		boolean run = true;

		while (run) {
			System.out.println("---------------------");
			System.out.println("1.학생수, 2.점수출력, 3.점수리스트 4.분석(최고,평균) 5.종료");
			System.out.println("---------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scn.nextLine());

			if (selectNo == 1) {
				System.out.print("학생수를 입력하세요");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				for (int i = 0; i <= scores.length - 1; i++) {
					System.out.print("scores[" + i + "]");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
			} else if (selectNo == 3) {
				// 점수리스트
				for (int i = 0; i <= scores.length - 1; i++) {
					System.out.println("scores[" + i + "]:" + scores[i]);
				}
			} else if (selectNo == 4) {
				// 최고,평균
				int max = 0;
				int sum = 0;

				for (int i=0; i<=scores.length-1; i++) {
					if(max<i) {
						max=scores[i];
					}
					sum += scores[i];
				}
				double avg = sum/studentNum;
				System.out.println("최고 점수는:"+max);
				System.out.println("평균 점수는:"+avg);
				
			} else if (selectNo == 5) {
				run = false;
				System.out.println("프로그램 종료");
				
			}
		}

	}
}
