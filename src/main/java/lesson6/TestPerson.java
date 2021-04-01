package lesson6;

public class TestPerson {

    public static void main(String[] args) {

        Person person = Person.builder()
                .setName("Ivan")
                .setSurname("Ivanov")
                .setPhone("889988888")
                .build();

        Magazine.Article article = new Magazine().new Article();
        // foo(ahjfga)
        // new Magazine();

        // ListFactory.getAList();
    }
}
