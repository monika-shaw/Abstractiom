package com.company;

interface Playable // package music
{
    void play();
}

class Veena implements Playable  // music.string
{
    @Override
    public void play() {
        System.out.println("Playing");
    }
}

class guitar implements Playable    //muisc.wind
{
    public void play() {
    System.out.println("guitar");
}
}

public class Tests {
    public static void main(String[] args) {
        Veena obj=new Veena();
        obj.play();
        guitar obj1=new guitar();
        obj1.play();
    }
}
