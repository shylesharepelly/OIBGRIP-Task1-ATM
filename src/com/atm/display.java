package com.atm;
import java.util.Scanner;
import java.io.*;
public class display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=100000;
		int oldbalance=0;
	    int withdrawal,deposit;
	    int userid=9999;
	    int pin=1234;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Please enter your userid : ");
	    int uname=sc.nextInt();
	    System.out.println("Please enter your pin : ");
	    int pwd=sc.nextInt();
	    int count=1;
	    if(uname!=userid | pwd!=pin)
	    {
	    	while(true) {
	    		count++;
	    		System.out.println("Wrong pin Number or userid! Max. Attempts:3");
	    		System.out.println("Please re-enter your userid : ");
	    	    uname=sc.nextInt();
	            System.out.println("Please Re-enter your pin");
	            pwd=sc.nextInt();
	            if(uname==userid & pwd==pin)
	            {
	                break;
	            }
	            if(count==3){
	                System.out.println("You have exceeded daily trials limit ! Come back tommorow !");
	                System.exit(0);
	            }
	    	}
	    }
	    if(uname==userid)
	    {
	    	if(pwd==pin)
	    	{
	    		System.out.println("Welcome");
	    		while(true)
	    		{
	    			System.out.println("enter 1 for Transaction history");
	    			System.out.println("enter 2 for Withdrawal");
	    			System.out.println("enter 3 for deposit");
	    			System.out.println("enter 4 for transfer funds");
	    			System.out.println("enter 5 for exit");
	    			int choice=sc.nextInt();
	    			switch(choice)
	    			{
	    			case 1:
	    				System.out.println("transaction history");
	    				if(oldbalance<0)
	    				{
	    					System.out.println("money withdrawn is"+oldbalance);
	    				}
	    				else if(oldbalance==0)
	    				{

		    				System.out.println("no transactions");
	    				}
	    				else
	    				{
	    					System.out.println("money deposited is"+oldbalance);
	    				}
	    				break;
	    			case 2:
	    				System.out.println("Enter withdrawal amount");
	    				withdrawal=sc.nextInt();
	    				if(balance>=withdrawal)
	    				{
	    					System.out.println("withdrawal successful");
	    					oldbalance=-withdrawal;
	    					balance=balance-withdrawal;
	    					System.out.println("available balance is"+balance);
	    				}
	    				else
	    				{
	    					System.out.println("balance not available");
	    				}
	    				break;
	    			case 3:
	    				System.out.println("Enter amount to deposit");
	    				deposit=sc.nextInt();
	    				oldbalance=+deposit;
	    				balance=balance+deposit;
	    				System.out.println("available balance is"+balance);
	    				break;
	    			case 4:
	    				System.out.println("enter amount to transfer");
	    				int transfer=sc.nextInt();
	    				oldbalance=-transfer;
	    				balance=balance-transfer;
	    				System.out.println("available balance is"+balance);
	    				break;
	    			case 5:
	    				System.out.println("Thank you for using ATM");
	                    System.exit(0);
	    				break;
	    			default:
	    				System.out.println("invalid choice");
	    				
	    			}
	    		}
	    	}
	    }
	    
	 }

	

}
