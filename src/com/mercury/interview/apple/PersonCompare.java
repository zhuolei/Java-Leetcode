package com.mercury.interview.apple;


import java.util.Comparator;

public class PersonCompare {
    public static void main(String[] args) {
        Comparator<Person> comparator = new Comparator<Person>(){
            @Override
            public int compare(Person a, Person b) {
                if (a.firstName.equals(b.firstName)) {
                    return a.lastName.compareTo(b.lastName);
                }
                return a.firstName.compareTo(b.firstName);
            }

        };

    }
}

class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}