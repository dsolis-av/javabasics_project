package people;

public abstract class Person {
    //here we declare the abstract class of a Person. The reason for it is that every person will have an id and a name, so we save code by defining an abstract class with this properties
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
