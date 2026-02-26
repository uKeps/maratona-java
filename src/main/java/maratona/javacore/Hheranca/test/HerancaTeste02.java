package maratona.javacore.Hheranca.test;

import maratona.javacore.Hheranca.dominio.Employee;

public class HerancaTeste02 {
    // 0 - Bloco de inicialização estaticoda super classe é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estaticoda subclasse é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaço na memória para o objeto da superclasse
    // 3 - Cada atributo de superclasse é criado e inicializado com seus valores default ou o que for passado
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5 - Construtor da superclasse é executado
    // 6 - Alocado espaço na memória para o objeto da subclasse
    // 7 - Cada atributo de subclasse é criado e inicializado com seus valores default ou o que for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
    // 5 - Construtor da subclasse é executado
    public static void main(String[] args) {
        Employee employee = new Employee("Jiraya");
    }
}
