package com.company;

public interface ScalarFunction extends RegulaFalsiXr, BisectionXr, FixedPointXn{
    public abstract double f(double x);

}
