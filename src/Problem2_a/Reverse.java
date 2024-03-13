package Problem2_a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("Apple");
        li.add("Banana");
        li.add("Cherry");
        li.add("date");

        System.out.println("Original Arraylist:"+li);

        Collections.reverse(li);
        System.out.println("Reversed ArrayList: "+li);
    }
}
