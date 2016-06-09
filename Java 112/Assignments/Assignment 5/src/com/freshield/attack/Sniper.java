package com.freshield.attack;

/**
 * Created by FRESHIELD on 2016/6/9.
 */
public class Sniper extends Player {

    private double oskRate = 0.2;

    public Sniper(String name, int hp, int atk, int def, int dex, int agl) {
        super(name, hp, atk, def, dex, agl);
    }

    @Override
    public int attack(Player target) {

        double oskResult = Math.random();

        if (oskResult < oskRate) {
            System.out.println("OSK!!!");
            return target.getHp();
        } else {
            return super.attack(target);
        }

    }
}
