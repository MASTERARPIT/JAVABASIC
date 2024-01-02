import java.util.Scanner;

public class binomial_coefficient {


    public static int fact(int n){
        int fact =1;
        while(n!=0){
            if(n==0){
                System.out.println(1);;

            }
            else{
                fact=fact*n;
                n--;
            }
            
        }
        // System.out.println(fact);
    
        return fact;

    }
     public static int coff(int n,int r){
        Scanner sc = new Scanner(System.in);
        
        int n_fact=fact(n);
        int r_fact=fact(r);
        int nmrfact=fact(n-r);
        int coff=n_fact/(r_fact * nmrfact);
        return coff;

     }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        
        coff(n,r);
        System.out.println(coff(n, r));
        


    }
    
}
