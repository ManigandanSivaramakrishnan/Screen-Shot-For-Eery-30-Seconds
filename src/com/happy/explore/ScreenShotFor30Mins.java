package com.happy.explore;

public class ScreenShotFor30Mins
{
	
	public static void main(String[] args) {
		
		try {
			CaptureScreenShotAndSaveForEvery30Secs.captureScreenShotAndSaveForEvery30Secs("/Users/manigandansivaramakrishnan/Desktop/Eclipse WS Setup/Screenshot Taker");
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
