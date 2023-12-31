import java.util.Scanner;

public class factorial{

    public static  int fact(int n){
        int fact = 1;
        while(n != 0){
            if(n==0){
                System.out.println(1);
            }
            else{
                fact = fact*n;
                n--;
                System.out.println(fact);  
            }
            
            
        }
        System.out.println(fact);
        return fact ;    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }
    
}
