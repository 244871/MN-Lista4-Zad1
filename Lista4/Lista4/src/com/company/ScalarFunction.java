package com.company;

public interface ScalarFunction extends RegulaFalsiXr, BisectionXr, FixedPointXn, NewtonXr,SieczneXr, DokDwieWartosci, DokJednaWartosc, Et{
    public abstract double f(double x);

}
