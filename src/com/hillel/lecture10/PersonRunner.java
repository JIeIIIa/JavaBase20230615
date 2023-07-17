package com.hillel.lecture10;

public class PersonRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
//        demo1();
//        demo2();
        demo3();


    }

    private static void demo3() throws CloneNotSupportedException {
        Person person = new Person("Jack");
        Person anotherPerson = new Person(person);
        Person clonedPerson = person.clone();

        System.out.println(person.equals(anotherPerson));
        System.out.println(person == anotherPerson);

        System.out.println(person.equals(clonedPerson));
        System.out.println(person == clonedPerson);
    }

    private static void demo2() {
        Person person = new Person("Jack");
        Person anotherPerson = new Person("Jack");
        Person copiedPerson = person;

        System.out.println(person == copiedPerson);
        System.out.println(person.equals(anotherPerson));

        System.out.println(person);
        String line = "line: " + person;
        System.out.println(line);
    }


    private static void demo1() {
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
