package baitap2;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Nhap a: ");
			double a = input.nextDouble();
			System.out.print("Nhap b: ");
			double b = input.nextDouble();
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
