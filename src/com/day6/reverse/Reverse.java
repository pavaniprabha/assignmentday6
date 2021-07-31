package com.day6.reverse;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
	int remainder;
	int reverse=0,
	number;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number :");
    number=sc.nextInt();
	while(number!=0)
	{
	remainder = number%10;
	reverse =(reverse*10)+remainder;
	number = number/10;
	}
	System.out.println("reverse of a number is "+reverse);
	sc.close();
	}
}

