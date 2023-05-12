package org.example.streamsApi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();
        // Imperative Approach
        // Declarative Approach
            //Filter
        List<Person> females = people.stream().filter(person -> person.getGender().equals(Gender.FEMALE)).toList();
            // Sort All
        List<Person> sortedPeople = people.stream().sorted(Comparator.comparing(Person::getAge).reversed().thenComparing(Person::getGender)).toList();
            // ALL match
        boolean allMatch = people.stream().allMatch(person -> person.getAge()>20);
        System.out.println("is all people match the cnd : "+allMatch);
            // ANY match
        boolean anyMatch = people.stream().anyMatch(person -> person.getAge()>20);
        System.out.println("is there any person at least match the cdn : "+anyMatch);
            // None match equiv !anymatch
        boolean noneMatch = people.stream().noneMatch(person -> person.getAge()>200);
        System.out.println("is all people not matching >200 : "+noneMatch);
            //  Max
        Optional<Person> person = people.stream().max(Comparator.comparing(Person::getAge));
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
            // Min
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);
            //Group
        Map<Gender,List<Person>> groupedByGender = people.stream().collect(Collectors.groupingBy(Person::getGender));
        groupedByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
            System.out.println();
        });
        Optional<String> oldestFemaleAge= people.stream()
                .filter(person1 -> person1.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName); // without this map this it will return Person
        oldestFemaleAge.ifPresent( name -> System.out.println(name) );
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("ismail harik 1",20,Gender.MALE),
        new Person("yassmin harik 1",34,Gender.FEMALE),
                new Person("kamatch harik ",24,Gender.MALE),
                new Person("kamatcha harik ",24,Gender.FEMALE),
        new Person("James Gosling",19,Gender.MALE)
        );
    }
}
