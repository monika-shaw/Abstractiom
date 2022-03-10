package com.company;


abstract class Bike
{
    Bike()
    {
        System.out.println("bike is running");
    }

    abstract public void vehicle();
    public  void transport()
    {
        System.out.println("method");
    }
}
 abstract class New extends Bike {

   public void show()
   {
       System.out.println("Monika");
   }
}

class Animals extends New
{
    public void vehicle()
    {
        System.out.println("implemented");
    }
    public static void main(String[] args) {

        Animals ob=new Animals();
        ob.show();
        ob.transport();
        ob.vehicle();
    }
}
