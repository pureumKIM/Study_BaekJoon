package Oct04;

import java.util.Scanner;

public class Q2845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int person = sc.nextInt();
		int party = sc.nextInt();
		int total = person*party;
		int[] news = new int[5];
		for (int i = 0; i < news.length; i++) {
			news[i] = sc.nextInt();
		}
		for (int i = 0; i < news.length; i++) {
			int cha = news[i]-total;
			System.out.print(cha+" ");
		}
	}
}
