package maratona.javacore.Gassociacao.test;

import maratona.javacore.Gassociacao.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Neymar");
        Player player2 = new Player("Messi");
        Player player3 = new Player("Suarez");
        Player[] players = {player1, player2, player3};
        for (Player player : players) {
            player.print();
        }


    }
}
