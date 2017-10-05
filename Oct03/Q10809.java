package Oct03;

import java.util.Scanner;

public class Q10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] word = sc.nextLine().toCharArray();
		int asc=0;
		
		char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] check = new int[26];
		
		for (int i = 0; i < check.length; i++) {
			check[i]=-1;
		}
		
		for (int i = 0; i < word.length; i++) {
			for (int j = 0; j < alpha.length; j++) {
				if(word[i] == alpha[j]){
					if(check[j]!=-1) {
						asc++;
					}else if(check[j]==-1){
						check[j]=asc;
						asc++;
					}
				}
			}
		}
		
		for (int i = 0; i < check.length; i++) {
			System.out.print(check[i]+" ");
		}

		}
	}

