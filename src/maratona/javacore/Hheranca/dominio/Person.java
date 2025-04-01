package maratona.javacore.Hheranca.dominio;

public class Person {
    protected String name;
    protected String cpf;
    protected Address address;
    static {
        System.out.println("inside the static person");
    }
    {
        System.out.println("inside the initialization person");
    }
    {
        System.out.println("inside the initialization person2");
    }

    public Person(String name){
        System.out.println("Inside the person's constructor");
        this.name = name;
    }

    public Person(String name, String cpf){
        this(name);
        this.cpf= cpf;
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.address.getRoad() + this.address.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAdress(Address address) {
        this.address = address;
    }
}
