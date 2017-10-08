package Oct07;

import java.util.Scanner;

public class Q2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int nNum1 = reverse(num1);
		int nNum2 = reverse(num2);
		if(nNum1>nNum2){
			System.out.println(nNum1);
		}else{
			System.out.println(nNum2);
		}
	}
	public static int reverse(int num) {
		int h,t,o;
		h = num/100;
		num %= 100;
		t = num/10;
		o = num%10;
		return o*100+t*10+h;
	}
}
