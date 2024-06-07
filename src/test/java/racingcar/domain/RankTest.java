package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RankTest {

    private Car pobi;
    private Car woni;
    private Car jun;

    @BeforeEach
    void setUp() {
        pobi = new Car("pobi");
        woni = new Car("woni");
        jun = new Car("jun");
        woni.forward(5);
    }

    @Test
    @DisplayName("woni 우승자 확인")
    void winner() {
        List<Car> winner = Rank.winner(new Race(List.of(pobi, woni, jun)));

        assertThat(winner.size()).isEqualTo(1);
        assertThat(winner.get(0)).isEqualTo(woni);
    }

    @Test
    @DisplayName("pobi, woni 우승자 확인")
    void winnerMultiple() {
        pobi.forward(5);
        List<Car> winner = Rank.winner(new Race(List.of(pobi, woni, jun)));

        assertThat(winner.size()).isEqualTo(2);
        assertThat(winner).hasSameElementsAs(List.of(pobi, woni));
    }
}