package com.hillel.lecture10;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person("Jack");
        Student student = new Student("Jack");
        System.out.println(student.info());

        Animal animal = new Animal();
        Runnable[] runnables = {person, animal};

        for (Runnable object : runnables) {
            object.run();
        }

        System.out.println(student.transposeMatrix());

        AdvanceSolvable advanceSolvable = student;
        System.out.println(advanceSolvable.solveIntegral("simple integral"));
        System.out.println(advanceSolvable.solveSimpleExpression("1 + 1"));


        Person anotherPerson = (Person) advanceSolvable;
        Student anotherStudent = (Student) advanceSolvable;
        AbstractPerson abstractPerson = (AbstractPerson) advanceSolvable;

        Solvable solvable = person;
        student = (Student) person; // ClassCastException occurs, because we try to cast Person to Student

    }
}
