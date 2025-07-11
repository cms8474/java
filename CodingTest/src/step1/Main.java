package step1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 현재 시_24가 되면 0이 된다!
		int b = sc.nextInt(); // 현재 분
		int c = sc.nextInt(); // 가중 분
		int add		= ((b+c)/60); // 결과시 가중치(분의 초과 시)

		int resultA = (a+add)%24; // 결과 시
		int resultB = (b+c)%60; // 결과 분_60초과 = 시침 + 1
		
		if(resultA>=24) {
			System.out.printf("%d %d",resultA-24,resultB);
		}else {
			System.out.printf("%d %d",resultA,resultB);
		}

	}
}