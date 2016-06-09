package com.freshield.attack;

import java.util.Scanner;

/**
 * Created by FRESHIELD on 2016/6/8.
 */
public class Game {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the first people's information:");
        System.out.print("Player1's Name is:");
        String name = scanner.nextLine();
        System.out.print("Player1's HP is:");
        int hp = Integer.valueOf(scanner.nextLine());
        System.out.print("Player1's ATK is:");
        int atk = Integer.valueOf(scanner.nextLine());
        System.out.print("Player1's DEF is:");
        int def = Integer.valueOf(scanner.nextLine());
        System.out.print("Player1's DEX is:");
        int dex = Integer.valueOf(scanner.nextLine());
        System.out.print("Player1's AGL is:");
        int agl = Integer.valueOf(scanner.nextLine());

        Player player1 = new Player(name,hp,atk,def,dex,agl);

        System.out.println("Please input the Sniper's information:");
        System.out.print("Sniper's Name is:");
        name = scanner.nextLine();
        System.out.print("Sniper's HP is:");
        hp = Integer.valueOf(scanner.nextLine());
        System.out.print("Sniper's ATK is:");
        atk = Integer.valueOf(scanner.nextLine());
        System.out.print("Sniper's DEF is:");
        def = Integer.valueOf(scanner.nextLine());
        System.out.print("Sniper's DEX is:");
        dex = Integer.valueOf(scanner.nextLine());
        System.out.print("Sniper's AGL is:");
        agl = Integer.valueOf(scanner.nextLine());

        Sniper player2 = new Sniper(name,hp,atk,def,dex,agl);

        int key = 1;
        int hit;

        System.out.println("");
        while (player1.getHp() > 0 && player2.getHp() > 0){

            System.out.println("Player1's hp is " + player1.getHp() + " now");
            System.out.println("Sniper's hp is " + player2.getHp() + " now");

            if (key == 1){
                System.out.println("Player1 begin attack Sniper");
                hit = player1.attack(player2);
                System.out.println("Player1 hit Sniper by " + hit);
                player2.setHp(player2.getHp() - hit);
                System.out.println("");
            } else {
                System.out.println("Sniper begin attack Player1");
                hit = player2.attack(player1);
                System.out.println("Sniper hit Player1 by " + hit);
                player1.setHp(player1.getHp() - hit);
                System.out.println("");
            }
            key *= -1;
        }

        if (key == 1){
            System.out.println("Sniper win, Sniper's hp is " + player2.getHp() + " now");
        } else {
            System.out.println("Player1 win, Player1's hp is " + player1.getHp() + " now");
        }
    }
}
