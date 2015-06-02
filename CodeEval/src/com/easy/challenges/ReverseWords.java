package com.easy.challenges;

import java.io.*;

public class ReverseWords {

	public static void main(String args[]){

		try{
			String line = null;
			String[] result = null;
			String[] wordsPerLine = null;
			
			File file = new File("rwords.txt");
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);

			while((line = br.readLine()) != null)
			{
				result = line.split("\n");
				
				for (String token:result){
					wordsPerLine = line.split(" ");
				}
				//System.out.println(wordsPerLine.length);
				for(int i = wordsPerLine.length - 1; i >= 0; i--)
				{
					System.out.print(wordsPerLine[i] + " ");
				}			
				System.out.print("\n");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
