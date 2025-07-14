package step1;
// https://www.acmicpc.net/problem/2439
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		while(true) {
			int i = 0;
			System.out.print(" ".repeat(--N));
			System.out.print("*".repeat(++i));
			if(i>0) {System.out.println();}
			if(N<0) {break;}
		}
		
		

	} 	// main ed
} 		// class ed 
