package com.company;

public class Wyniki2 {
    int iteracja;
    double xn;
    double fx;
    double bladt;
    double dokladnosc;

    public Wyniki2(int iteracja, double xn, double fx, double bladt, double dokladnosc) {
        this.iteracja = iteracja;
        this.xn = xn;
        this.fx = fx;
        this.bladt = bladt;
        this.dokladnosc = dokladnosc;
    }

    @Override
    public String toString() {
        return "\n" +
                "iteracja=" + iteracja +
                ", xn=" + xn +
                ", fx=" + fx +
                ", bladt=" + bladt +
                ", dokladnosc=" + dokladnosc +
                '}';
    }
}
