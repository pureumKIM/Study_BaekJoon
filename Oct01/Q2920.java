package Oct01;

import java.util.Scanner;

public class Q2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] music = new int[8];
		int asc = 0;//ascending 이면 asc를 1로 바꾼다.
		int des = 0;//descending이면 des를 1로 바꾼다.
		for (int i = 0; i < music.length; i++) {
			music[i]=sc.nextInt();
		}
		
		if(music[0]==1){
			asc=1;
			for (int i = 0; i < music.length-1; i++) {
				if(music[i]+1 != music[i+1]) asc = 0;//하나라도 다르면 0으로 바뀜
			}
		}else if(music[0]==8){
			des = 1;
			for (int i = 0; i < music.length-1; i++) {
				if(music[i]-1 != music[i+1]) des = 0;//하나라도 다르면 0으로 바뀜
			}
		}
		
		if(asc == 0 && des ==0){
			System.out.println("mixed");
		}else if(asc == 1){
			System.out.println("ascending");
		}else if(des == 1){
			System.out.println("descending");
		}
		
	}
}
