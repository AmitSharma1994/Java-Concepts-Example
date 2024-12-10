package com.javaeight.lamda;

import java.util.Arrays;
import java.util.List;

//find the smallest positive number from Arrays
public class SmallestPostitive {

	public static void main(String[] args) {

		// WAP to find the summation of a number with out using any loop or any formula
		// example -
		// input n = 5
		// 5+4+3+2+1 = 15

//	int	arr[][] ={{2, 3},{4, 5}};
		
		
	int [][] arr=  {{4,10,6},
					{17,0,12},
					{5,15,13}};
	
				//	{4,17,5},
					//{10,0,15},
				//	{6,12,13}}
	
			for(int i=0;i<arr.length;i++) {
				
				for(int j=0;j<arr.length;j++) {
					
					if(i==j) {
						continue;
					}
					else {
						int temp=arr[i][j];
						
						arr[i][j]=arr[j][i];
						
						arr[j][i]=temp;	
					}
					
				}
					
			}
			
			for(int[] rows:arr) {
				
				for(int i=0;i<rows.length;i++) {
					
					System.out.print(rows[i]);
					
				}
				System.out.println();
			}
	
			
		
	}

}
