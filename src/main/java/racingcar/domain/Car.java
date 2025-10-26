package racingcar.domain;

import racingcar.util.RandomNumberGenerator;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name){
        validateName(name);
        this.name = name;
    }

    public void move(){
        int randomValue = RandomNumberGenerator.generate();
        if (randomValue >= 4){
            position++;
        }
    }

    private void validateName(String name){
        if (name == null || name.isBlank() || name.length() > 5){
            throw new IllegalArgumentException("자동차 이름은 1~5자여야 합니다: " + name);
        }
    }

    public String getName(){
        return name;
    }

    public int getPosition(){
        return position;
    }
}