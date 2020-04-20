package com.idea.java;


import java.util.ArrayList;
import java.util.Arrays;

public class halloworld {
    public static final int a=1;
    public static final String b="222ad";

    public static void main(String[] args) {
        //模板2 sout
        System.out.println("输出语句,sout=system.out.println");
        //变形 soutp(p参数)   soutm(class.方法)  soutv(value.变量值) xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Templatestest.main");
        int num = 10;
        int num2 = num + 10;
        int num3 = num2 * num;
        System.out.println("num3= " + num3);
        String[] arr = new String[]{"a", "b", "c", "d", "e"};
        //foti
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + i);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);

        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {
            System.out.println(list);
        }
        //顺序list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //逆序list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

    }

    public static void method() {
        System.out.println("Templatestest.method");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        //ifn
        if (list == null) {
            
        }
        //inn
        if (list != null) {

        }
        //prsf

    }
}
