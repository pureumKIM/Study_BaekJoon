package Oct04;

import java.util.Scanner;

public class Q2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sugar = sc.nextInt();
		int bongtu=0;
		int nam;
		if(sugar>=3 && sugar<=5000){
			
			if(sugar%5==0){
				System.out.println(sugar/5);
				return;
			}else {
				bongtu = sugar/5;
				nam = sugar%5;
				if(nam>=3){
					bongtu = bongtu+ (nam/3);
					nam = nam%3;
				}else if(nam<3){
					bongtu = sugar/3;
					nam = sugar%3;
					if(nam==0){
						System.out.println(bongtu);
					}else{
						bongtu = sugar/3;
						nam = sugar%3;
					
					}
				}
				
				if(nam==0){
					System.out.println(bongtu);		
					return;
				}else if(nam!=0){
				}
			}
					
			if(sugar%3==0){
				System.out.println(sugar/3);
			}else{
				System.out.println(-1);
			}

		}
	}
}
