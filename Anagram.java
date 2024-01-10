import java.util.*;

public class Anagram {

    static boolean isAnagram(String s,String d){
        s=s.toLowerCase();
        d=d.toLowerCase();

        if(s.length()==d.length())
        {
        int[] a= new int[256];
        int[] b= new int[256];
        
        for (int i=0;i<s.length();i++){
            a[(int) s.charAt(i)] +=1;
            b[(int) d.charAt(i)] +=1;
        }
        for(int i=0;i<256;i++){
            if(a[i]!=b[i])
            return false;
        }
        return true;
    }
    else{
        return false;
    }
}


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.next();
        String b=sc.next();

        sc.close();

        boolean ret = isAnagram(a,b);

        if(ret==true){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
        
    }
    
}
