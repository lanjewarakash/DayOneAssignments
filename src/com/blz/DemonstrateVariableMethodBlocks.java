package com.blz;

public class DemonstrateVariableMethodBlocks {
    static int a = 10;
    static int b = 20;
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        add();
        multi();
    }
    public static void add(){
        int value = a + b;
        System.out.println(value);
    }
    public static void multi(){
        int value = a * b;
        System.out.println(value);
    }
    static{
        System.out.println("I'm A Static Block");
    }
    {
        System.out.println("I'm A initializer Block");
    }

}
