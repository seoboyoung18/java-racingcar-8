package racingcar.domain;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

class RacingGameTest {

    @Test
    void 가장_멀리_간_자동차가_우승자이다() {
        RacingGame game = new RacingGame(List.of("pobi", "woni", "jun"));

        // pobi만 2번 전진
        game.getCars().get(0).move(4);
        game.getCars().get(0).move(4);

        List<String> winners = game.findWinners();
        assertThat(winners).containsExactly("pobi");
    }

    @Test
    void 여러_자동차가_공동_우승할_수_있다() {
        RacingGame game = new RacingGame(List.of("pobi", "woni"));

        // 둘 다 같은 위치까지 전진
        game.getCars().forEach(car -> {
            car.move(4);
            car.move(4);
        });

        List<String> winners = game.findWinners();
        assertThat(winners).containsExactlyInAnyOrder("pobi", "woni");
    }
}
