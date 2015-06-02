package com.easy.challenges;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UniqElement {



	public static void main(String args[])
	{		
		try
		{
			String line = null;

			File file = new File(args[0]);
			BufferedReader in = new BufferedReader(new FileReader(file));

			while ((line = in.readLine()) != null) 
			{
				int i = 1;
				int len = 0;
				String comp = null;
				int counter = 0;
				List sortedList = new ArrayList();

				String lineArray[] = line.split(",");

				len = lineArray.length;

				comp = lineArray[0];
				System.out.print(comp);

				while (i < len)
				{
					if(comp.equals(lineArray[i]))
					{
						//do nothing
					}
					else
					{
						counter ++;
						sortedList.add(lineArray[i]);
						comp = lineArray[i];
					}
					i++;
				}
				//System.out.print("counter.. " + counter + "...");

				if(counter == 0)
				{
					//System.out.print(sortedList.get(counter - 1).toString());
				}
				else
				{
					System.out.print(",");

					for (int x = 0; x < counter - 1; x ++)
					{
						System.out.print(sortedList.get(x).toString() + ",");
					}
					System.out.print(sortedList.get(counter - 1).toString());
				}
				System.out.println("");		
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
