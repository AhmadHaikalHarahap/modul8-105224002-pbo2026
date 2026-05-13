package com.rpg.main;

import java.util.Scanner;
import com.rpg.entitas.*;
import com.rpg.arena.*;
public class GameEngine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Pahlawan: ");
        String nama = input.nextLine();

        Pahlawan hero = new Pahlawan(nama, 100, 10);

        Monster[] monsters = {
            new Monster("Goblin", 30, 5),
            new Monster("Orc", 40, 7),
            new Monster("Dragon", 50, 10)
        };

        for (Monster m : monsters) {
            System.out.println("\nMusuh muncul: " + m.getNama());

            while (hero.getHp() > 0 && m.getHp() > 0) {
                System.out.println("\nHP Hero: " + hero.getHp() + 
                                   " | HP Monster: " + m.getHp());
                System.out.println("1. Serang\n2. Skill\n3. Bertahan");
                System.out.print("Pilih aksi: ");
                int pilihan = input.nextInt();

                int damageHero = 0;

                switch (pilihan) {
                    case 1:
                        damageHero = hero.serang();
                        break;
                    case 2:
                        damageHero = hero.serang("skill");
                        break;
                    case 3:
                        hero.bertahan(0);
                        break;
                }

                if (pilihan != 3) {
                    m.terimaDamage(damageHero);
                    System.out.println("Hero menyerang: " + damageHero);
                }

                if (m.getHp() > 0) {
                    int damageMonster = m.serang();
                    hero.terimaDamage(damageMonster);
                    System.out.println("Monster menyerang: " + damageMonster);
                }
            }

            if (hero.getHp() <= 0) {
                System.out.println("\nGame Over!");
                return;
            }
        }

        System.out.println("\nSelamat! Semua monster dikalahkan!");
    }
}