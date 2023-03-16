package edu.java.method03;

import java.util.Random;

public class MethodMain03 {
	
	public static int[] makeTestArray(int n) {
		int[] array = new int[n];
		
		Random random = new Random();
		for (int i=0; i<n; i++) {
			array[i] = random.nextInt(10);
		}
		return array;
	}
	
    public static void printTestArray(int[] arr){
    	System.out.print("[");
    	for (int x : arr) {
    		System.out.print(x+" ");
    	
    	}
    	System.out.println("\b]");
//    	return;  메서드의 타입이 void인 경우에는 return이 생략된 것 
    }	
	
	public static void main(String[] args) {  // 자바프로그램의 시작은 항상  main메서드에서 시작한다. 다른 곳에서 만든 메서드는 main에서 호출될 때부터 시작한다.
        // 메서드 기능 테스트를 위한 배열 만들기
		int[] array = makeTestArray(10);
		
		// 테스트 데이터 출력하기
		printTestArray(array);
		
		System.out.println("sum: "+sum(array));
		System.out.println("mean: "+mean(array));
		System.out.println("max: "+max(array));
		System.out.println("maxAt: "+maxAt(array));
		System.out.println("min: "+min(array));
		System.out.println("minAt: "+minAt(array));
		
    }
    
    /** 
     * sum
     * 정수 배열의 모든 원소들의 합을 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 모든 원소들의 합.
     */
    public static int sum(int[] arr) { // 패키지 간의 공유가능한 int 타입의 값을 리턴하는 sum이라는 변수는 argument로 int[](정수배열)을 받고 이 메서드는 MethodMain03 클래스의 static공간에 저장한다.
    	int sum = 0;  		// int[] arr의 원소의 합을 저장할 정수타입의 변수 sum을 선언 후 초기화
    	for(int x : arr) {  // int[] arr의 원소들을 저장할 int타입 변수 x 선언 원소들을 다 꺼낼 때까지 반복
    		sum += x;  	// for-each문을 통해 x에 저장된 int[] arr의 원소의 값을 sum에 더하고 반복 
    	}
    	return sum;
    }
    
    
    /**
     * mean
     * 정수 배열의 모든 원소들의 평균을 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 모든 원소들의 평균(double).
     */
    public static double mean(int[] arr) {
//    	double sum = 0;
//    	for(int x : arr) {
//    		sum += x;
//    	}
//    	double average = sum/arr.length;
    	return (double)sum(arr)/arr.length;
    }
    
    
    /**
     * max
     * 정수 배열에서 최댓값을 찾아서 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최댓값.
     */
    public static int max(int[] arr) {
    	int max = arr[0];
    	for(int x : arr) {
//    		if(x > max) {
//    			max = x;
//    		}
    		max =(x > max) ? x : max;
    	}
    	return max;
    }
    
    /**
     * maxAt
     * 정수 배열에서 최댓값의 인덱스 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최댓값의 인덱스.
     * 최댓값이 여러개 있는 경우, 첫번째 최댓값의 인덱스.
     */
    public static int maxAt(int[] arr) {
    	int max = arr[0];
    	int at = 0;
    	for(int i=0; i<arr.length; i++) {
//    		if(arr[i] > max) {
//    			at = i;
//    		}
    		at = (arr[i] > max) ? i : at;
    	}
    	return at;
    }
   

    /**
     * min
     * 정수 배열에서 최솟값을 찾아서 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최솟값.
     */
    public static int min(int[] arr) {
    	int min = arr[0];
    	for(int x : arr) {
    		if(x < min) {
    			min = x;
    		}
    	}
    	return min;
    }
    
    
    /**
     * minAt
     * 정수 배열에서 최솟값의 인덱스 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최솟값의 인덱스.
     * 최솟값이 여러개 있는 경우, 첫번째 최솟값의 인덱스.
     */
    public static int minAt(int[] arr) {
    	// 최솟값을 찾음.
    	// 배열의 원소들을 순서대로 반복하면서, 그 원소가 최솟값인지 검사.
    	// 최솟값을 찾았으면 반복을 종료.
    	// 반복문이 종료됐을 때의 인덱스를 리턴.
    	
//    	int min = arr[0];
    	int at = 0;
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i] == min(arr)) {
    			at = i;
    		}
    	}
    	return at;
    }
    
}