// Method reference to an instance method of an arbitary object of a particular type

import java.util.Arrays;

public class Example{
    public static void main(String[] args) {
        String[] stringArray = {"Steve","Rick","Adi"};
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for (String str: stringArray) {
            System.out.println(str);
        }
    }
}