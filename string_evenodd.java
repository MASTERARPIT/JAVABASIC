import java.util.Scanner;

public class string_evenodd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s;
        String s_even=""; // to store string even place value
        String s_odd="";
        for(int i=0;i<n;i++){
            s=sc.nextLine();

            for(int j=0 ;j<s.length();j++){
                if(j%2==0){
                    s_even=s_even+s.charAt(j);

                }else{
                    s_odd=s_odd+s.charAt(j);
                }
            }

            System.out.println(s_even+" "+s_odd);
        }
        


    }
}
