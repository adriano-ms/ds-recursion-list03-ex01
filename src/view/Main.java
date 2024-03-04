package view;

import java.util.Scanner;

import controller.DigitsController;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		DigitsController dc = new DigitsController();
		
		System.out.println(dc.digitsCount(n));
		
		sc.close();
	}
}
