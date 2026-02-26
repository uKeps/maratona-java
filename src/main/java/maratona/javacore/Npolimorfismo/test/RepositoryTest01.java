package maratona.javacore.Npolimorfismo.test;

import maratona.javacore.Npolimorfismo.repository.Repository;
import maratona.javacore.Npolimorfismo.service.RepositoryDatabase;

import java.util.ArrayList;
import java.util.List;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new RepositoryDatabase();
        repository.save();

        List<String> list = new ArrayList<>();
        list.add("Sasuke");
        list.add("Itachi");
        list.add("Vasco");
        System.out.println(list);
    }
}
