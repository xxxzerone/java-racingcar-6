package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class Random {

    public static int pickNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
