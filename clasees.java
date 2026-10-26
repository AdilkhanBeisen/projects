
import java.util.*;

public class clasees{
    static class BankAccount{
        private String owner;
        private double balance;
        private static long TotalAccount=0;

        public BankAccount(String name, double balance){
            this.owner=name;
            if(balance>0){
                this.balance=balance;
            }
            else{
            this.balance=0;
            }

            TotalAccount++;
        }

        public void deposit(double amount){
            if(amount>0){
                balance+=amount;
            }
        }

        public void withdraw(double amount){
            if(amount>0 && amount<=balance){
                balance-=amount;
            }
        }
        public double getBalance(){
            return balance;
        }

        public String getowner(){
            return owner;
        }
        public static long getTotalAccont(){
            return TotalAccount;
        }

    }
    static class SavingsAccount extends BankAccount {
        SavingsAccount(String owner, double balance){
            super(owner,balance);
        }
        public void AddInterest(){
            double b=getBalance()*0.05;
            deposit(b);
        }
    }
    static class CheckingAccount extends BankAccount{
        CheckingAccount(String owner,double balance){
            super(owner,balance);
            
        }
        @Override 
        public void withdraw(double amount){
            double b=getBalance();
            if(amount>=0 && b>=amount+100){
                double n=amount+100;
                super.withdraw(n);
            }
        }
    }



    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("Adilkhan", 10000);
        CheckingAccount c1 = new CheckingAccount("Aslan", 10000);
        s1.AddInterest();
        c1.withdraw(3000);
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(s1);
        accounts.add(c1);
        for(int i=0;i<accounts.size();i++){
            System.out.println(accounts.get(i).getowner());
            System.out.println(accounts.get(i).getBalance());
        }
        
    }
}