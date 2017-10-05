package Oct04;

import java.util.Scanner;

public class Q6378 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.next();
			if(str.equals("0")) break;
			int dab = Integer.parseInt(str);
			while(dab>10){
				dab = digit(dab);
			}
			System.out.println(dab);
		}
	}
	public static int digit(int num) {
		// TODO Auto-generated method stub
		int nam =0;
		int sum =0;
			while(num>0){
				nam = num%10;
				sum += nam;
				num /= 10;
			}
		return sum;
	}
}
