package maratona.Exercicios;

// 12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
// conforme a escolha da forma de pagamento
// pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os
// códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

// Tabela de Código de Condições de Pagamento

// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
//
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
//
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
//
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Product value: ");
        double product = sc.nextDouble();
        System.out.println("1 - Pix");
        System.out.println("2 - Credit");
        System.out.println("3 - installments 1,2x");
        System.out.println("4 - installments 3x + ");
        int option = sc.nextInt();

        switch (option){
            case 1:
                double discount = product * 0.15;
                System.out.println("15% discount %.2f: " + (product - discount));
                break;

            case 2:
                double discount2 = product * 0.1;
                double result = product - discount2;
                System.out.printf("10%% discount: %.2f\n", (product - discount2));
                break;

            case 3:
                System.out.printf("Normal price, no discount for u :/ %.2f", product);
                break;

            case 4:
                double tax = product * 0.1;
                System.out.printf("10%% tax make the L: %.2f", (product + tax));
                break;

            default:
                System.out.println("Opção inválida.");
        }
        sc.close();
    }
}
