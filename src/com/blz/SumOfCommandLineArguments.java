package com.blz;

public class SumOfCommandLineArguments {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); //first argument
        int y = Integer.parseInt(args[1]); //second argument
        int sum = x + y;
            System.out.println("The sum of x and y is: " +sum);
    }
}