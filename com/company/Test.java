package com.company;

abstract class Animal {
    public abstract void sound();

}

 class Dog {


    public void sound()
    {
        System.out.println("dog barking");
    }
}
class Cat extends Dog{


    public void sound()
    {

        System.out.println("cat");
    }
}
public class Test extends Dog{
    public static void main(String[] args) {
       Cat obj=new Cat();
       obj.sound();

    }
}






