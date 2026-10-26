import java.util.*;
public class  Practice {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);
        System.out.println(a.get(2));
        a.remove(Integer.valueOf(20));
        System.out.println(a.size());
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
    
}
