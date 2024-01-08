import java.util.*;

public class DecimaltoBinary {

    public static void dectobin(int n){

        int myNum=0;
        int pow =0;
        int binNo=0;

while (n > 0){
    int rem=n % 2  ;
    binNo = binNo + (rem*(int)Math.pow(10, pow));

    pow++;
    n=n/2;
}
System.out.println("binary form of "+myNum+" ="+binNo);

    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dectobin(n);

    }
}
