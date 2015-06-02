package com.easy.challenges;

public class PrimePalindrome {

	public static void main(String args[]) 
	{ 
		int i,j,s=0,d=0; 
		int num1, num2;

		for(i=1000;i>0;i--) 
		{ 
			s=0; 
			for(j=1;j<=i;j++) 
			{ 
				if(i%j==0) 
					s=s+1; 
			} 
			if(s==2) 
			{ 
				//System.out.println("prime: "+i);
				num1 = i;
				num2 = i;
				int reverse=0,remainder;
				while(num1 > 0){
					remainder = num1 % 10;
					reverse = reverse * 10 + remainder;
					num1 = num1 / 10;
				}
				if(reverse == num2){
					System.out.println(num2);
					break;
				}
				//else
					//System.out.println(num+" is not a Palindrome Number");
				
				d=d+1; 
			} 
		} 
		//System.out.println("the no. of prime no. are = "+d); 
	} 
}

