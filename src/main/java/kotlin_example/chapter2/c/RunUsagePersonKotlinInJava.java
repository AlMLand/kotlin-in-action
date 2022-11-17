package kotlin_example.chapter2.c;

import java.util.List;

public class RunUsagePersonKotlinInJava {
    public static void main(String[] args) {
        PersonKotlin personKotlin = new PersonKotlin("T", false);
        PersonJava personJava = new PersonJava("A", true);

        List<SharedI> persons = List.of(personKotlin, personJava);
        persons.forEach(System.out::println);
        persons.forEach(p -> System.out.println("Info: " + p.getFullInfo()));
    }
}
