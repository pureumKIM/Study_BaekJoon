package Oct05;

import java.util.Scanner;

public class Q2440 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
