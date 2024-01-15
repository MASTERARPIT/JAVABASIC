import java.util.*;

public class linear_search {
public static int linearSearch(int arr[],int tosearch){

    for(int i=0;i<arr.length;i++){
        if(arr[i]==tosearch){
            return i;
        }
        
    }
    return -1;
    
}

    public static void main(String[] args) {

        int i;
        Scanner sc= new Scanner(System.in);
        int arr_size=sc.nextInt();
        
        int arr[]=new int[arr_size];
        System.out.println("Enter the element in the array");
        for(i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        
        System.out.println("The element of an array are :");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println("");

        int tosearch=sc.nextInt();
        
        int index=linearSearch(arr,tosearch);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("the value is at index = "+index);
        }
    }
}
