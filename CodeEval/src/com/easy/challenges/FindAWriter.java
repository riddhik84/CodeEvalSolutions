package com.easy.challenges;

import java.io.*;
import static java.lang.System.out;

public class FindAWriter {
	
	public static void main(String args[])
	{
		FindAWriter fw = new FindAWriter();
		//File file = new File(args[0]);
		File file = new File("C:\\workspace\\CodeEval\\src\\InputFiles\\FindAWriter.txt");
		String line;
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null)
			{
				//out.println("Original line:" +line);
				if(line.length() > 1)
				{
					fw.findAWriter(line);
				}	
			}
		} catch(FileNotFoundException fnf)
		{
			fnf.printStackTrace();
		} catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void findAWriter(String line)
	{
		//out.println("line :" + line);

		String[] nameKeySeperator = line.split("\\|");		//Important
		String hiddenName = nameKeySeperator[0];
		String keyList = nameKeySeperator[1];
		
		//out.println("hiddenName :" + hiddenName);
		//out.println("keyList :" + keyList);

		char[] writerNameChars = hiddenName.toCharArray();
		//out.println("writerNameChars len: " + writerNameChars.length);
		
		for(int i = 0; i < writerNameChars.length; i++)
		{
			//out.println(writerNameChars[i]);
		}
		
		String[] keyChars = keyList.split(" ");
		//out.println("keyChars len: " + keyChars.length);
		
		for(int i = 0; i < keyChars.length; i++)
		{
			keyChars[i] = keyChars[i].trim();
			//out.println(keyChars[i]);
		}

		int[] keys = new int[keyChars.length];
		for(int i = 0; i < keys.length; i++)
		{
			if(!keyChars[i].equals(""))
			{
				keys[i] = Integer.parseInt(keyChars[i]);
				//out.println(keys[i]);
			}
		}
		//out.println("keys len: " + keys.length);
		
		int tempKey = 0;
		for(int x = 0; x < keys.length; x++)
		{
			if(keys[x] > 0)
			{
				tempKey = keys[x] - 1;
				out.print(writerNameChars[tempKey]);
			}
		}
		out.println();
	}
}
