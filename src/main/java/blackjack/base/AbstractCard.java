package blackjack.base;

import blackjack.types.SuitType;

public abstract class AbstractCard {

    protected SuitType suit;
    protected String value;
    protected int score;

    /**
     * Retorna o naipe da carta
     * @return SuitType
     */
    public abstract SuitType getSuit();

    /**
     * Retorna o valor da carta
     * @return String
     */
    public abstract String getValue();

    /**
     * Retorna quanto vale a carta
     * @return int
     */
    public abstract int getScore();

    /**
     * Define o valor da carta
     * @param score novo valor da carta
     */
    public abstract void setScore(int score);

    /**
     * Mostra o seu valor e o naipe no console
     */
    public abstract void show();
}