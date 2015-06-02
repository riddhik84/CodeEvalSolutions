package com.easy.challenges;

import java.io.*;

public class FileSize {

	public static void main(String args[])
	{
		String fileName = null;
		Long fileLen = 0L;
		
		try{
			
			fileName = args[0];
			File file = new File(fileName);
			
			if (!file.exists() || !file.isFile()) {
		         System.out.println("File doesn\'t exist");
		     }

			fileLen = file.length();
			System.out.println(fileLen);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
