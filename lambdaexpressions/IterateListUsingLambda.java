import java.util.ArrayList;
import java.util.List;

public class IterateListUsingLambda {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Ajay");
		names.add("Ben");
		names.add("Cathy");
		names.add("Dinesh");
        names.add("Tom");
        
        names.forEach(name->System.out.println(name));
    }
}