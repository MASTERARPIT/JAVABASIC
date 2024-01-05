
    
import java.io.*;
import java.util.*;

public class String_palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s=s+str.charAt(i);
        }
        //System.out.println(s);
        if(str.equals(s)){
            System.out.println("Yes::it is palindrome");
        }
        else{
            System.out.println("No::it is not palindrome");
        }
    }
}
