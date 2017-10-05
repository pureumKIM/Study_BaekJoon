package Oct04;

import java.util.Scanner;

public class A6378 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String str = sc.next();
			if(str.equals("0")) break;
			char[] ch = str.toString().toCharArray();
			int sum=0;
			while(true){
				sum=0;
				for (int i = 0; i < ch.length; i++) {
					sum += ch[i]-'0';
				}
				if(sum>=10){
					ch = String.valueOf(sum).toCharArray();
				}else{
					break;
				}
			}
			System.out.println(sum);
		}
	}
}
