package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		
	public void run() {
		// Check the recipe to find out what code to put here
	}
	public static void main(String [] args) {
	Robot rob = new Robot();
	rob.moveTo(0, 500);
	rob.penDown();
	rob.setAngle(90);
	rob.move(100);
	rob.setAngle(0);
	rob.move(20);
	rob.setAngle(270);
	rob.move(100);
	rob.setAngle(0);
	rob.setPenColor(0,255,0);
	rob.move(20);
	}
}
