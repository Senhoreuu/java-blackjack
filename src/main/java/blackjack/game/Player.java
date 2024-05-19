package blackjack.game;

import blackjack.base.AbstractPlayer;
import blackjack.utils.IO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Player extends AbstractPlayer {
    public Player() {
        playerHand = new ArrayList<Card>();
    }

    public Player(ArrayList<Card> cards) {
        playerHand = new ArrayList<Card>();

        drawCards(cards);
    }

    @Override
    public void drawCard(Card card) {
        if (card == null) return;

        playerHand.add(card);
        cardCount = playerHand.size();
    }

    @Override
    public void drawCards(ArrayList<Card> cards) {
        if (cards == null) return;

        playerHand.addAll(cards);
        cardCount = playerHand.size();
    }

    @Override
    protected void showHand() {
        IO.print("Sua mao:");

        Collections.sort(playerHand);

        for (int i = 0; i < playerHand.size(); i++) {
            Card card = playerHand.get(i);

            card.show();
        }
    }

    public int calculateScore() {
        if (cardCount == 2 && hasAce() && hasFigure()) {
            return 21;
        }

        int count = 0;

        for (Card card : playerHand) {
            count += card.getScore();
        }

        return count;
    }

    public boolean checkIfBusted() {
        if (cardCount == 2) {
            return !(hasAce() && hasFigure());
        }

        int count = calculateScore();

        return count > 21;
    }

    public boolean hasFigure() {
        return !getCardFigures().isEmpty();
    }

    public ArrayList<Card> getCardFigures() {
        ArrayList<String> figures = new ArrayList<>(Arrays.asList("J", "Q", "K"));

        ArrayList<Card> figureCards = new ArrayList<>();

        for (Card card : playerHand) {
            String value = card.getValue();

            if (figures.contains(value)) {
                figureCards.add(card);
            }
        }

        return figureCards;
    }

    public boolean hasAce() {
        for (Card card : playerHand) {
            String value = card.getValue();

            if (value.equals("A")) {
                return true;
            }
        }

        return false;
    }

    public void clearHand() {
        playerHand.clear();
    }
}
