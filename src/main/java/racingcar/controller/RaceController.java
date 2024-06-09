package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Race;
import racingcar.domain.Rank;
import racingcar.util.Separate;
import racingcar.util.Validate;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.Arrays;
import java.util.List;

public class RaceController {

    private final InputView INPUTVIEW;
    private final OutputView OUTPUTVIEW;

    public RaceController(InputView inputView, OutputView outputview) {
        INPUTVIEW = inputView;
        OUTPUTVIEW = outputview;
    }

    public void start() {
        String inputCar = INPUTVIEW.readCar();
        String[] separateCar = Separate.carName(inputCar);
        validate(separateCar);

        List<Car> cars = toList(separateCar);
        int round = toInt(INPUTVIEW.readRound());
        Race race = new Race(cars);
        raceStart(race, round);

        OUTPUTVIEW.winner(Rank.winner(race));
    }

    private void validate(String[] cars) {
        if (cars.length == 1) {
            throw new IllegalArgumentException("이름은 최소 2개 이상이어야 합니다.");
        }
        if (Validate.isOverLength(cars)) {
            throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
        }
        if (Validate.isNameLowerCase(cars)) {
            throw new IllegalArgumentException("이름은 소문자 알파벳만 가능합니다.");
        }
    }

    private List<Car> toList(String[] cars) {
        return Arrays.stream(cars)
                .map(Car::new)
                .toList();
    }

    private int toInt(String inputRound) {
        try {
            return Integer.parseInt(inputRound);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자만 가능합니다.");
        }
    }

    private void raceStart(Race race, int round) {
        System.out.printf("%n실행 결과%n");

        for (int i = 0; i < round; i++) {
            race.track();
            OUTPUTVIEW.resultRacing(race);
        }
    }

}
