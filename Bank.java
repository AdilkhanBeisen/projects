
import java.util.*;

public class Bank{
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
                if(amount<=0){
                    throw new IllegalArgumentException("Invalid deposit amount");
                }
                balance+=amount;
        }

        public void withdraw(double amount){
            if(amount<=0){
                throw new IllegalArgumentException("Invalid withdrawal amount");
            }
            if(amount>balance){
                throw new InsufficientFundsException("Insufficient funds");
            }
            balance-=amount;
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
            if(amount<=0){
                throw new IllegalArgumentException(("Invalid withdrawal amount"));
            }
            if(amount+100>getBalance()){
                throw new InsufficientFundsException("Insufficient funds");
            }
            super.withdraw(amount+100);
        }
    }

    static class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
    }

    public static void main(String[] args) {
        BankAccount b1=new BankAccount("Adil", 0);
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
        

        HashMap<Integer, BankAccount> accountMap = new HashMap<>();
        accountMap.put(101,s1);
        accountMap.put(102,c1);
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите ID:");
        int n=sc.nextInt();
        if(accountMap.containsKey(n)){
            System.out.println(accountMap.get(n).getowner());
            System.out.println(accountMap.get(n).getBalance());
        }
        else{
            System.out.println("Account not found");
        }

        HashSet<Integer> accountIds = new HashSet<>();

        accountIds.add(101);
        accountIds.add(102);
        accountIds.add(101);
        accountIds.add(103);
        accountIds.add(102);

        System.out.println(accountIds.size());
        System.out.println(accountIds.contains(101));
        System.out.println(accountIds.contains(999));
        
        try{
            b1.deposit(1000);
        }
        catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }

        try {
            b1.withdraw(20000);
        }   catch (InsufficientFundsException e) 
        {
             System.out.println(e.getMessage());
        }

    }
}