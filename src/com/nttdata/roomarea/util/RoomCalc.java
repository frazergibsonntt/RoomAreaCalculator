package com.nttdata.roomarea.util;

import java.util.Scanner;

public class RoomCalc {
	public void RoomCalcMeth() {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("What is the length of the room in feet?");
		double length = myObj.nextInt();
		
		System.out.println("What is the height of the room in feet");
		double height = myObj.nextInt();
		
		double areaF = length * height;
		double areaM = areaF * 0.09290304;
		
		System.out.println("The area of the room is:" + "\n" + areaF + " in feet" + "\n"+ areaM + " in meters");
		System.out.println("\n"+"Thankyou for choosing the NTTDATA, the trusted global innovator.");
	}
}
