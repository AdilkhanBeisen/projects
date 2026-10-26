import java.util.*;

public class hh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer, String> account=new  HashMap<>();
        account.put(101,"Adilkhan");
        account.put(102,"Azamat");
        account.put(103,"Nurdaulet");
        System.out.print("Enter ccount ID:");
        int id=sc.nextInt();
        if(account.containsKey(id)){
            System.out.println(account.get(id));
        }
        else{
            System.out.println("Account not found");
        }
    }
}
