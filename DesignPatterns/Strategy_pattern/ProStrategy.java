package DesignPatterns.Strategy_pattern;

import java.util.Random;

public class ProStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0;
    private int currentHandValue = 0;
    private int[][] history = {
        {1, 1, 1},
        {1, 1, 1},
        {1, 1, 1}
    };

    public ProStrategy(int seed) {
        random = new Random(seed);
    }

    private int getSum(int hv) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[hv][i];
        }
        return sum;
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(prevHandValue));
        int handvalue = 0;
        if(bet < history[prevHandValue][0]) {
            handvalue = 0;
        }else if (bet < history[prevHandValue][0] + history[prevHandValue][1]) {
            handvalue = 1;
        }else {
            handvalue = 2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    @Override
    public void study(boolean win) {
        if(win) {
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
    
}
