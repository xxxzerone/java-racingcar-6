package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Race;

import java.util.List;

public class OutputView {

    public void resultRacing(Race race) {
        List<Car> cars = race.getCars();
        for (Car car : cars) {
            System.out.println(car + stepToDash(car));
        }
    }

    public void winner(List<Car> winner) {
        System.out.print("최종 우승자 : ");

        StringBuilder sb = new StringBuilder();
        for (Car car : winner) {
            sb.append(car.getName()).append(", ");
        }

        System.out.println(sb.substring(0, sb.length() - 2));
    }

    private String stepToDash(Car car) {
        return "-".repeat(car.getStep());
    }
}
