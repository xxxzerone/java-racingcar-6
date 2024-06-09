package racingcar.domain;

public class Car {

    private static final int MOVING_FORWARD = 4;

    private String name;
    private int step = 0;

    public Car(String name) {
        this.name = name;
    }

    public void forward(int step) {
        if (step >= MOVING_FORWARD) {
            this.step++;
        }
    }

    @Override
    public String toString() {
        return name + " : ";
    }

    public String getName() {
        return name;
    }

    public int getStep() {
        return step;
    }
}
