package Oct05;

import java.util.Scanner;

public class Q11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String str = sc.next();//공백없이 숫자를 입력받는다.
		char ch [] = str.toCharArray();
		int num, sum=0;
		for (int i = 0; i < size; i++) {
			num = ch[i]-'0';//정수로 바꿔주는 부분
			sum += num;
		}
		System.out.println(sum);
	}
}
