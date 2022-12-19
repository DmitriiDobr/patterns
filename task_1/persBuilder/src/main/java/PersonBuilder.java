public class PersonBuilder {

    private String name;
    private String surname;
    private int age = -1;
    private String address;

    public PersonBuilder setName(String name) {
        this.name=name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname=surname;
        return this;

    }
    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 200) {
            throw new IllegalArgumentException("Введены некорректные данные!");
        }
        this.age=age;
        return this;

    }
    public PersonBuilder setAddress(String city) {
        this.address=city;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Не хватает обязательных данных!");
        }
        Person per = new Person(name,surname,age);
        per.setAddress(address);
        return per;
    }
}