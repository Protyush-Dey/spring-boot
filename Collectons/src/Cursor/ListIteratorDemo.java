package Cursor;

import java.util.*;

public class ListIteratorDemo
{
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(14);
        arr.add(24);
        arr.add(34);
        arr.add(44);
        arr.add(54);
        ListIterator<Integer> env = arr.listIterator();
        while(env.hasNext()){
            Integer data = (Integer) env.next();
            System.out.println(data);
            if(data == 24) env.remove();
            if(data == 44) env.set(42);
        }
    }
}
