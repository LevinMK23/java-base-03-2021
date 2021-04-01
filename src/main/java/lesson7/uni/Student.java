package lesson7.uni;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name, surname;
    private Group group;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public List<Student> getGroupMates() {

        if (group == null) {
            return List.of();
        }

        List<Student> students = new ArrayList<>(group.getStudents());
        students.remove(this);

        return students;
    }

    public List<Teacher> getTeachers() {
        if (group == null) {
            return List.of();
        }
        return group.getTeachers();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
