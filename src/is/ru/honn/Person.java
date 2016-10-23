package is.ru.honn;

/**
 * Created by KristinnHeiðar on 23.10.2016.
 */
public class Person {
    private String name;
    private String email;

    public Person(){}

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: '" + name + "'\nEmail: '" + email + "'";
    }
}
