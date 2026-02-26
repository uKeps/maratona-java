package maratona.javacore.ZZHpadroesdeprojeto.test;

import maratona.javacore.ZZHpadroesdeprojeto.domain.Aircraft;
import maratona.javacore.ZZHpadroesdeprojeto.domain.AircraftSingletonEager;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }

    static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getINSTANCE());
        Aircraft airCraft = new Aircraft("787-900");
        System.out.println(airCraft.bookSeat(seat));
    }
}
