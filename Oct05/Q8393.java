package Oct05;

import java.util.Scanner;

public class Q8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum =0;
		for (int i = 0; i < num; i++) {
			sum += (i+1);
		}
		System.out.println(sum);
	}
}
