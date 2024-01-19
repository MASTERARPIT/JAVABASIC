import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Arr_size=sc.nextInt();
        int i,j;
        int arr[]=new int[Arr_size];

        for(i=0;i<Arr_size;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<Arr_size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        for(i=0;i<Arr_size;i++){
            for (j=i;j<Arr_size;j++){

                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            
        }

    }
    
}
