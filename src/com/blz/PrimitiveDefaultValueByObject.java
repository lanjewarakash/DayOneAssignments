package com.blz;

public class PrimitiveDefaultValueByObject {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean b1;
    char c;

    public static void main(String[] args) {
        PrimitiveDefaultValueByObject obj = new PrimitiveDefaultValueByObject();
        System.out.println("The Default Of Byte Is :" +obj.b);
        System.out.println("The Default Of Short Is :" + obj.s);
        System.out.println("The Default Of Int Is :" + obj.i);
        System.out.println("The Default Of Long Is :" + obj.l);
        System.out.println("The Default Of Float Is :" + obj.f);
        System.out.println("The Default Of Double Is :" + obj.d);
        System.out.println("The Default Of Boolean Is :" +obj.b1);
        System.out.println("The Default Of Char Is :" + obj.c);
    }
}