package blackjack.base;

import blackjack.types.SuitType;
import blackjack.game.Card;

import java.util.ArrayList;

public abstract class AbstractDeck {

    protected SuitType[] suits;
    protected String[] values;
    protected ArrayList<Card> cards;

    /**
     * Gerar lista de cartas
     */
    public abstract void generateDeck();
    /**
     * usar método shuffle da classe Colections 
     */
    public abstract void shuffleDeck();
    /**
     * entrega uma carta do baralho para a mão do jogador
     * @return um objeto do type carta
     */
    public abstract Card deal();
    /**
     * entrega uma lista de cartas para a mão do jogador
     * @return ArrayList de cartas
     */
    public abstract ArrayList<Card> dealCards();
    /**
     * exibir baralho. para controle interno ( testes)
     */
    protected abstract void showDeck();
    /**
     * método interno. verifica se baralho está vazio e gera novo
     */
    protected abstract void checkAndRefillDeck();
}