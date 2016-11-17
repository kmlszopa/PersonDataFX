package sample;

/**
 * Created by kmlsz on 17.11.2016.
 */
public class Person {
    private String name;
    private String surname;

    @Override
    public String toString() {
        return name+" "+surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
