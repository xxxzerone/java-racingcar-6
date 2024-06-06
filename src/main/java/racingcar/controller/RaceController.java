package racingcar.controller;

import racingcar.util.Separate;
import racingcar.util.Validate;
import racingcar.view.InputView;

public class RaceController {

    private final InputView INPUTVIEW;

    public RaceController(InputView inputView) {
        INPUTVIEW = inputView;
    }

    public void start() {
        String inputCar = INPUTVIEW.readCar();
        String[] cars = Separate.carName(inputCar);
        validate(cars);

        int round = INPUTVIEW.readRound();
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
}
