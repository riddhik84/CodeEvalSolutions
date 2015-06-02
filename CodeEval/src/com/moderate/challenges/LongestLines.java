package com.moderate.challenges;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static java.lang.System.out;

public class LongestLines {

	public static void main(String args[])
	{
		LongestLines l = new LongestLines();
		String line;
		//File file = new File(args[0]);
		File file = new File("C:\\Users\\rkakadia\\git\\CodeEval\\src\\com\\moderate\\inputFiles\\LongestLines.txt");
		ArrayList<String> fileInput = new ArrayList<String>();
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null)
			{
				//out.println(line);
				fileInput.add(line);
			}

			l.printLongestLines(fileInput);

		} catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

	public void printLongestLines(ArrayList<String> fileInput)
	{
		int linePrintCount = Integer.parseInt(fileInput.get(0));
		//out.println("linePrintCount " + linePrintCount);
		HashMap<String, Integer> lineLenghtMap = new HashMap<>();
		ArrayList<Integer> lineLenght = new ArrayList<Integer>();

		for(int i = 1; i < fileInput.size(); i++)
		{
			//out.println(fileInput.get(i).length());
			lineLenghtMap.put(fileInput.get(i), fileInput.get(i).length());
			lineLenght.add(fileInput.get(i).length());
		}

		//out.println(lineLenghtMap);
		Collections.sort(lineLenght);
		//out.println(lineLenght);
		Collections.reverse(lineLenght);
		//out.println(lineLenght);


		for(int i = 0; i < linePrintCount; i++)
		{
			for(String key : lineLenghtMap.keySet())
			{
				//out.print(lineLenghtMap.get(key) + "=");
				//out.println(lineLenght.get(i));

				if(lineLenght.get(i) == lineLenghtMap.get(key))
				{
					out.println(key);
				}
			}
		}
	}

}
