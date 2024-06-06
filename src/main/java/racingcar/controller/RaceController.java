package racingcar.controller;

import racingcar.view.InputView;

public class RaceController {

    private final InputView inputView;

    public RaceController(InputView inputView) {
        this.inputView = inputView;
    }

    public void start() {
        String inputCar = inputView.readCar();

        // TODO 이름 검증

        String inputRound = inputView.readRound();

        // TODO 라운드 숫자 변환
    }
}
