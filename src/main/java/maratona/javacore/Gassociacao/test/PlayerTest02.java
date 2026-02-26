package maratona.javacore.Gassociacao.test;

import maratona.javacore.Gassociacao.domain.Player;
import maratona.javacore.Gassociacao.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player1 = new Player("Neymar");
        Team team = new Team ("Barcelona");

        player1.setTeam(team);
        player1.print();
    }
}
