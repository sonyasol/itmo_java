package org.itmo.lab2;

public class Calculator {
    public Double sum(Integer firstNumber, Integer secondNumber) {
        double sum;
        sum = (double)firstNumber + secondNumber;
        return sum;
    }

    public Double sum(Double firstNumber, Double secondNumber) {
        double sum;
        sum = firstNumber + secondNumber;
        return sum;
    }

    public Double sum(Long firstNumber, Long secondNumber) {
        double sum;
        sum = (double)firstNumber + secondNumber;
        return sum;
    }

    public Double divide(Integer firstNumber, Integer secondNumber) {
        double divide;
        divide = (double)firstNumber/secondNumber;
        return divide;
    }

    public Double divide(Double firstNumber, Double secondNumber) {
        double divide;
        divide = firstNumber/secondNumber;
        return  divide;
    }

    public Double divide(Long firstNumber, Long secondNumber) {
        double divide;
        divide = (double)firstNumber/secondNumber;
        return divide;
    }

    public Double multiply(Integer firstNumber, Integer secondNumber) {
        double multiply;
        multiply = firstNumber * secondNumber;
        return multiply;
    }

    public Double multiply(Double firstNumber, Double secondNumber) {
        double multiply;
        multiply = firstNumber * secondNumber;
        return multiply;
    }

    public Double multiply(Long firstNumber, Long secondNumber) {
        double multiply;
        multiply = (double)firstNumber * secondNumber;
        return  multiply;
    }

    public Double subtract(Integer firstNumber, Integer secondNumber) {
        double subtract;
        subtract = (double)firstNumber - secondNumber;
        return subtract;
    }

    public Double subtract(Double firstNumber, Double secondNumber) {
        double subtract;
        subtract = firstNumber - secondNumber;
        return subtract;
    }

    public Double subtract(Long firstNumber, Long secondNumber) {
        double subtract;
        subtract = (double)firstNumber - secondNumber;
        return subtract;
    }
}
