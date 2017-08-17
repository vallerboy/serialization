import java.io.Serializable;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 17.08.2017.
 */
public class Person implements Serializable{
    private String name;
    private String lastname;
    private int age;

    public Person() {
    }

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
