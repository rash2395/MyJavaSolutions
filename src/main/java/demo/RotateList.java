package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<10 ; i++) {
            list.add(i);
        }
        System.out.println("Old list = " +list);
        Collections.rotate(list, 4);
        System.out.println("Rotated List = " + list);
    }

}
