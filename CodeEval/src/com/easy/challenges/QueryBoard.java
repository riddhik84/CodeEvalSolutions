package com.easy.challenges;

import java.io.*;

public class QueryBoard {
	
	int[][] queryBoard = new int[256][256];
	int totalSum;
	
	public static void main(String args[])
	{
		QueryBoard qb = new QueryBoard();
		//File file = new File("C:\\workspace\\CodeEval\\src\\InputFiles\\QueryBoard.txt");
		File file = new File(args[0]);
		String line;
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null)
			{
				//System.out.println("Input command: " + line);
				qb.outputQueryBoard(line);
			}
		} catch (FileNotFoundException fnf)
		{
			fnf.printStackTrace();
		} catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void outputQueryBoard(String line)
	{
		//int[][] queryBoard = new int[256][256];
		//int totalSum;
		int column = 0;
		int row = 0;
		int value = 0;
		
		String[] commands = line.split(" ");
		
		if(commands[0] != null)
		{
			if(commands[0].equals("SetCol"))
			{
				//System.out.println("SetCol ");
				column = Integer.parseInt(commands[1]);
				//System.out.println("column number: " +column);
				value = Integer.parseInt(commands[2]);
				//System.out.println("column value: "+value);
				
				for(int rowCount = 0; rowCount < 256; rowCount++)
				{
					for(int colCount = 0; colCount < 256; colCount++)
					{
						if(colCount == column)
						{
							//System.out.println("colCount: "+colCount);
							queryBoard[rowCount][colCount] = value;
							//System.out.println("queryBoard[rowCount][colCount]" + queryBoard[rowCount][colCount]);
						}
					}
				}
			} 
			
			if(commands[0].equals("SetRow"))
			{
				//System.out.println("SetRow ");
				row = Integer.parseInt(commands[1]);
				//System.out.println("row number: " +row);
				value = Integer.parseInt(commands[2]);
				//System.out.println("row value: "+value);
				
				for(int rowCount = 0; rowCount < 256; rowCount++)
				{
					for(int colCount = 0; colCount < 256; colCount++)
					{
						if(rowCount == row)
						{
							//System.out.println("rowCount: "+rowCount);
							queryBoard[rowCount][colCount] = value;
							//System.out.println("queryBoard[rowCount][colCount]" + queryBoard[rowCount][colCount]);
						}
					}
				}
			}
			
			if(commands[0].equals("QueryCol"))
			{
				//System.out.println("QueryCol ");
				column = Integer.parseInt(commands[1]);
				//System.out.println("column number: " +column);
				
				for(int rowCount = 0; rowCount < 256; rowCount++)
				{
					for(int colCount = 0; colCount < 256; colCount++)
					{
						if(colCount == column)
						{
							//System.out.println("colCount: "+colCount);
							//System.out.println("Value: "+queryBoard[rowCount][colCount]);
							totalSum = totalSum + queryBoard[rowCount][colCount];
							//System.out.println("TotalSum " + totalSum);
						}
					}
				}
				//System.out.println("TotalSum " + totalSum);
				System.out.println(totalSum);

			}
			
			if(commands[0].equals("QueryRow"))
			{
				//System.out.println("QueryRow ");
				row = Integer.parseInt(commands[1]);
				//System.out.println("row number: " +row);
				
				for(int rowCount = 0; rowCount < 256; rowCount++)
				{
					for(int colCount = 0; colCount < 256; colCount++)
					{
						if(rowCount == row)
						{
							//System.out.println("rowCount: "+rowCount);
							//System.out.println("Value: "+queryBoard[rowCount][colCount]);
							totalSum = totalSum + queryBoard[rowCount][colCount];
							//System.out.println("TotalSum " + totalSum);
						}
					}
				}
				//System.out.println("TotalSum " + totalSum);
				System.out.println(totalSum);
			}
		}		
		//System.out.println("TotalSum " + totalSum);
		totalSum = 0;
	}

}
