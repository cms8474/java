package p96;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수를 입력하시오: ");
		int number = scanner.nextInt(); // 정수입력받기
		if (number % 3 == 0)
			System.out.println("3의 배수");
		else
			System.out.println("3배수 아님");
		
		scanner.close();
	}

}
