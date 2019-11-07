package com.company;

public class TestFunction implements ScalarFunction{
    @Override
    public double f(double x) {
        return Math.exp(-x)-x;
    }

    @Override
    public double rfxr(double xl, double xu) {
        return xu-(f(xu)*(xl-xu))/(f(xl)-f(xu));
    }

    @Override
    public double bxr(double xl, double xu) {
        return (xu + xl) / 2;
    }

    @Override
    public double fpxn(double xn) {
        return f(xn)+xn;
    }
}
