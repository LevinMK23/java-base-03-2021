package lesson7.stringtest;

import java.util.Arrays;
import java.util.Locale;

public class StringTest {

    static void stringTime() {
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 500000; i++) {
            s.append("1");
        }
        String s1 = s.toString();
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms.");
    }

    public static void main(String[] args) {
        String s = "\n\r    123    \n";
        System.out.println(s.length());
        System.out.println(s.trim());
        String line = "123   15 5 5 5 555 51515  161  16";
        String[] words = line.split(" +");
        System.out.println(Arrays.toString(words));
        String value = "134";
        int x = Integer.parseInt(value);
        String x1 = String.valueOf(x);

        //89112333333
        String number = "+7 (911) 233-33-33";
        number = number.replaceAll("\\+7", "8")
                .replaceAll("[ ()-]", "");
        System.out.println(number);

        System.out.println(number.matches("[0-9]{11}"));

        String pull = "www.github.com/olol/pull/1";

        String regex = "\\w+\\.github\\.com/\\w+/pull/[0-9]+";
        System.out.println(pull.matches(regex));

        String a = "123456";

        System.out.println(a.substring(3));
        System.out.println(a.substring(0, 4));

        System.out.println(a.indexOf("45"));
        System.out.println(a.indexOf("4533"));

        String s1 = "abc", s2 = "def";
        s1 += s2;

        System.out.println(s1);

        stringTime();

        A a1 = new A();
        for (int i = 0; i < 10; i++) {
            a1.process().process();
        }
    }
}
