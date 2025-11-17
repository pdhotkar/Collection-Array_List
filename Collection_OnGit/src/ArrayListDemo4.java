
//Design the generic array list for String type only

import java.util.ArrayList;
public class ArrayListDemo4 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Pooja");
        al.add("Shiv");
        al.add("Guru");

        for (String str : al) {
            System.out.println(" " + str);
        }
    }
}

