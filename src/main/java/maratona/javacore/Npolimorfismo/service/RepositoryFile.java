
package maratona.javacore.Npolimorfismo.service;

import maratona.javacore.Npolimorfismo.repository.Repository;

public class RepositoryFile implements Repository {

    @Override
    public void save() {
        System.out.println("Saving in a file");
    }
}
