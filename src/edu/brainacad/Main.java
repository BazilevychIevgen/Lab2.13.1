package edu.brainacad;

import java.util.SortedMap;

/**
 * Created by Admin on 13.03.2016.
 */
public class Main {
    public static void main(String[] args) {
      Integer x1=150;
        Integer x2=new Integer(150);
        Integer x3=Integer.valueOf(150);
        Integer  x4 = Integer.parseInt("150");




        System.out.println(x1==x2);
        System.out.println(x1.equals(x4));
        System.out.println(x3==x4);
        System.out.println(x2.equals(x4));
        System.out.println(x4==x1);




    }
}
