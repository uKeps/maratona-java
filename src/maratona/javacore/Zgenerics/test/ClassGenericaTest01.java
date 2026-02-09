package maratona.javacore.Zgenerics.test;

import maratona.javacore.Zgenerics.domain.Carro;
import maratona.javacore.Zgenerics.service.CarroRentavelService;

public class ClassGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por um mes...");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
