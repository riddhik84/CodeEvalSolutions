package com.easy.challenges;

import java.io.*;

public class JSonMenuIDs {
	
	public static void main(String args[])
	{
		JSonMenuIDs jd = new JSonMenuIDs();
		//File file = new File(args[0]);
		File file = new File("C:\\workspace\\CodeEval\\CodeEval\\CodeEval\\src\\InputFiles\\JsonMenuIDs.txt");
		String line;
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null)
			{
				//System.out.println(line);
				jd.calculateMenuIDs(line);
			}
		} catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void calculateMenuIDs(String line)
	{
		String[] tempDiv = line.split("\\[");
		//System.out.println("Part 1:" + tempDiv[0]);
		//System.out.println("Part 2:" +tempDiv[1]);
		int sum = 0;
		
		if(tempDiv[1].contains("Label"))
		{
			//System.out.println("Contains Label:" +tempDiv[1]);
			tempDiv[1] = tempDiv[1].replace(" ", "");
			//System.out.println("Contains Label:" +tempDiv[1]);
			
			String[] splitLine = tempDiv[1].split(",");
			for(int i =0; i < splitLine.length; i++)
			{
				//System.out.println("Contains Label:" +splitLine[i]);
				splitLine[i] = splitLine[i].replace("{", "");
				splitLine[i] = splitLine[i].replace("}", "");
				splitLine[i] = splitLine[i].replace("\"", "");
				splitLine[i] = splitLine[i].replace("]", "");
				//System.out.println("Contains Label:" +splitLine[i]);
				
				if(splitLine[i].contains("Label"))
				{
					String[] labelSplit = splitLine[i].split(":");
					//System.out.println("Contains Label:" +labelSplit[1]);
					labelSplit[1] = labelSplit[1].replace("Label", "");
					//System.out.println(labelSplit[1]);
					sum = sum + Integer.parseInt(labelSplit[1]);
				}
			}
			System.out.println(sum);
		} else
		{
			System.out.println(sum);
		}
	}
}
