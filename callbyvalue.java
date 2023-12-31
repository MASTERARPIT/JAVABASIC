import java.util.*;


public class callbyvalue {

    public static int multiply(int a, int b){

        int product = a*b;
        System.out.println("Result = "+product);
        return product;

    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        int product = multiply(x,y);

    }
    
}
