package com.company;

interface myinterface
{
    public void sound();
}
interface myinterface1
{
    public void sound1();
}
interface my extends myinterface,myinterface1
{
      public void wake();
}

abstract class One implements myinterface,my {

    One() {
        System.out.println("count");
    }

    public void sound() {
        System.out.println("running");
    }
    public void sound1() {
        System.out.println("running1");
    }


    public void wake() {
        System.out.println("running");
    }
}
class Face extends One
{
    public static void main(String[] args) {
        Face ob=new Face();
        ob.sound();
        ob.wake();
        ob.sound1();
    }
}

