package com.java8;

import java.util.function.ToIntBiFunction;

public class LambdaFunctions {

    public static void main(String[] args){
        //use of lambda functions
        useLambda((x,y) -> {System.out.println("Work done"+x+y);});
        //we are avoiding implementing with anonymous class by making use of lambda functions
        useLambda(new Workable(){
            @Override
            public void work(int a, int b) {
                System.out.println("Work done but  by anonymous class"+a+b);
            }
        });
        Workable ow = new OneMoreWork();
        useLambda(ow);

        useToIntBiFunction((Integer x,Integer y)->x+y);

    }

    public static void useLambda(Workable w){
        w.work(3,5);
    }

    public static void useToIntBiFunction(ToIntBiFunction <Integer, Integer> b){
        System.out.println(b.applyAsInt(4,6));
    }
}

//we are avoiding creating this class by making use of lambda functions
class OneMoreWork implements Workable{

    @Override
    public void work(int a, int b) {
        System.out.println("Work done but not by lambda"+a+b);
    }
}
