package BankTransaction.bean;

import java.util.Scanner;

public class cust extends Bank implements Customer{

	@Override
	public void depositMoney(Bank obj) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter deposit amount");
		double amount=sc.nextDouble();
		if(amount>50000)
		{
			System.out.println("enter pan card no:");
			String pan=sc.nextLine();
			}
		obj.setBalance(obj.getBalance()+amount);
		System.out.println("balance"+obj.getBalance());
		
	}

	@Override
	public void withdrawMoney(Bank obj) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter withdraw amonunt");
		double amount=sc.nextDouble();
		if(amount>obj.getBalance()) {
			System.out.println("Insufficient balance");
		}
		else {
			obj.setBalance(obj.getBalance()-amount);
		}
		// TODO Auto-generated method stub
		System.out.println("balance"+obj.getBalance());
	}

	@Override
	public void showBalance(Bank obj) {
		System.out.println(obj.getBalance());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferMoney(Bank obj) {
	     System.out.println("Enter account no to be transferred");
	     Scanner s=new Scanner(System.in);
	     String senderacc=s.nextLine();
	     //obj.setAccountNo(senderacc);
	     System.out.println("Enter account from which to be transferred");
	     String recacc=s.nextLine();
	     //obj.setAccountNo(recacc);
	     System.out.println("Enter  amount to be transferred");
	     Double Amount=s.nextDouble();
	     
	     
	     
	     
	     
		// TODO Auto-generated method stub
		
	}

	
	

}
