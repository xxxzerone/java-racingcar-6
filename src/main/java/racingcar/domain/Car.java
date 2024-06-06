package racingcar.domain;

public class Car {

    public final int FORWARD_AVAILABLE = 4;

    private String name;
    private int step = 0;

    public Car(String name) {
        this.name = name;
    }

    public void forward(int step) {
        if (step >= FORWARD_AVAILABLE) {
            this.step++;
        }
    }
}
