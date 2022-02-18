package baitap2;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Nhap a: ");
			byte a = input.nextByte();
			System.out.print("Nhap b: ");
			byte b = input.nextByte();
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
