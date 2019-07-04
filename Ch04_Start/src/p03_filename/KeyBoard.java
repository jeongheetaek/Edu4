package p03_filename;

import java.util.Scanner;

public class KeyBoard {

	public static void main(String[] args) {
		
		while(true) {
		
		try {
				Scanner sc = new Scanner(System.in);
				String str = sc.next();
				System.out.println("String " + str);
				int num = sc.nextInt();
				System.out.println("Number " + num);
				
				sc.close();
				
			} catch (Exception e) {
				System.out.println("Wrong");
				break;
		}
		}
		
	}

}
