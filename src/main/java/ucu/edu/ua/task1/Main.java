package ucu.edu.ua.task1;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
        User user = User.builder()
                .name("Tsymbal Mariia")
                .age(18)
                .weight(60)
                .height(174)
                .courses(Arrays.asList("Probability", "OOP"))
                .gender(Gender.MALE)
                .build();
        System.out.println(user);
    }
}
