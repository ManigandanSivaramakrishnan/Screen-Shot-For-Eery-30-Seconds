package com.happy.explore;

import java.util.Timer;
import java.util.TimerTask;

public class CaptureScreenShotAndSaveForEvery30Secs {
	
	public static void captureScreenShotAndSaveForEvery30Secs(String directorypath) throws Exception{
		
		Timer timer = new Timer();
		
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				try {
					String fileName = CaptureScreenShotAndSaveToFile.captureScreenShotAndSaveToFile(directorypath);
					System.out.println("Screenshot Saved As " + fileName);
				}
				
				catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
		},0, 30 * 1000);
		
	}
	
	
}
