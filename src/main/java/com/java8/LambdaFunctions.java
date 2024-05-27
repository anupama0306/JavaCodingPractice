package com.java8;

public class LambdaFunctions {

    public static void main(String[] args){
        useLambda((x,y) -> {System.out.println("Work done"+x+y);});
    }

    public static void useLambda(Workable w){
        w.work(3,5);
    }
}
