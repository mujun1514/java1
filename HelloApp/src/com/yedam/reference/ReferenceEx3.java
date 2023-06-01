package com.yedam.reference;

public class ReferenceEx3 {
	public static void main(String[] args) {
		// 학생점수 : 89.5,78.9,90.4 sum avg
		double score[] = { 89.5, 78.9, 90.4 };
		double sum = score[0] + score[1] + score[2];
		double avg =  sum / 3;
		double maxVal = 0;
		double minVal = 100;
		for(double i : score) {
			if(maxVal<i) {
				maxVal = i;
			}//최대
			if(minVal>i) {
				minVal = i;
			}//최소
		}
		
		
		System.out.println("총점은:" + sum);
		System.out.println("평균은:" + avg);
		System.out.println("최고점수는:" + maxVal);
		System.out.println("최저점수는:" + minVal);
		System.out.printf("총점은 %.2f, 평균은 %.2f, 최고점수는:%.2f, 최저점수는:%.2f", sum, avg, maxVal, minVal);

	}
}
