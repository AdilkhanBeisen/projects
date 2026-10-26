
import java.util.*;
import java.io.*;

public class PaymentSys{
    static interface Payment{
        void pay(double amount);
    }
    static class CardPayment implements  Payment{
        @Override 
        public void pay(double amount){
            if(amount>0){
                System.out.println("Paid by card:"+ amount);
            }
            else{
                System.out.println("Invalid amount");
            }
        }
    }
    static class CashPayment implements  Payment{
        @Override 
        public void pay(double amount){
            if(amount>0){
                System.out.println("Paid by cash:"+ amount);
            }
            else{
                System.out.println("Invalid amount");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Сколбко денег хотите оплатить?");
        double n=sc.nextDouble();
        System.out.print("Card(1) or cash(2)?");
        int b=sc.nextInt();
        if(b==1){
            Payment p1=new CardPayment();
            p1.pay(n);
        }
        else{
            Payment p2=new CashPayment();
            p2.pay(n);
        }

    }
}
