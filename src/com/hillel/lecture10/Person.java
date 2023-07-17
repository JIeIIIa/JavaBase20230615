package com.hillel.lecture10;

import java.util.Objects;

public class Person extends AbstractPerson implements Runnable, Eatable, Solvable, Cloneable {
    public static final String PREFIX = "I'm a person.";

    protected String name;

    private Address address;

    public Person(Person person) {
        this.name = person.name;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return PREFIX + " My name is " + name;
    }

    public String solveSimpleExpression(String expression) {
        return null;
    }

    @Override
    public void run() {
        System.out.println("Person: Running...");
    }


    @Override
    public void eat() {
        System.out.println("Person: eating...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        if (!Objects.equals(name, person.name)) return false;
        return Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
