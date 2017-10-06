package Oct05;

import java.util.Scanner;

public class Q4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int garo = sc.nextInt();
		double [][] score = new double[garo][];
		//double로 해야함 3/7 다 이런거라.. int로 하면 1or0이 나옴
		for (int i = 0; i < score.length; i++) {
			int sero = sc.nextInt();
			score[i] = new double[sero];
			for (int j = 0; j < sero; j++) {
				score[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < score.length; i++) {
			int sum=0;
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
			int avg = sum/score[i].length;
			double cnt=0;
			for (int j = 0; j < score[i].length; j++) {
				if(avg<score[i][j]) cnt++;
			}
			double n = score[i].length;
			System.out.printf("%.3f",cnt/(score[i].length)*100);
			System.out.print("%");
			System.out.println();
//			System.out.println(Math.round(cnt/(score[i].length)*100)+"%");
		}
	}
}
