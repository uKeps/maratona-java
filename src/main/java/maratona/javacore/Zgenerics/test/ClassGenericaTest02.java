package maratona.javacore.Zgenerics.test;

import maratona.javacore.Zgenerics.domain.Barco;
import maratona.javacore.Zgenerics.service.BarcoRentavelService;

public class ClassGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando barco por um mes...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
