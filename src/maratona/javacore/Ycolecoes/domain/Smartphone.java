package maratona.javacore.Ycolecoes.domain;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    // Reflexivo: x.equals(x) tenq ser true para td q for diferente de null
    // simetrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    // transitividade: para x,y,z diferentes de null, se x.equals(y) == true e y.equals(x) == true logo, y.equals(z) == true
    // consistente: x.equals(x) == always true se x for diferente de null
    // para x diferente de null, x.equals(null) tenq retornar false.
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    //se x.equals(y) == true, y.hashCode() == x.hashCode()
    // y.hashCode() == x.hashCode() n necessariamente o equals de y.equals(x) tenq ser true
    // x.equals(y) == false
    // y.hashCode() != x.hashCode() x.equals(y) devera ser false.
    @Override
    public int hashCode() {
        return serialNumber == null ? 0: this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
