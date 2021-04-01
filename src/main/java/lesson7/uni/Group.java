package lesson7.uni;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private int id;
    private List<Student> students;
    private List<Teacher> teachers;

    public Group(int id) {
        this.id = id;
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            if (student.getGroup() == null) {
                student.setGroup(this);
            }
        }
    }

    public void addTeacher(Teacher teacher) {
        if (!teachers.contains(teacher)) {
            teachers.add(teacher);
            if (!teacher.getGroups().contains(this)) {
                teacher.getGroups().add(this);
            }
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                '}';
    }
}
