package com.freshield.onlineGame;

/**
 * Created by FRESHIELD on 2016/5/31.
 */
public class Player {
    private int atk;
    private int hp;
    private int def;

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setHp(int hp) {

        if (hp < 0) {
            hp = 0;
        }

        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getHp() {
        return hp;
    }
}
