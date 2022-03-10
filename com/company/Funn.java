package com.company;

public class Funn {
    public static void main(String[] args) {
        int r=funn(3,6);
        System.out.println(r);
    }

    public static int funn(int a,int b)
    {
        if(a>b+1)
            return 1;
        else
            return a+b+funn(a,b-3);
    }
}
