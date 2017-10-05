package Oct03;

import java.util.Scanner;

public class A10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] word = sc.nextLine().toCharArray();
		int[] check = new int[26];
		int asc = 0;
		for (int i = 0; i < check.length; i++) {
			check[i]=-1;
		}
		for (int i = 0; i < word.length; i++) {
			int num = word[i]-97;
			if(check[num]==-1){
				check[num]=asc;
				asc++;
			}else if(check[num]!=-1) asc++;

		}
		for (int i = 0; i < check.length; i++) {
			System.out.print(check[i]+" ");
		}
		
	}
}
