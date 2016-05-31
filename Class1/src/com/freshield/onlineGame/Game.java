package com.freshield.onlineGame;

/**
 * Created by FRESHIELD on 2016/5/31.
 */
public class Game {
    public void run() {
        Player player = new Player();
        player.setAtk(1);
        player.setHp(300);

        int damage = 100;

        player.setHp(player.getHp() - damage);
    }
}
