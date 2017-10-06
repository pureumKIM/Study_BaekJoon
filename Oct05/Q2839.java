package Oct05;

import java.util.Scanner;

public class Q2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sugar = sc.nextInt();
		int nam;
		if(sugar>=3 && sugar<=5000){
			nam = sugar;
			if(sugar%5==0){//5로 나누어떨어져야 제일 큰 값
				System.out.println(sugar/5);
				return;//리턴문으로 반환하고 멈출 수 있도록
			}else{
				int bongtu = sugar/5;
				for (int i = bongtu; i>0; i--) {//i가 1부터 올라가면 303 잘못뽑음. 
					nam = sugar - 5*i;
					if(nam%3==0){
						i += (nam/3);
						System.out.println(i);
						return;
					}//continue;
				}
			}
			if(sugar%3==0){//위에서 값이 안나오면  이쪽으로 오게됨
				System.out.println(sugar/3);
				return;
			}else{
				System.out.println(-1);
			}
			return;
		}
	}
}
