package maratona.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void remove() {
        System.out.println("Removing from database");
    }

    @Override
    public void load() {
        System.out.println("Loading data from a database");
    }

    @Override
    public void checkPermission() {
        System.out.println("checking permission in the database ");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Inside retrieveMaxDataSize in the database");
    }
}
