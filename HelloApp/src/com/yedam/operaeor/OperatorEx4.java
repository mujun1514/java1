package com.yedam.operaeor;

import java.io.IOException;

public class OperatorEx4 {
	public static void main(String[] args) {
		while (true) {
			String msg = "";
			int result = 0;
			System.out.println("값을 입력하세요");
			try {
				result = System.in.read();
				if (result == 113) {
					break;
				} else if (result >= 97 && result <= 122) {
					msg = "소문자입니다";

				} else if (result >= 65 && result <= 90) {
					msg = "대문자입니다.";
				} else if (result >= 48 && result <= 57) {
					msg = "숫자입니다.";
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
