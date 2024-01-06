import java.util.*;
import java.io.*;

public class maps_userinput {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s;
        int a;
        int n= sc.nextInt();
        
        HashMap<String,Integer> map = new HashMap<>();

        

        for (int i = 0 ; i<n ; i++){
            s = sc.next();
            a = sc.nextInt();
            map.put(s, a);
            
        }
        
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+"="+e.getValue());
        }


        while(sc.hasNext()){
            String s_n =sc.next();

            if(map.containsKey(s_n)){
                System.out.println(s_n+"="+map.get(s_n));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
    
}





