package com.rpg.arena;
public abstract class Karakter implements AksiBertarung {
    protected String nama;
    protected int hp;
    protected int baseDamage;
    protected boolean isDefending;

    public Karakter(String nama, int hp, int baseDamage) {
        this.nama = nama;
        this.hp = hp;
        this.baseDamage = baseDamage;
        this.isDefending = false;
    }

    // Getter & Setter
    public String getNama() { return nama; }
    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = hp; }

    // default method
    public void terimaDamage(int damage) {
        if (isDefending) {
            damage /= 2;
            isDefending = false;
        }
        hp -= damage;
        if (hp < 0) hp = 0;
    }
}