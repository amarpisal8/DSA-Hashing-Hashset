
import java.util.HashSet;
public class Hashing{
    public static void main(String[] args) {
       HashSet<Integer> set = new HashSet<>();
//Insertion
       set.add(1);
       set.add(2);
       set.add(3);
       set.add(4);
       set.add(5);
//Search/Contains
        if(set.contains(7)){
            System.out.println("Contain");
        }else{
            System.out.println("Not contain");
        }
//Remove or Delete
        set.remove(2);
        if(!set.contains(4)){
            System.out.println("Successfully Removed");
        }else{
            System.out.println("Sory!!! Element Cant Remove");
        }
       }
}