



//class and oops concepts

class pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing some_assignment");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}
public class class_oops {

    public static void main(String[] args) {
        pen pen1 = new pen();
        pen1.color="black";
        pen1.type="ball";

        pen1.write();
        pen1.printColor();


    }
    
}


