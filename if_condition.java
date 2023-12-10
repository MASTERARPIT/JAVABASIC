import java.util.Scanner;

public class if_condition {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age<18){
            System.out.println("minor");

        }
        else if(age==18){
            System.out.println("complete 18");
        }

        else{
            System.out.println("major");
        }

     
        
    }
    
}
