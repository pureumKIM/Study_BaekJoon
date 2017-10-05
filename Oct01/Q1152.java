package Oct01;

import java.util.Scanner;

public class Q1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str.trim();
		String[] word = str.split(" ");

		int cnt=0;
		for (int i = 0; i < word.length; i++) {
			if(!word[i].equals("")){//문자끼리 비교이므로, word[i] != ""(X)
				cnt ++;
			}
		}
		System.out.println(cnt);
	}
}
