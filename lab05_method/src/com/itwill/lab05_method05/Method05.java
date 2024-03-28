package com.itwill.lab05_method05;

public class Method05 {
	/**
	 * sum
	 * 아규먼트로 전달받은 정수들의 1차원 배열의 모든 원소들의 합을 리턴.
	 * @param array 정수들의 1차원 배열(int[]).
	 * @return array의 모든 원소들의 합.
	 */
	public static int sum(int[] array) {
		int sum = 0;
//		for(int i = 0; i < array.length ; i++) {
//			sum += array[i];         //sum += i; => i는0부터 시작해서 배열의 값이 아닌 인덱스숫자로만 더해짐.
//		}		
//		return sum;
		for(int i : array) {
			sum += i;        //i-> 배열속성값임.
		}
		return sum;
	}
	/**
	 * mean
	 * 아규먼트로 전달받은 정수들의 1차원 배열의 모든 원소들의 평균(double) 리턴.
	 * @param array 정수들의 1차원 배열(int[]).
	 * @return array의 모든 원소들의 평균(double).
	 */
	public static double mean (int[] array) {
		double result = (double) sum(array) / array.length;
		return result;
//		double result = 0;
//		int sum = 0;
//		for(int i = 0; i < array.length ; i++) {
//			sum += array[i];		
//		result = (double)sum / array.length;    
//		}
//		return result;
		
		
	}		
	/**
	 * max
	 * 아규먼트로 전달받은 정수들의 1차원 배열의 모든 원소들 중 최댓값 리턴.
	 * @param array 정수들의 1차원 배열(int[]).
	 * @return array의 모든 원소들 중 최댓값.
	 */
	public static int max (int[] array) {
		int max = array[0];
		for(int i : array) {
			if (max < i) {
				max = i;
			}
		}		
		return max;
	}	
	/**
	 * min
	 * 아규먼트로 전달받은 정수들의 1차원 배열의 모든 원소들 중 최솟값 리턴.
	 * @param array 정수들의 1차원 배열(int[]).
	 * @return array의 모든 원소들 중 최솟값.
	 */
	public static int min(int[] array) {
		int min = array[0];
		for(int i : array) {
			if( min > i) {
				min = i;
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		// TODO 메서드 호출, 그결과를 출력
		
		int[] array = {1, 4, 3, 5};
		//sum 호출
		int total = sum(array);
		double mean = mean(array);
		System.out.println("sum: " + total);
		System.out.println("mean: " + mean);
		System.out.println("max: " + max(array));
		System.out.println("min: " +min(array));
			
	
	}//메인끝

}
