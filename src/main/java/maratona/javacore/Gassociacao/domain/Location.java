package maratona.javacore.Gassociacao.domain;

public class Location {
    private String addres;

    public Location(String addres) {
        this.addres = addres;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "Location{" +
                "addres='" + addres + '\'' +
                '}';
    }
}
