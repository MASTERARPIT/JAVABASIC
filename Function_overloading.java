public class Function_overloading {

    public static int sum(int a,int b){ //functin overloading using parameters
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static float sum(float a,float b){ //function overloading using different datatypes
        return a+b;
    }
    public static void main(String[] args){

        System.out.println(sum(3,5));
        System.out.println(sum(3,5,8));
        System.out.println(sum(3.2f,4.8f));

    }
}
