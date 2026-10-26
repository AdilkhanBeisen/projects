
import java.util.*;

public class Syste{
    static class Employee{
        private String name;
        private double salary;

        public Employee(String nam,double sala){
            this.name=nam;
            if(sala>0){
                this.salary=sala;
            }
            else{
                this.salary=0;
            }
        }
        public String getName(){
            return name;
        }

        public  double getSalary(){
            return salary;
        }

        public void increaseSalary(double amount){
            if(amount>0){
                salary+=amount;
            }
        }
        public void work() {
        System.out.println("Employee is working");
        }
    }
    static class Manager extends Employee{
            private double bonus;
            Manager(String name, double salary, double bonus){
                super(name, salary);
                if(bonus>0){
                    this.bonus=bonus;
                }
                
            }
            @Override 
            public void work(){
                System.out.println("Manager is working");
            }
            public void Bonus(){
                System.out.println(bonus);
            }
            public double getTotalPay(){
                double sal=getSalary();
                return sal+bonus;
            }
        }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nam=sc.nextLine();
        double salar=sc.nextDouble();
        double bon=sc.nextDouble();
        Employee emp=new Employee(nam, salar);
        emp.work();
        Manager m=new Manager(nam, salar, bon);
        m.work();
        Employee emp2=new Manager(nam, salar, bon);
        System.out.println(m.getTotalPay());
        
    }
}