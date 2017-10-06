package Oct05;

import java.util.Scanner;

public class Q11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch [] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if(i>0&&i%10==0){//이곳이 포인트
				System.out.println();
			}
			System.out.print(ch[i]);
		}
	}
}
