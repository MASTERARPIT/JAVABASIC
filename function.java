import java.util.*;

public class function {

    public static void printhelloworld(){
        
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");

        return;

    }

    public static int calsum(int num1, int num2){  // parameters or formal parameters
        int sum = num1 + num2;
        
        return sum;

    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = calsum(a,b); // arguments or actual parameters
        System.out.println("sum is = "+sum);

    }
    
}
