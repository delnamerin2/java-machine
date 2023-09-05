package BankTransaction.bean;

import java.util.Random;

public  class Bank {
          private int accountNo;
          private String customerName;
          private String accountType;
          private double balance;
          private double minBalance;
          private long mobileNumber;
          private String emailId;
          private int atmPin;
         
       
          public int getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(int string) {
			//this.accountNo = string;
			Random random=new Random();
	         this.accountNo=1000000000+random.nextInt(900000000);
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public double getMinBalance() {
			return minBalance;
		}
		public void setMinBalance(double minBalance) {
			this.minBalance = minBalance;
		}
		public long getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(long mob) {
			this.mobileNumber = mob;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public int getAtmPin() {
			return atmPin;
		}
		public void setAtmPin(int atmPin) {
			//this.atmPin = atmPin;
			Random random=new Random();
	        this.accountNo=10000+random.nextInt(90000);
		}

		 public int accountNoGeneration() {
		       
			    Random random=new Random();
		        return this.accountNo=1000000000+random.nextInt(900000000);
		    }
		 public int atmPinGeneration() {
		        // Generate a 4-digit random ATM PIN
			 Random random=new Random();
		        return this.accountNo=10000+random.nextInt(90000);
		    }

		
		 
		@Override
		public String toString() {
			return "Bank [accountNo=" + accountNo + ", customerName=" + customerName + ", accountType=" + accountType
					+ ", balance=" + balance + ", minBalance=" + minBalance + ", mobileNumber=" + mobileNumber
					+ ", emailId=" + emailId + ", atmPin=" + atmPin + "]";
		}
		
		
}
