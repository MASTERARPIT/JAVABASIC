import java.util.Scanner;

public class pattern {

    public static void main(String arg[]){

        // int i,n,j;

        // for(i=0;i<5;i++){
        //     for(j=0;j<5;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int i,j;

        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){

                if (i==1 || j==1 || i==n || j==m){
                    System.out.print("* ");

                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }

    }
    
}
