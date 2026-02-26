package maratona.javacore.Gassociacao.test;

import maratona.javacore.Gassociacao.domain.Player;
import maratona.javacore.Gassociacao.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player = new Player("Neymar");
        Player player2 = new Player("Ronaldo");
        Team team = new Team("Brasil");
        Player[] players = {player, player2};

        player.setTeam(team);
        player2.setTeam(team);

        team.setPlayers(players);
        System.out.println("--- Player ---");
        player.print();
        System.out.println("--- Team ---");
        team.print();
    }
}
