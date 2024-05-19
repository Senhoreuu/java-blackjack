package blackjack;

import blackjack.game.BlackJack;
import blackjack.utils.IO;

public class Main {
    public static void main(String[] args) {
        BlackJack blackJack = new BlackJack();

        blackJack.start();

        int action = 0;

        while (action != -1) {
            IO.print("Que acao deseja fazer?");
            IO.print("1 - Pescar");
            IO.print("2 - Parar");
            IO.print("3 - Abandonar");

            action = IO.readInt();

            switch (action) {
                case 1:
                    blackJack.hit();

                    if (blackJack.checkIfBusted()) {
                        blackJack.dealerWin();
                        action = -1;
                    }
                    break;
                case 2:
                    blackJack.stand();
                    break;
                case 3:
                    action = -1;
                    break;
                default:
                    IO.print("Opcao invalida. Tente novamente.");
                    break;
            }

            if (action == -1) {
                IO.print("Deseja comecar uma partida nova? (S/N)");
                String option = IO.readString();

                if (option.equalsIgnoreCase("s")) {
                    action = 0;
                    blackJack.restart();
                }
            }
        }
    }
}
