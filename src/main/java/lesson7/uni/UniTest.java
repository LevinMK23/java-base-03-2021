package lesson7.uni;

public class UniTest {

    public static void main(String[] args) {
        Group group = new Group(1);

        Student ivan = new Student("Ivan", "Ivanov");
        Student petr = new Student("Petr", "Petrov");
        Student oleg = new Student("Oleg", "Olegov");

        Teacher alex = new Teacher("Alex", "Alexeev");
        Teacher xela = new Teacher("Xela", "Xelaaa");

        group.addStudent(ivan);
        group.addStudent(petr);
        group.addStudent(oleg);

        group.addTeacher(alex);
        group.addTeacher(xela);

        System.out.println(ivan.getGroup());
        System.out.println(ivan.getTeachers());
        System.out.println(ivan.getGroupMates());

        System.out.println(petr.getGroupMates());
        System.out.println(oleg.getGroupMates());
    }
}
