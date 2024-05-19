package blackjack.base;

import blackjack.game.Card;

import java.util.ArrayList;

public abstract class AbstractPlayer {

    protected ArrayList<Card> playerHand;
    protected int cardCount;

    /**
     * Adiciona uma carta do baralho para a mão
     * @param card carta comprada do baralho
     */
    public abstract void drawCard(Card card);
    /**
     * Adiciona uma lista de cartas 
     * @param card arraylist de cartas
     */
    public abstract void drawCards(ArrayList<Card> card);
    /**
     * exibe lista de cartas
     * se for o dealer não exibe a primeira carta até o fim da jogada do player
     * se for o player exibe normalmente
     * cartas devem ser exibidas em ordem (implementar Comparable em Carta e usar Collections.sort)
     */
    protected abstract void showHand();

}