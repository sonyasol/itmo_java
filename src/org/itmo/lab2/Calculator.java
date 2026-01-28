package org.itmo.lab2;

public class Calculator {
    private Integer a;
    private Integer b;

    private Double double_a;
    private Double double_b;

    private Long long_a;
    private Long long_b;

    public Double Sum(Integer a, Integer b)
    {
        double sum;
        this.a = a;
        this.b = b;

        sum = (double)a + b;
        return sum;
    }

    public Double Sum(Double double_a, Double double_b)
    {
        double sum;
        this.double_a = double_a;
        this.double_b = double_b;

        sum = double_a + double_b;
        return sum;
    }

    public Double Sum(Long long_a, Long long_b)
    {
        double sum;
        this.long_a = long_a;
        this.long_b = long_b;

        sum = (double)long_a + long_b;
        return sum;
    }

    public Double Divide(Integer a, Integer b)
    {
        double divide;
        divide = (double)a/b;
        return divide;
    }

    public Double Divide(Double double_a, Double double_b)
    {
        double divide;
        divide = double_a/double_b;
        return  divide;
    }

    public Double Divide(Long long_a, Long long_b)
    {
        double divide;
        divide = (double)long_a/long_b;
        return divide;
    }

    public Double Multiply(Integer a, Integer b)
    {
        double multiply;

        multiply = a * b;
        return multiply;
    }

    public Double Multiply(Double double_a, Double double_b)
    {
        double multiply;
        multiply = double_a * double_b;
        return multiply;
    }

    public Double Multiply(Long long_a, Long long_b)
    {
        double multiply;
        multiply = (double)long_a * long_b;
        return  multiply;
    }

    public Double Subtract(Integer a, Integer b)
    {
        double subtract;
        subtract = (double)a - b;
        return subtract;
    }

    public Double Subtract(Double double_a, Double double_b)
    {
        double subtract;
        subtract = double_a - double_b;
        return subtract;
    }

    public Double Subtract(Long long_a, Long long_b)
    {
        double subtract;
        subtract = (double)long_a - long_b;
        return subtract;
    }
}
