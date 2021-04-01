package lesson2.hw2;

public class HomeWork5 {
    public static void main(String[] args) {
        // 4. Создать массив из 5 сотрудников.
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "QA Engineer", "ivivan@mailbox.com", "8(923)123-12-64", 30000, 30);
        empArray[1] = new Employee("Kirillov Kirill", "Software Developer", "kirillov@mailbox.com", "8(924)123-31-56", 70000, 34);
        empArray[2] = new Employee("Olegov Oleg", "Software Architect", "olegov@mailbox.com", "8(924)123-74-24", 80000, 44);
        empArray[3] = new Employee("Pavlov Pavel", "System Analyst", "pavlov@mailbox.com", "8(924)124-46-78", 60000, 41);
        empArray[4] = new Employee("Maksimov Maksim", "Technical Writer", "maximov@mailbox.com", "8(924)846-78-85", 50000, 40);

        // 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        System.out.println("Сотрудники старше 40 лет:\n");
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40){
                empArray[i].printEmployee();
            }
        }
    }

}
