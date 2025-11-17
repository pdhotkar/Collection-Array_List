//Sorting Array in alphabetical order

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo5
{
    public static void main(String[] args) {
        ArrayList<String>al=new ArrayList<String>();
        al.add("Shiv");
        al.add("Rahul");
        al.add("Pooja");
        al.add("Snehal");
        al.add("kshitija");
        al.add("Yogesh");
        al.add("Piyush");
        al.add("Pushkar");
        al.add("Ajay");

        Collections.sort(al);
        System.out.println(al);
    }
}
