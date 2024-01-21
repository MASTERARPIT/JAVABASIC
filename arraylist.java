import java.util.*;
import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(3));
        for(int i=0;i<n;i++){
            list.get(i);
        }
        System.out.println(list);
    }

    
}
