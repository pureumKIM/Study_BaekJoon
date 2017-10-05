package Oct04;

import java.util.Scanner;

public class Q3460 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] num = new int[size];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			convert(num[i]);
		}
	}
	static void convert(int num) {
		// TODO Auto-generated method stub
		char[] ch = Integer.toBinaryString(num).toCharArray();
		for (int i = ch.length-1; i >= 0; i--) {
			if(ch[i]=='1'){
				System.out.print((ch.length-i-1)+" ");
			}
		}
		System.out.println();
	}
}
