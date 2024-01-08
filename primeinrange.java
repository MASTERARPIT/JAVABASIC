import java.util.*;
import java.math.*;  




public class primeinrange {
    // public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             isPrime = false;
    //             break;
    //         }
    //         // else{
    //         //     isPrime = true;
    //         // }
    //     }
    //     return isPrime;
    // }

    


    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void inrange(int n){

        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.print("Aab thoda thoda function smaj a raha");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        // isPrime(n);
        inrange(n);

        // System.out.println("prime number::"+isPrime(n));
    }
}
