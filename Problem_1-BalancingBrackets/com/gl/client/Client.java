package com.gl.client;

import java.util.Scanner;

import com.gl.service.BracketsServiceImpl;

public class Client {
	public static void main(String args[]) {

		BracketsServiceImpl b = new BracketsServiceImpl();
		System.out.println("Enter the String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if (b.isBalanced(str)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}
}
