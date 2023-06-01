package com.yedam.operaeor;

import java.util.*;

public class ControlEx2 {
	public static void main(String[] args) {
		// method1();
		// method2();

		System.out.println(getLastDate(3));
	}

	public static int getLastDate(int month) {
		// 12월
		// 마지막 날짜 값 1=31,2=28,3=31,4=30
//		Scanner scn= new Scanner(System.in);
//		System.out.println("월을 입력하세요");
//		int result=scn.nextInt();
		
		int result = 0;
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
//			System.out.println("31일입니다.");
			result=31;
			break;
		case 2:
//			System.out.println("28일입니다.");
			result = 28;
			break;
		default:
//			System.out.println("30일 입니다.");
			result=30;
			break;
		}
		return result;
	}

	public static void method1() {
		int result = (int) (Math.random() * (100 - 10 + 1)) + 10;// Math.random()*(최댓값 - 최소값 + 1)-최소값 (범위
		System.out.println(result);
		switch (result / 10) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("B");
			break;
		case 8:
			System.out.println("C");
			break;
		case 7:
			System.out.println("D");
			break;

		}
	}// method1

	public static void method2() {
		int result = (int) (Math.random() * 3) + 1;
		switch (result) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		case 3:
			System.out.println("보");
			break;
		}
		System.out.println("end.");
	}// 2
}
