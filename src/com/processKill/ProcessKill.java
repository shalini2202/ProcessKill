package com.processKill;

import java.io.IOException;

public class ProcessKill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
