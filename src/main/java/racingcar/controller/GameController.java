package racingcar.controller;

import racingcar.domain.RacingGame;
import racingcar.view.InputView;
import racingcar.view.ResultView;
import java.util.List;

public class GameController {
    public void run(){
        List<String> carNames = InputView.inputCarNames();

        int tryCount = InputView.inputTryCount();

        RacingGame racingGame = new RacingGame(carNames);
        ResultView.printExecutionResult();

        for (int i = 0; i < tryCount; i++) {
            racingGame.race();
            ResultView.printRoundResult(racingGame.getCars());
        }

        List<String> winners = racingGame.findWinners();
        ResultView.printWinners(winners);

    }
}