package _01_methods._1_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	
	
	public void run() {
	
		
		
		Robot rob = new Robot();
		rob.setSpeed(100);
		rob.moveTo(60, 500);

		for (int i = 0; i < 10; i++) {
			drawHouse(rob, "large", Color.black);
		}
	}

	public void drawHouse(Robot rob, String height, Color color) {
		int numHeight = 0;
		if(height.equals("small"))
		numHeight = 60;
		if(height.equals("medium"))
			numHeight = 120;
		if(height.equals("large"))
			numHeight = 250;
		rob.setPenColor(color);
		rob.penDown();
		rob.setAngle(0);
		rob.move(numHeight);

		if (numHeight == 250) {
			drawFlatRoof(rob);
		} else {
			drawPointyRoof(rob);
		}

		rob.move(numHeight);
		rob.setAngle(90);
		rob.setPenColor(0,255,0);
		rob.move(20);
		rob.setAngle(270);
	}

	
	

	private void drawPointyRoof(Robot rob) {
		rob.setAngle(45);
		rob.move(20);
		rob.setAngle(135);
		rob.move(20);
		rob.setAngle(180);
	}

	private void drawFlatRoof(Robot rob) {
		rob.setAngle(90);
		rob.move(20);
		rob.setAngle(180);
	}
}