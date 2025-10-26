package racingcar.view;

import racingcar.domain.Car;
import java.util.List;
//각 차수별 실행 결과와 최종 우승자를 출력
public class ResultView {

    public static void printExecutionResult() {
        System.out.println("\n실행 결과");
    }

    public static void printRoundResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }

    public static void printWinners(List<String> winners) {
        System.out.println("최종 우승자 : " + String.join(", ", winners));
    }
}
