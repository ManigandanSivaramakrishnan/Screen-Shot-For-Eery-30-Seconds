package com.happy.explore;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class CaptureScreenShotAndSaveToFile {
	
	public static String captureScreenShotAndSaveToFile(String directoryPath) throws Exception{
		
		Robot robot = new Robot();
		Rectangle screenRect = new Rectangle(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage screenCaptureImage = robot.createScreenCapture(screenRect);
		
		String fileNameOfTheScreenShotsStored = "Screenshot_" + System.currentTimeMillis() + ".png";
		File outputFileOfTheScreenShotStored = new File(directoryPath, fileNameOfTheScreenShotsStored);
		
		ImageIO.write(screenCaptureImage, "png", outputFileOfTheScreenShotStored);
		
		System.out.println("Screenshot saved as " + outputFileOfTheScreenShotStored.getAbsolutePath());
		return fileNameOfTheScreenShotsStored;
		
		
		
	}

}
