package javaREFLECTION_api;

public class Person {
    private int id;
    public String name="default";

    public Person() {
        id=-1;
        name = "NoName";
    }

    public void sayHello(){
        System.out.println("Person with id: " +id+" and name: "+name+"says hello!");
    }
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

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
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}



