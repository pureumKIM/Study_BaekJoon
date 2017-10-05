package Oct03;

import java.util.ArrayList;

public class Q4673 {
	public static void main(String[] args) {
		int[] number = new int[10001];
		int arr;
		int j;
		for (int i = 1; i < number.length; i++) {
			j=i;
			if(number[j] == 0){
				//함수를 부른다. i값 = 시작값.
				while(j<10000){
					arr = producer(j);
					if(arr>10000) break;
					number[arr]=1;
					j = arr;
				}
			}
		}

		for (int i = 1; i < number.length; i++) {
			if(number[i] == 0){
				System.out.println(i);
			}
		}
		
		
	}
	static int producer(int num) {
		int sum=0;
		int nam=0;
		sum += num;
		while(num>0){
			nam = (num%10);
			sum += nam;
			num/=10;
		}		
		return sum;
	}
}
