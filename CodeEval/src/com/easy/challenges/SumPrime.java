package com.easy.challenges;

public class SumPrime {

	public static void main(String args[]) 
	{ 
		int i = 1,j,s=0,d=0; 
		int count = 0;
		int primeSum = 0;

			while(i > 0){
				s=0; 
				for(j=1;j<=i;j++) 
				{ 
					if(i%j==0) 
						s=s+1; //to count: divided by how many numbers
				} 
				if(s==2) //if divided by exactly 2 numbers, its prime
				{ 
					count++;
					//System.out.println(i); 
					primeSum = primeSum + i;
					d=d+1; 
				}
				if(count == 1000)
				{
					System.out.println(primeSum); 
					break;
				}
				i++;
			}
		//System.out.println("the no. of prime no. are = "+d); 
	} 
}
