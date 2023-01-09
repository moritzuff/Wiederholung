package wiederholung;

public abstract class Person {
    protected String name;
    protected int telefon;
    protected String mail;

    public Person(String name, int telefon, String mail) {
        this.name = name;
        this.telefon = telefon;
        this.mail = mail;
    }
}
