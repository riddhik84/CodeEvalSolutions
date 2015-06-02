package com.easy.challenges;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class LowestUniqueNumber {

	public static void main(String args[])
	{
		LowestUniqueNumber lu = new LowestUniqueNumber();
		//File file = new File("C:\\workspace\\CodeEval\\CodeEval\\CodeEval\\src\\InputFiles\\LowestUniqueNumber.txt");
		File file = new File(args[0]);
		String line = "";

		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null)
			{
				//System.out.println(line);
				lu.printLowestUniqueNum(line);
			}
		} catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}

	public void printLowestUniqueNum(String line)
	{
		String[] tempArray = line.split(" ");
		ArrayList<Integer> numberArrayList= new ArrayList<Integer>();
		HashMap<Integer, Integer> occuranceMap = new HashMap<Integer, Integer>();
		int lowestKey = 0;

		// Input all numbers to ArrayList
		for(int i =0; i < tempArray.length; i++)
		{
			numberArrayList.add(Integer.parseInt(tempArray[i]));
		}

		//Sort the ArrayList
		Collections.sort(numberArrayList);

		for(int i = 0; i < numberArrayList.size(); i ++)
		{
			//System.out.print(numberArrayList.get(i) + " ");
		}
		//System.out.println();


		//Put all element's occurances in HashMap
		for(int i = 0; i < numberArrayList.size(); i ++) {
			int occurrences = Collections.frequency(numberArrayList, numberArrayList.get(i));
			//System.out.println("Occurance of " + numberArrayList.get(i) + " is " + occurrences);
			occuranceMap.put(numberArrayList.get(i), occurrences);
		}

		//System.out.print(occuranceMap);

		//Search which number has 1 occurance and print
		for (int key : occuranceMap.keySet()) {
			//System.out.println(key + " " + occuranceMap.get(key));
			if(occuranceMap.get(key) == 1)
			{
				//System.out.println("Lowest Number " + key);
				lowestKey = key;
				//System.out.println(key);
				break;
			}
		}
		//System.out.println(lowestKey);

		int position = 0;
		// Input all numbers to ArrayList
		if(lowestKey > 0)
		{
			for(int i =0; i < tempArray.length ; i++)
			{
				if(Integer.parseInt(tempArray[i]) == lowestKey)
				{
					position = i+1;
					//System.out.println("Position : " + position);
					break;
				}
			}
		}
		//System.out.println("Position : " + position);
		System.out.println(position);

	}
}

