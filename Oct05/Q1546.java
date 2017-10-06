package Oct05;

import java.util.Scanner;

public class Q1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] score = new int[size];
		double max=0;//max로 나눠주는 것이므로, max도 double로
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			if(max<score[i]){
				max = score[i];
			}
		}
		double sum=0;
		for (int i = 0; i < score.length; i++) {
			sum += ((score[i]/max)*100);
		}
		System.out.printf("%.2f", sum/size);
		//소수점 둘째자리까지
 		//System.out.println(Math.round((sum/size)*100)/100.0);
	}
}
