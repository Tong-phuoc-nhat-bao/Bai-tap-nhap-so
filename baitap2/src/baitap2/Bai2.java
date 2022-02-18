package baitap2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Nhap a: ");
			int a = input.nextInt();
			System.out.print("Nhap b: ");
			int b = input.nextInt();
			System.out.println("a+b="+ (a+b));
			System.out.println("a-b="+ (a-b));
			System.out.println("a*b="+ (a*b));
			System.out.println("a/b="+ (a/b));
			System.out.println("a%b="+ (a%b));
		} catch(Exception e) { 
			System.out.print("Nhap sai du lieu.");
		}
	}


}
