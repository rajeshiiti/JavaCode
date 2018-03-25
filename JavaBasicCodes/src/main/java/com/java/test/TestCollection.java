package com.java.test;

import java.util.*;

public class TestCollection {

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
//        int a = inp.nextInt();
//        int b = inp.nextInt();
//        String c = inp.nextLine();
//        System.out.println(a+b+c);
        List<String> list = new ArrayList<String>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue.element());
        System.out.println(queue.poll());
        Vector<String> vector = new Vector<>();


    }
}
