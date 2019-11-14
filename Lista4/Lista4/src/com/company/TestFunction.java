package com.company;

public class TestFunction implements ScalarFunction{

    double poprawnyWynik=0.56714329;

    private double pochodna(double xl){
        return (-Math.exp(-xl)-1);
    }

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
    public double fpxn(double xl) {
        return f(xl)+xl;
    }

    @Override
    public double bladEt(double x) {
        return ((poprawnyWynik-(x))/poprawnyWynik)*100;
    }

    @Override
    public double nxn(double xl) {
        return xl-((f(xl))/(pochodna(xl)));
    }

    @Override
    public double sxr(double xl, double xu) {
        return xl-((f(xl)*(xu-xl))/((f(xu)-f(xl))));
    }

    @Override
    public double dokDwieWartosci(double xl, double xu) {
        return (Math.abs((xl - xu) / xl)) * 100;
    }

    @Override
    public double dokJednaWartosc(double xl, double xr) {
        return (Math.abs((xl - xr) / xl)) * 100;
    }
}
