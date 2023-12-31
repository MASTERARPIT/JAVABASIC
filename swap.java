import java.util.*;

public class swap {

    public static void swap(int x,int y){

        int temp=x;
        x=y;
        y=temp;
        System.out.println("value after swap");
        System.out.println("a="+x);
        System.out.println("b="+y);

    }


    public static void main(String arg[]){

        System.out.println("enter the values");
        Scanner sc = new Scanner(System.in);
        System.out.print("a:");
        int a = sc.nextInt();
        System.out.print("b:");
        int b= sc.nextInt();
        int temp;

        System.out.println("value before swap");
        System.out.println("a:"+a);
        System.out.println("b:"+b);

        swap(a,b);


    }
    
}
