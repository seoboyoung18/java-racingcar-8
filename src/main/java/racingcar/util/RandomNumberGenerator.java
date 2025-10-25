package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {
    // 상수 최댓값, 최솟값 설정
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;

    private RandomNumberGenerator(){
        // 인스턴스 생성 방지 (유틸 클래스니까)
    }

    public static int generate() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
    }
}