package DesignPatterns.Strategy_pattern;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        //下一个手势：输了则随机；赢了仍然用上一手势
        if(!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;    
    }

    @Override
    public void study(boolean win) {  
        //根据当前的输赢，调整下一个手势的策略  
        won = win;
    }

}
