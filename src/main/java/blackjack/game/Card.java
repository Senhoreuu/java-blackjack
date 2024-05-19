package blackjack.game;

import blackjack.base.AbstractCard;
import blackjack.types.SuitType;
import blackjack.utils.IO;

import java.util.ArrayList;
import java.util.Arrays;

public class Card extends AbstractCard implements Comparable<Card> {
    public Card(SuitType suit, String value) {
        this.suit = suit;
        this.value = value;

        this.score = this.getCardScore(value);
    }

    public Card(SuitType suit, String value, int score) {
        this.suit = suit;
        this.value = value;
        this.score = score;
    }

    public int getCardScore(String value) {
        if (value.equals("A")) {
            return 1;
        }

        ArrayList<String> figures = new ArrayList<>(Arrays.asList("J", "Q", "K"));

        if (figures.contains(value)) {
            return 10;
        }

        return Integer.parseInt(value);
    }

    @Override
    public SuitType getSuit() {
        return suit;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void show() {
        IO.print(value + " de " + suit);
    }

    @Override
    public int compareTo(Card target) {
        String valueOrder = "A2345678910JQK";

        int cardValue = valueOrder.indexOf(this.value);
        int targetValue = valueOrder.indexOf(target.getValue());

        if (cardValue != targetValue) {
            return cardValue - targetValue;
        }

        String suitOrder = "OUROESPADACOPASPAUS";
        return suitOrder.indexOf(this.suit.ordinal()) - suitOrder.indexOf(target.getSuit().ordinal());
    }
}
