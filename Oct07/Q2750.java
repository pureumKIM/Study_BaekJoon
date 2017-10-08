package Oct07;

import java.util.Scanner;

public class Q2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			bubbleSort(arr);
//			insertSort(arr);
			System.out.println(arr[i]);
		}
	}
//	public static void insertSort(int[] arr1) {
//		int n = arr1.length;
//		int tmp;
//		for (int i = 1; i < n; i++) {
//			for (int j = i; j>0; j--) {
//				if(arr1[j]<arr1[j-1]){
//					tmp = arr1[j];
//					arr1[j]=arr1[j-1];
//					arr1[j-1]=tmp;
//				}
//			}
//		}
//	}
	public static void bubbleSort(int[] arr1) {
		int n = arr1.length;
		int tmp;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if(arr1[j]>arr1[j+1]){
					tmp = arr1[j+1];
					arr1[j+1]=arr1[j];
					arr1[j]=tmp;
				}
			}
		}
	}
}
