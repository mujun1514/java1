package com.yedam.operaeor;

public class ControlEx3 {
	public static void main(String[] args) {
//		method1();
//		method2();
		int month=4;
		System.out.println("============"+month+"월=============");
		String days="sun mon tue wed thr fri sat";
		System.out.println(days);
		
		for(int i=0; i<getFirstDate(month); i++) {
			System.out.printf("%3s ","");
		}
		
		for(int day=1; day<= getLastDate(month); day++) {
			System.out.printf("%3d ",day);
			if((getFirstDate(month)+day)%7==0) {
				System.out.println();
			}
		}
	}
	//456월
			public static int getFirstDate(int month) {
				int result = 0;
				switch(month) {
				case 4:
					result = 6; break;
				case 5:
					result = 1; break;
				case 6:
					result = 4; break;
				}
				return result;
			}
			public static int getLastDate(int month) {
				int result =0;
				switch(month) {
				case 4:
					result =30;
				case 5:
					result =31;
				case 6:
					result =30;
				}
				return result;
			}

			
			
	public static void method2() {
		for (int num2 = 1; num2 <= 9; num2++) {
			for (int i = 1; i <= 9; i++) {
				// 1-9로 바뀌는동안 나머지 단 출력
				System.out.printf("%d * %d = %d ", num2, i, (num2 * i));
			}
			System.out.printf("\n");
		}
	}

//	String days1="sun mon tue wed thr fri sat";
//	System.out.println(days);
//	
//	for(int day=1; day<= 31; day++) {
//		System.out.printf("%3d ",day);
//		if(day%7==0) {
//			System.out.println();
//		}
//	}
	public static void method1() {

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.printf("i의 값은 %d \n", i);
			} // if
		} // for
	}
	// 반복문 for, while, do ~ while
}
