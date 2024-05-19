package blackjack.game;

import blackjack.base.AbstractDeck;
import blackjack.types.SuitType;

import java.util.ArrayList;
import java.util.Collections;

public class Deck extends AbstractDeck {
    public Deck() {
        suits = new SuitType[]{SuitType.OURO, SuitType.ESPADA, SuitType.COPAS, SuitType.PAUS};
        values = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        cards = new ArrayList<Card>();
    }

    @Override
    public void generateDeck() {
        cards.clear();

        for (int i = 0; i < suits.length; i++) {
            SuitType suit = suits[i];

            for (int j = 0; j < values.length; j++) {
                String valor = values[j];

                Card card = new Card(suit, valor);

                cards.add(card);
            }
        }
    }

    @Override
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    @Override
    public Card deal() {
        if (cards.isEmpty()) return null;

        return cards.removeFirst();
    }

    @Override
    public ArrayList<Card> dealCards() {
        if (cards.isEmpty()) return null;

        ArrayList<Card> cards = new ArrayList<>();
        cards.add(deal());
        cards.add(deal());

        return cards;
    }

    @Override
    protected void showDeck() {
        for (Card card : cards) {
            card.show();
        }
    }

    @Override
    protected void checkAndRefillDeck() {
        if (!cards.isEmpty()) return;

        generateDeck();
        shuffleDeck();
    }

    public void clear() {
        cards.clear();
    }
}
