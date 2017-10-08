package Oct07;

import java.util.Scanner;

public class Q1920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1= sc.nextInt();
		int[] arr1 = new int[num1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		int num2 = sc.nextInt();
		int[] arr2 = new int[num2];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		int[] include = new int[num2];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(arr2[i]==arr1[j]){
					include[i]=1;
				}
			}
		}
		for (int i = 0; i < include.length; i++) {
			System.out.println(include[i]);
		}
	}
}
