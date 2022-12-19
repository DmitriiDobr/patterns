import java.util.Objects;

public class Person {
    protected final String name;
    protected final String surname;
    protected String city;
    protected int age;

    public Person(String name, String surname) {
        this(name,surname,-1);

    }

    public Person(String name, String surname, int age) {
        this.name=name;
        this.surname=surname;
        this.age=age;
    }

    public boolean hasAge() {
        return this.age!=-1;

    }
    public boolean hasAddress() {
        return city!=null;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public int getAge() {
        return this.age;
    }

    public String getAddress() {
        return city;
    }

    public void setAddress(String city) {
        this.city=city;
    }
    public void happyBirthday() {
        if (hasAge()){
            age++;
        }

    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                    .setSurname(surname)
                    .setAge(0)
                    .setAddress(city);

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(city, person.city);
    }
}