package com.greatlearning.paymoney;

import java.util.Scanner;

public class TransactionCheck {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array.");
		int transSize=sc.nextInt();
		
		System.out.println("enter the values of array");
		int[] transactions=new int[transSize];
		for(int i=0;i<transSize;i++){
			transactions[i]=sc.nextInt();
			
		}
		System.out.println("Enter the the total number of target that needs to achieve");
		int targetSize=sc.nextInt();
		
		for(int i=0;i<targetSize;i++){
			System.out.println("enter the value of target");
			int target=sc.nextInt();
			int result=getNoOfTransactionForTarget(transactions,target);
			if (result>0) {
				System.out.println("Target achieved after "+result+ " transactions");
			}else {
				System.out.println(" Given target is not achieved ");
			}
			
		}
		
		sc.close();
	}
	
	
	private static int getNoOfTransactionForTarget(int[] transactions,int target) {
	int sum=0;
	for(int i=0;i<transactions.length;i++) {
		sum +=transactions[i];
		if(sum>=target) {
			return i+1;
		}
	}
	return -1;
	}

}
