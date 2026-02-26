package maratona.javacore.Npolimorfismo.service;

import maratona.javacore.Npolimorfismo.repository.Repository;

public class RepositoryDatabase implements Repository{
    @Override
    public void save() {
        System.out.println("Saving to a database");
    }
}
