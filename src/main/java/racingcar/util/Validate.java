package racingcar.util;

import java.util.Arrays;

public class Validate {

    public static boolean isOverLength(String[] cars) {
        return Arrays.stream(cars)
                .anyMatch(car -> car.length() > 5);
    }

    public static boolean isNameLowerCase(String[] cars) {
        return Arrays.stream(cars)
                .anyMatch(car -> !isLowerCase(car.toCharArray()));
    }

    private static boolean isLowerCase(char[] carToChars) {
        for (char car : carToChars) {
            if (!Character.isLowerCase(car)) {
                return false;
            }
        }
        return true;
    }
}
