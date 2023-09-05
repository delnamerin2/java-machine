package BankTransaction.bean;

import java.util.Scanner;

public class admin  implements administrator{

	@Override
	public Bank addNewCustomer() {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		Bank obj=new Bank();
		obj.setAccountNo(obj.accountNoGeneration());
		System.out.println("Enter Customer Name");
		String name=sc.nextLine();
		try {
			
			if(name.length()>30) {
				throw new Exception("name must be within 30 characters");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		obj.setCustomerName(name);
		System.out.println("Enter Account type (savings or current)");
		obj.setAccountType(sc.nextLine());
		System.out.println("Enter balance");
		obj.setBalance(sc.nextDouble());
		System.out.println("Enter min balance");
		obj.setMinBalance(sc.nextDouble());
		System.out.println("Enter Mobile No");
		long Mob=sc.nextLong();
		String mob=Long.toString(Mob);
		try {
			if(mob.length()>10 || mob.length()<10) {
				throw new Exception("Invalid phone no");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		obj.setMobileNumber(Mob);
		System.out.println("Enter emailid");
		obj.setEmailId(sc.next());
		obj.setAccountNo(obj.atmPinGeneration());
		return obj;
		
		
		
		
		
		
	}

	@Override
	public void updateCustomerDetails(Bank obj) throws NumberFormatException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mobile No");
		String Mob=sc.nextLine();
		try {
			if(Mob.length()!=10) {
				throw new Exception("Invalid phone no");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		obj.setMobileNumber(Integer.parseInt(Mob));
		System.out.println("Enter emailid");
		obj.setEmailId(sc.nextLine());
	
		// TODO Auto-generated method stub
		System.out.println("customer details updated successfully");
	}

	
	
	
}