import java.util.*;

public class hasing {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        // country(key) , population(value)

        map.put("india",120);
        map.put("us",30);
        map.put("china",129);

        System.out.println(map);
        // unordered hote hai


        // search or to look up

        if(map.containsKey("china")){
            System.out.println("is present");
        }
        else{
            System.out.println("not present");
        }

// iterator in hashmap

// int arr[]= {12,15,18};

// for(int val:arr){
//     System.out.print(val+" ");
// }
// System.out.println(" ");
        


// to triverse
for(Map.Entry<String, Integer> e : map.entrySet()){
 
    System.out.println(e.getKey()+" = "+ e.getValue());
    //System.out.println(e.getValue());
}
        



    }
}
