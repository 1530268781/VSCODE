package DesignPatterns.Strategy_pattern;

public class Hand {
    public static final int HANDVALUE_GUU = 0; // 石头
    public static final int HANDVALUE_GHO = 1; // 剪刀
    public static final int HANDVALUE_PAA = 2; // 布
    public static final Hand[] hand = { // 猜拳中三种手势的实例
            new Hand(HANDVALUE_GUU), new Hand(HANDVALUE_GHO), new Hand(HANDVALUE_PAA) };
    private static final String[] name = { "石头", "剪刀", "布" };
    private int handvalue;

    private Hand(int handvalue) {
        this.handvalue = handvalue;
    }

    public static Hand getHand(int handvalue) { // 单例模式Singleton
        return hand[handvalue];
    }

    public boolean isStrongerThan(Hand h) { // 如果胜了h则返回true
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    private int fight(Hand h) {
        if (this == h) { // 同一个手势实例
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return name[handvalue];
    }
}
