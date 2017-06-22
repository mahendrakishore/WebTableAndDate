package com.robot;


import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class RobotScreenshot {


	public static void robotScreenshot(String name) throws Exception{
		
		BufferedImage bi = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(bi, "png", new File("C:\\Screenshot\\Robot\\"+name+".png"));
	}


}
