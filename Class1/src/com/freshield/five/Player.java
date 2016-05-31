package com.freshield.five;

/**
 * Created by FRESHIELD on 2016/5/31.
 */
public class Player {

    public Player() {
        name = "buzhidao";
    }

    public Player(String name) {
        this.name = name;
    }


    public String name;
    public char token;
    public int score;

    public void sayHello() {
        System.out.println("Hello, "+name);
    }
}
