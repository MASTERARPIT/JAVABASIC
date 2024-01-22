import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class arraylist{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int q= sc.nextInt();
        for(int i=0;i<q;i++){
            String s=sc.next();
            if(s.equals("Insert")){
                int a=sc.nextInt();
                int v=sc.nextInt();
                list.add(a,v);
            }else if(s.equals("Delete")){
                int a=sc.nextInt();
                list.remove(a);
            }
        }
        for(int item:list){
        System.out.print(item+" ");
            
        }
    }
}
