package com.company;

public class Pseudo {
    public static void main(String[] args) {

        System.out.println(funn(3,7));
    }

    public static int funn(int a,int b)
    {
        if((b&1)<a) {
            return funn(a - 1, b - 1);
        }
        return a;



    }
}
