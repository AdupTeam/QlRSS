package com.example;

/**
 * Created with IntelliJ IDEA.
 * User: Szemek
 * Date: 06.06.14
 * Time: 22:25
 */

public class Calculator {
    private int result;

    public void add(int number1, int number2) {
        result = number1 + number2;
    }

    public void deduct(int number1, int number2) {
        result = number1 - number2;
    }

    public void square(int number1){
        result =  number1*number1;
    }

    public int getResult() {
        return result;
    }
}
