package lesson6;

public class Person {

    private String name;
    private String surname;
    private String birthDate;
    private double salary;
    private String phone;
    private String email;

    private Person() {
    }

    private Person(String name,
                   String surname,
                   String birthDate,
                   double salary,
                   String phone,
                   String email) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static class PersonBuilder {

        private String name;
        private String surname;
        private String birthDate;
        private double salary;
        private String phone;
        private String email;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public PersonBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public PersonBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public PersonBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(
                    name, surname, birthDate,
                    salary, phone, email);
        }
    }
}
