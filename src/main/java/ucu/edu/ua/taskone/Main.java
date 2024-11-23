package ucu.edu.ua.taskone;

import java.util.Arrays;

public class Main {
    private static final int DEFAULT_AGE = 18;
    private static final int DEFAULT_WEIGHT = 60;
    private static final int DEFAULT_HEIGHT = 174;

    public static void main(String[] args) {
        User user = User.builder()
                .name("Tsymbal Mariia")
                .age(DEFAULT_AGE)
                .weight(DEFAULT_WEIGHT)
                .height(DEFAULT_HEIGHT)
                .courses(Arrays.asList("Probability", "OOP"))
                .gender(Gender.FEMALE)
                .build();
        System.out.println(user);
    }
}
    
