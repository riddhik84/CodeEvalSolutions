package com.easy.challenges;

import java.io.*;
import static java.lang.System.out;

public class CalculateDistance {

	public static void main(String args[])
	{
		CalculateDistance cd = new CalculateDistance();
		try
		{
			//File file = new File(args[0]);
			File file = new File("C:\\workspace\\CodeEval\\src\\InputFiles\\CalculateDistance.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;

			while((line = br.readLine()) != null)
			{
				//System.out.println("Original: " + line);
				if(line.length() > 0)
				{
					cd.calcDistance(line);
				}
			}
		} catch (FileNotFoundException fnf)
		{
			fnf.printStackTrace();
		} catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void calcDistance(String line)
	{
		String tempLine = line;
		tempLine = tempLine.replace("(", "");
		tempLine = tempLine.replace(")", "");
		tempLine = tempLine.replace(",", "");
		//out.println(tempLine);
		
		String[] axisVal = tempLine.split(" ");
		int x1 = Integer.parseInt(axisVal[0]);
		int x2 = Integer.parseInt(axisVal[1]);
		int y1 = Integer.parseInt(axisVal[2]);
		int y2 = Integer.parseInt(axisVal[3]);
		
		int distance = 0;
		
		distance = ((x1 - y1) *  (x1 - y1))+ ((x2 - y2) * (x2 - y2));
		distance = (int) Math.sqrt(distance);
		out.println(distance);
	}
}
