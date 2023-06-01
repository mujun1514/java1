package com.yedam.operaeor;

public class ControlEx1 {
	public static void main(String[] args) {

		method1();
	}
		public static void method1() {
			//Math.random 10-100까지 임의의 수. 
			//생성된 값이 100-90 a, 80-89 b, 70-79 c 나머지 d
			int number=(int)(Math.random()*(100-10+1))+10;//Math.random()*(최댓값 - 최소값 + 1)-최소값 (범위
			System.out.println(number);
			if(number>=90) {
				System.out.println("A");
			}
			else if(number>=80) {
				System.out.println("B");
			}
			else if(number>=70) {
				System.out.println("C");
			}
			else {
				System.out.println("D");
			}
		}//method1
		public static void method2() {
			// 0-1사이의 임의의 수를 생성.
			int result =(int)(Math.random()*10);
			System.out.println(result);
			if(result %2 ==0) {
				System.out.println("짝수입니다");
			}//if
			else {
				System.out.println("홀수입니다");
			}//else
		}
	
}
