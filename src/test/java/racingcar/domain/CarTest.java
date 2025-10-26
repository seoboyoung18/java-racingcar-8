package racingcar.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CarTest {

    @Test
    void 자동차_이름이_5자를_초과하면_예외가_발생한다() {
        assertThatThrownBy(() -> new Car("pobibobi"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("자동차 이름은 1~5자");
    }

    @Test
    void 자동차_이름이_비어있으면_예외가_발생한다() {
        assertThatThrownBy(() -> new Car(""))
                .isInstanceOf(IllegalArgumentException.class);

    }

    @Test
    void 랜덤값이_4이상이면_자동차가_전진한다() {
        Car car = new Car("pobi");

        car.move(4);
        assertThat(car.getPosition()).isEqualTo(1);

        car.move(9);
        assertThat(car.getPosition()).isEqualTo(2);
    }

    @Test
    void 랜덤값이_4미만이면_자동차가_멈춘다() {
        Car car = new Car("woni");

        car.move(0);
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(0);
    }
}