package com.github.Karmel5950.HeroFightDaBai.Creature;

public class 勇者 extends 生物{

    @Override
    public int get初始生命值() {
        return 100;
    }

    @Override
    public int get初始攻击力() {
        return 10;
    }

    @Override
    public int get初始防御力() {
        return 5;
    }

    @Override
    public int get生命值成长() {
        return 10;
    }

    @Override
    public int get攻击力成长() {
        return 2;
    }

    @Override
    public int get防御力成长() {
        return 1;
    }

    @Override
    public String get初始名字() {
        return "勇者";
    }
}
