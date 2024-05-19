package blackjack.game;

import blackjack.base.AbstractCard;
import blackjack.utils.IO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Dealer extends Player {
    public Dealer() {
        playerHand = new ArrayList<Card>();
    }

    public Dealer(ArrayList<Card> cards) {
        playerHand = new ArrayList<Card>();

        drawCards(cards);
    }

    @Override
    protected void showHand() {
        IO.print("Mao do Dealer: ");

        Collections.sort(playerHand);

        for (int i = 1; i < playerHand.size(); i++) {
            AbstractCard carta = playerHand.get(i);

            carta.show();
        }
    }
}
