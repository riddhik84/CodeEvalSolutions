package com.easy.challenges;

import java.io.*;

public class Position {

	public static void main(String args[]) {
		try{
			String line = null;
			String result[] = null;
			String decimal = null;
			int toNumber = 0;
			String binary = null;
			int p1= 0;
			int p2 = 0;
			int strLen = 0;
			int totalBits = 0;
			
			File file = new File("position.txt");
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			
			while((line = br.readLine()) != null)
			{
				result = line.split(",");
				decimal = result[0].trim();
				toNumber = Integer.parseInt(decimal);  
				binary = Integer.toBinaryString(toNumber);
				//System.out.print("Binary: " + binary + " ");
				
				p1 = Integer.parseInt(result[1]);
				p2 = Integer.parseInt(result[2]);
				strLen = binary.length();
				
				if(toNumber > 255)
				{
					while(strLen < 12)
					{
						binary = "0" + binary;
						strLen++;
					}
					totalBits = 12;
				}
				if(toNumber < 255 && toNumber > 0)
				{
					while(strLen < 8)
					{
						binary = "0" + binary;
						strLen++;
					}
					totalBits = 8;
				}
				//System.out.print("Binary: " + binary + " ");
				//System.out.print("Binary len: " + strLen+ " ");
				
				//System.out.print(binary.charAt(totalBits - p1) +" "+ binary.charAt(totalBits - p2)+" ");
				
				//if((binary.charAt(8 - p1)) == (binary.charAt(8 - p2)))
				if((binary.charAt(totalBits - p1)) == (binary.charAt(totalBits - p2)))
				{
					System.out.print("true");
				}
				else
				{
					System.out.print("false");
				}				
				System.out.print("\n");
			}

		}
		catch(Exception e )
		{
			e.printStackTrace();
		}
	}
}
