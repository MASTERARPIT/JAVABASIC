// public class Dictionary_maps_hacker {
    
// }
import java.io.*;
import java.util.*;

public class Dictionary_maps_hacker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        String s;
        // String find;
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            s = sc.next();
            a= sc.nextInt();
            
            map.put(s, a);
            
            
        }
        
        // int name = sc.nextInt();
        
        while(sc.hasNext()){
            
            String s_n = sc.next();
            
            if(map.containsKey(s_n)){
                System.out.println(s_n+"="+map.get(s_n));
            }
            else{
                System.out.println("Not found");
            }
        }
        
        
    }
}
