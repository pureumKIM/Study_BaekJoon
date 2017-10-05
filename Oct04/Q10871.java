package Oct04;

import java.util.Scanner;

public class Q10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int x = sc.nextInt();
		
		int[] set = new int[size];
		for (int i = 0; i < set.length; i++) {
			set[i]=sc.nextInt();
		}
		for (int i = 0; i < set.length; i++) {
			if(set[i]<x){
				System.out.print(set[i]+" ");
			}
		}
	}
}
