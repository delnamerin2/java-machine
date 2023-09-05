package BankTransaction.bean;

public interface Customer {
   public void depositMoney(Bank obj);
   public void withdrawMoney(Bank obj);
   public void showBalance(Bank obj);
   public void transferMoney(Bank obj);
}
