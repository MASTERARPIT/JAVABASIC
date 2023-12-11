import java.util.Scanner;

public class sum_natural_number {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int sum=0,i,n;
        System.out.print("enter the number=");
        n = sc.nextInt();
        
        for(i=0;i<n+1;i++){
            sum=sum+i;

        }
        System.out.println(sum);


        


    }
}
