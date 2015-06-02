package com.easy.challenges;

import java.io.*;
import java.util.Arrays;

public class SimpleSort {
	
	public static void main(String args[])
	{
		SimpleSort ss = new SimpleSort();
		//File file = new File("C:\\workspace\\CodeEval\\src\\InputFiles\\SimpleSort.txt");
		File file = new File(args[0]);
		String line;
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null)
			{
				//System.out.println("Input line: " +line);
				ss.doSimpleSort(line);
			}
		} catch (FileNotFoundException fnf)
		{
			fnf.printStackTrace();
		} catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

	public void doSimpleSort(String line)
	{
		String[] values = line.split(" ");
		float[] floatValues = new float[values.length];
		
		for(int i = 0; i < values.length; i ++)
		{
			floatValues[i] = Float.parseFloat(values[i]);
		}
		
		Arrays.sort(floatValues);
		
		for(int i = 0; i < floatValues.length; i++)
		{
			System.out.print(String.format("%.3f", floatValues[i]));
			System.out.print(" ");
		}
		System.out.println("");
	}
}
