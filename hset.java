import java.util.*;

public class hset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<5;i++){
            int n=sc.nextInt();
            hs.add(n);
        }
        System.out.println("Unique students:"+hs.size());
        if(hs.contains(101)){
            System.out.println("Student 101 exists: yes");
        }
        else{
            System.out.println("Student 101 exists: no");
        }
    }
}
