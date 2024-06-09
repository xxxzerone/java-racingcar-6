package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Rank {

    public static List<Car> winner(Race race) {
        List<Car> cars = race.getCars();
        int maxStep = getMaxStep(cars);

        return cars.stream()
                .filter(car -> car.getStep() == maxStep)
                .collect(Collectors.toList());
    }

    private static int getMaxStep(List<Car> cars) {
        return cars.stream()
                .mapToInt(Car::getStep)
                .max()
                .getAsInt();
    }
}
