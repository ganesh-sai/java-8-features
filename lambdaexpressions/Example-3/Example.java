// Iterating over collections using foreach loop
import java.util.*;

public class Example {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("Rick");
        list.add("Negan");
        list.add("Daryl");

        list.forEach(
            (names)-> System.out.println(names)
        );
    }
}
