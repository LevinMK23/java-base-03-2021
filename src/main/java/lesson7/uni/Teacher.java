package lesson7.uni;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private String name, surname;
    private List<Group> groups;

    public Teacher(String name, String surname) {
        this.name = name;
        this.surname = surname;
        groups = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
