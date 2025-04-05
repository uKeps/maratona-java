package maratona.javacore.Npolimorfismo.service;

import maratona.javacore.Npolimorfismo.repository.Repository;

public class RepositoryMemory implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in memory");
    }
}
