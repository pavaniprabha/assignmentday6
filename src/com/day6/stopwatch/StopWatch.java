package com.day6.stopwatch;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class StopWatch {
	private static Instant start = null;
	private static Instant stop = null;
	
	public static Instant currentTime() {
		Instant stopWatch = Instant.now();
		return stopWatch;
	}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("1.Start time\n2.Stop time\n");
    System.out.println("choose from option:");
     int option1 = sc.nextInt();
     if(option1 == 1) {
    	 start = currentTime();
     }
     int option2 = sc.nextInt();
     if(option2 == 2) {
    	 stop = currentTime();
     }  
    Duration interval = Duration.between(start, stop);
    System.out.println("Execution time in seconds: " + interval.getSeconds());
    sc.close();
  
  }

}
