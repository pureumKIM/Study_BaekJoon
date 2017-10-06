package Oct05;

import java.util.Scanner;

public class Q10817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextInt();
		}
		int temp=0;//정렬하려면 사이즈만큼은 돌려야..?
		for (int j = 0; j < num.length; j++) {
			for (int i = 0; i < num.length-1; i++) {
				if(num[i]<=num[i+1]){//10 10 20도 제대로
					temp = num[i];
					num[i]= num[i+1];
					num[i+1]=temp;

				}
			}
		}
		System.out.print(num[1]);
	}
}
