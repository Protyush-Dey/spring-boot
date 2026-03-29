package Cursor;

import java.util.*;

public class EnumerationDemo {
    public static void main() {
        Vector<Integer> vector = new Vector<>();
        vector.add(14);
        vector.add(24);
        vector.add(34);
        vector.add(44);
        vector.add(54);
        Enumeration env = vector.elements();
        while(env.hasMoreElements()){
            Integer data = (Integer) env.nextElement();
            System.out.println(data);
        }
    }





}
