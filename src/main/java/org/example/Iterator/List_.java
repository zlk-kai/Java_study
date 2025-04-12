package org.example.Iterator;

public class List_ {
    public static void main(String[] args) {
        Person[] person = new Person[10];

        for (Person person1 : person) {
            System.out.println(person1);
        }
    }
}

class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}