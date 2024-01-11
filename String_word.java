import java.util.*;

public class String_word {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n=0;
        // str.split(" ");
        String str2[]=str.trim().split("[^a-zA-Z]+");
        if(str==null || str.trim().equals("")){
            System.out.println("0");
        }else{
            System.out.println(str.trim().split("[^a-zA-Z]+").length);
        }

        for(String WORDS:str2){
            System.out.println(WORDS);
        }



    }
    
}
