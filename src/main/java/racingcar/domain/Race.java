package racingcar.domain;

import racingcar.util.Random;

import java.util.List;

public class Race {

    private List<Car> cars;

    public Race(List<Car> cars) {
        this.cars = cars;
    }

    public void track() {
        for (Car car : cars) {
            car.forward(Random.pickNumber());
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
