package Oct07;

import java.util.Scanner;

public class Q9663 {
	static int[] cols;
	static int cnt=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		cols = new int [num];
		System.out.println(nQueen(0));
	}
	public static int nQueen(int level){
		int n = cols.length;
			if(level==n){
				cnt++;
				return 1+cnt;
			}else{
				for (int j = 0; j < n; j++) {
					cols[level]=j;
					if(isPossible(level)){
						nQueen(level+1);
					}
				}
			}
			return 0+cnt;
	}
	public static boolean isPossible(int level) {
		for (int i = 0; i < level; i++) {
			if(cols[i]==cols[level]|| level-i==Math.abs(cols[level]-cols[i])){
				return false;
			}
		}
		return true;
	}
	
}
