package one;

import java.time.Year;

public class Human {
    String name;
    String surname;
    int year_of_both;

    public Human(String name, String surname, int year_of_both) {
        this.name = name;
        this.surname = surname;
        this.year_of_both = year_of_both;
    }

    static int current_year = Year.now().getValue();

    public void printHuman() {
        int age = current_year - year_of_both;
        String str = "Фамилия: " + surname + ". Имя: " + name + ". Возраст: " + age;
        System.out.println(str);
    }
}
