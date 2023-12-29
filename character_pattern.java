public class character_pattern {

    public static void main(String[] args) {

        char ch ='A';
        int i,j,n=6;

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
            
        }
        
    }
    
    
}
