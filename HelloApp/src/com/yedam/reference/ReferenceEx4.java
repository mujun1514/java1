package com.yedam.reference;

public class ReferenceEx4 {
	public static void main(String[] args) {
		String[] strAry = { "홍길동", "김민수", "최수민" };
		strAry[0] = "KIM";
		System.out.println(strAry[0]);

		strAry = new String[] { "Hong", "Kim", "choi" };

		for (String str : strAry) {
			System.out.println(str);
		}

		for (int i = 0; i < strAry.length; i++) {
			System.out.println(strAry[i]);
			if (strAry[i].equals("Kim")) {
				System.out.printf("%s 은 %d 째에 있습니다.", strAry[i], (i + 1));
			} // if
		} // for

		// 문자열의 값에서도 "Hongkildong" index기준으로 값을 반환.
		String s1 = "Hongkildong";
		char result = s1.charAt(2);
		System.out.println(result);

		int result1 = s1.indexOf("H");
		System.out.println(result1);

		// String 배열에 주민번호, "950304-1234567",950404-2234567
		String[] idAry = { "950304-1234567", "950404-2234567" };

		for (int i = 0; i <= idAry.length; i++) {
			//char 타입은 문자 => "H"
			if (idAry[i].charAt(7) == '2') {
				System.out.printf("%d 번째 있습니다.", (i + 1));
			} // if
		}
	}
}
