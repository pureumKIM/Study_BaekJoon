package Oct05;

import java.util.Scanner;

public class Q1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt();
		int day = sc.nextInt();
		int sum=day;
		//1월 1일이 월요일 이므로 1월은 31(x) 31 -1 = 30으로 
		
		int[] month = {30, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(mon==1){//1월달의 경우에는!
			sum -=1;
		}else{
			for (int i = 0; i < mon-1; i++) {
				sum += month[i];
			}
		}

		switch (sum%7) {
		case 0:
			System.out.println("MON");
			break;
		case 1:
			System.out.println("TUE");
			break;
		case 2:
			System.out.println("WED");
			break;
		case 3:
			System.out.println("THE");
			break;
		case 4:
			System.out.println("FRI");
			break;
		case 5:
			System.out.println("SAT");
			break;
		case 6:
			System.out.println("SUN");
			break;

		default:
			break;
		}
	}
}
