package com.rpg.entitas;
public class Monster extends Karakter {

    public Monster(String nama, int hp, int baseDamage) {
        super(nama, hp, baseDamage);
    }

    @Override
    public int serang() {
        return baseDamage;
    }

    @Override
    public void bertahan(int damage) {
        hp += 5; // regenerasi
        System.out.println(nama + " sedikit regenerasi HP!");
    }

    @Override
    public void gunakanItem() {
        System.out.println(nama + " tidak punya item!");
    }
}