package maratona.javacore.Zgenerics.test;

import maratona.javacore.Zgenerics.domain.Barco;
import maratona.javacore.Zgenerics.domain.Carro;
import maratona.javacore.Zgenerics.service.BarcoRentavelService;
import maratona.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClassGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando carro por um mes...");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("-------------------------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando carro por um mes...");
        rentalServiceBarco.retornarObjetoAlugado(barco);

    }
}
