package test6;

public class Test02 {
	public static void main(String[] args) {
		int count = 0;
		
		for(int i=0 ; i<7 ; i++) {
			if(i <= 3)
				count++;
			else
				count--;
			
			for(int j=1 ; j< 5-count ; j++) {
				System.out.print("☆");
			}
			
			for(int k=1 ; k < count*2  ; k++) { //2,
				System.out.print("★");
			}
			
			for (int j=1 ; j< 5-count ; j++)
				System.out.print("☆");
			
			System.out.println("\n");
		}
		
		System.out.println("\n");
	}//med
}//ed









