import java.util.*;

public class swap {
    public static void main(String arg[]){

        System.out.println("enter the values");
        Scanner sc = new Scanner(System.in);
        System.out.print("a:");
        int a = sc.nextInt();
        System.out.print("b:");
        int b= sc.nextInt();
        int temp;

        System.out.println("value before swap:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);

        temp=a;
        a=b;
        b=temp;

        System.out.println("value After swap:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);


    }
    
}
