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

        System.out.println("Please input the second people's information:");
        System.out.print("Player2's Name is:");
        name = scanner.nextLine();
        System.out.print("Player2's HP is:");
        hp = Integer.valueOf(scanner.nextLine());
        System.out.print("Player2's ATK is:");
        atk = Integer.valueOf(scanner.nextLine());
        System.out.print("Player2's DEF is:");
        def = Integer.valueOf(scanner.nextLine());
        System.out.print("Player2's DEX is:");
        dex = Integer.valueOf(scanner.nextLine());
        System.out.print("Player2's AGL is:");
        agl = Integer.valueOf(scanner.nextLine());

        Player player2 = new Player(name,hp,atk,def,dex,agl);

        int key = 1;
        int hit;
        while (player1.getHp() > 0 && player2.getHp() > 0){

            System.out.println("Player1's hp is " + player1.getHp() + " now");
            System.out.println("Player2's hp is " + player2.getHp() + " now");

            if (key == 1){
                System.out.println("Player1 begin attack Player2");
                hit = player1.attack(player2);
                System.out.println("Player1 hit Player2 by " + hit);
                player2.setHp(player2.getHp() - hit);
                System.out.println("");
            } else {
                System.out.println("Player2 begin attack Player1");
                hit = player2.attack(player1);
                System.out.println("Player2 hit Player1 by " + hit);
                player1.setHp(player1.getHp() - hit);
                System.out.println("");
            }
            key *= -1;
        }

        if (key == 1){
            System.out.println("Player2 win, Player2's hp is " + player2.getHp() + " now");
        } else {
            System.out.println("Player1 win, Player1's hp is " + player1.getHp() + " now");
        }
    }
}
