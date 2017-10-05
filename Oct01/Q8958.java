package Oct01;

import java.util.Scanner;

public class Q8958 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int total=0;
		int each = 0;
		
		String[] str = new String[num];
		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}		

		for (int i = 0; i < str.length; i++) {
			
			char[] ch = str[i].toCharArray();
			
			for (int j = 0; j < ch.length; j++) {

				if(ch[j]=='O'){
					if(each>=1){
						each+=1;
					}else{
						each=1;
					}
					total += each;
				}else if(ch[j] =='X'){
					each=0;
				}
			}
			System.out.println(total);//이렇게 if문 안에 i 각각 프린트
			total =0;
			each =0;
		}

	}
}
