package com.freshield.attack;

/**
 * Created by FRESHIELD on 2016/6/8.
 */
public class Player {
    private String name;
    private int hp;
    private int atk;
    private int def;
    private int dex;
    private int agl;

    //constructor
    public Player(String name, int hp, int atk, int def, int dex, int agl) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.dex = dex;
        this.agl = agl;
    }

    //getter and setter

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getDex() {
        return dex;
    }

    public int getAgl() {
        return agl;
    }

    public String getName() {
        return name;
    }

    //attack function
    public int attack(Player target){
        int ATK1 = this.getAtk();
        int DEF1 = this.getDef();
        int DEX1 = this.getDex();
        int AGL1 = this.getAgl();
        int ATK2 = target.getAtk();
        int DEF2 = target.getDef();
        int DEX2 = target.getDex();
        int AGL2 = target.getAgl();

        double hit;

        double trueDEX1 = (double)DEX1 * (1+((Math.random()*40 - 20)/100));
        double trueAGL2 = (double)AGL2 * (1+((Math.random()*40 - 20)/100));

        //precalculate
        if (ATK1 > DEF2) {
            hit = (double)(ATK1 - DEF2);
        } else {
            hit = 1;
        }
        //figure crit or miss
        double element;
        if (trueDEX1 > (trueAGL2 * 2)) {
            element = 2;
        } else if (trueDEX1 < (trueAGL2 * 0.5)) {
            element = 0;
        } else {
            element = 1+((Math.random()*20 - 10)/100);
        }
        //final calculate
        int result = (int)(hit * element);

        return  result;
    }
}
