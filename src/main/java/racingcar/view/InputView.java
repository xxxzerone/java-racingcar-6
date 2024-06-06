package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private final String START_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private final String ROUND_MESSAGE = "시도할 회수는 몇회인가요?";

    public String readCar() {
        System.out.println(START_MESSAGE);

        return Console.readLine();
    }

    public int readRound() {
        System.out.println(ROUND_MESSAGE);
        try {
            return Integer.parseInt(Console.readLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자만 가능합니다.");
        }
    }
}
