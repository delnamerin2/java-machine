package BankTransaction.app;

import java.util.ArrayList;
import java.util.Scanner;

import BankTransaction.bean.Bank;
import BankTransaction.bean.admin;
import BankTransaction.bean.cust;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<Bank> bk=new ArrayList<>();
		int choice=0;
		int ch = 0;
		int i=0,j=0,k=0;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Bank");
		System.out.println("1.ADMINISTRATOR 2.CUSTOMER 3.EXIT");
		choice=sc.nextInt();
    
		if(choice==1) {
			System.out.println("WELCOME ADMINISTRATOR");
			System.out.println("select 1.ADD NEW CUSTOMER 2.UPDATE CUSOMER 3.DELETE CUSTOMER 4.DISPLAY ALL CUSTOMERS 5.DISPLAY CUSTOMERS");
		   
		   admin d=new admin();
		    ch=sc.nextInt();
		   switch(ch) {
		   case 1:
			   bk.add(d.addNewCustomer());
			   break;
		   case 2:
			   System.out.println("enter account no to update");
			   Scanner acc=new Scanner(System.in);
			   int accountno=acc.nextInt();
			   for(Bank b:bk) {
				   if(accountno==b.getAccountNo()) {
					   i=1;
					   d.updateCustomerDetails(b);
				   }
				   if(i==0) {
					   System.out.println("invalid account no");
				   }
			   }
			   break;
		   case 3:
			   System.out.println("delete an account");
			   int accnum=s.nextInt();
			   for(Bank b:bk) {
				   if(accnum==b.getAccountNo()) {
					   j=1;
					   bk.remove(b);
					   System.out.println("account deleted successfully");
				   }
				   if(j==0) {
					   System.out.println("enter invalid phonenumber");
				   }
			   }
			   break;
		   case 4:
			   System.out.println("display all customers");
			   for(Bank b:bk) {
				   k=1;
			     System.out.print(b.toString());
			   }
		          break;
		   
		   case 5:
			   System.out.println("enter account to display");
			   Scanner cc=new Scanner(System.in);
			   int accountn=cc.nextInt();
			   for(Bank b:bk) {
				   
				   if(accountn==b.getAccountNo()) {
					   System.out.println(b.toString());
					   
				   }
				   else
				   {
					   System.out.println("invalid account no");  
				   }
			   
		   }
		}
		System.out.println("do u want to continue(1.yes 2.no)");
		ch=s.nextInt();
		}
		
		if(choice==2) {
			System.out.println("WELCOME cUSTOMER");
			System.out.println("1.Deposit 2.Withdraw 3.ShowBalance 4.Transfer money");
			int custchoice=s.nextInt();
			cust c=new cust();
			switch(custchoice) {
			case 1:
				for(Bank b:bk)
				{
				c.depositMoney(b);
				}
			
			case 2:
				for(Bank b:bk) {
					c.withdrawMoney(b);
					
				}
				break;
			case 3:
				for(Bank b:bk) {
					c.showBalance(b);
					
				}
				break;
			case 4:
				for(Bank b:bk) {
					c.transferMoney(b);
					
				}
				break;
				
		}
		
		}
		
		

	}while(ch!=3);
	}

}
