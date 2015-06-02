package com.easy.challenges;

import java.io.*;

public class Multiples {

	public static void main(String args[])
	{
		try{
			String line = null;
			String result[] = null;
			int x = 0;
			int n = 0;

			File file = new File("multiples.txt");
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);

			while((line = br.readLine()) != null)
			{
				result = line.split(",");
				//System.out.print("0 "+ result[0] + " 1 "+ result[1] );	
				x = Integer.parseInt(result[0]);
				n = Integer.parseInt(result[1]);

				if(n > x)
				{
					System.out.print(n);	
				}
				else
				{
					while(n < x)
					{
						n = n * 2;
						if(n > x)
						{
							System.out.print(n);	
							break;
						}
					}
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
