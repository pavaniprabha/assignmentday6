package com.day6.perfect;

import java.util.Scanner;

public class Perfect {
	public static void main(String arg[])	
	{
	    int n,sum=0;
        Scanner sc=new Scanner(System.in);	   	 
	    System.out.println("Enter a number :");
        n=sc.nextInt();
	    int i=1;
	    while(i<=n/2)
	    {
	       if(n%i==0)
	       {
		     sum+=i;
	       }
	      i++;
	    }
	     if(sum==n)
	    {
	      System.out.println(n +" is a perfect number");
        } 
	    else
      	System.out.println(n +" is not a  perfect number"); 
	    sc.close();
	}
}