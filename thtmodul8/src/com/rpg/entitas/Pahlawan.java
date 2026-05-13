package com.rpg.entitas;
public class Pahlawan extends Karakter {

    public Pahlawan(String nama, int hp, int baseDamage) {
        super(nama, hp, baseDamage);
    }

    @Override
    public int serang() {
        return baseDamage + 5;
    }

    // overloading
    public int serang(String namaSkill) {
        if (namaSkill != null) {
            return baseDamage + (baseDamage * 2);
        }
        return 0;
    }

    @Override
    public void bertahan(int damage) {
        isDefending = true;
        System.out.println(nama + " bersiap bertahan!");
    }

    @Override
    public void gunakanItem() {
        hp += 20;
        System.out.println(nama + " menggunakan potion (+20 HP)");
    }
}