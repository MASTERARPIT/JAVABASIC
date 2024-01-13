import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        for(int i=0;i<n;i++){
            
            String s = sc.nextLine();
            String regex="^[A-Za-z][a-zA-Z0-9_]{7,29}";
        
        if(s.matches(regex)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
            
        }
        
    }
}