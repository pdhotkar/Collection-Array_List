
// Create array list with generic (Integer) type only and iterating
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.*;

public class ArrayListDemo
{
    public static void main(String[] args) {
        ArrayList<Integer> al= new ArrayList<Integer>();
        al.add(10);
        al.add(40);
        al.add(30);
        al.add(50);
        al.add(70);

        System.out.println("ArrayList"+ al);

        for(int i:al)
        {
            System.out.println("" + i);
        }
    }
}
