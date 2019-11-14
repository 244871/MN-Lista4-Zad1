package com.company;

public class Wyniki2 {
    int iteracja;
    double x;
    double wynik;
    double dokladnosc;
    double xr;
    double wynikr;
    double bladt_xr;
    double blada_xr;

    public Wyniki2(int iteracja, double x, double wynik, double dokladnosc, double xr, double wynikr, double bladt_xr, double blada_xr) {
        this.iteracja = iteracja;
        this.x = x;
        this.wynik = wynik;
        this.dokladnosc = dokladnosc;
        this.xr = xr;
        this.wynikr = wynikr;
        this.bladt_xr = bladt_xr;
        this.blada_xr = blada_xr;
    }

    @Override
    public String toString() {
        return "\n" +
                "iteracja=" + iteracja +
                ", x=" + x +
                ", f(x)=" + wynik +
                ", dokladnosc=" + dokladnosc +
                ", xr=" + xr +
                ", f(xr)=" + wynikr+
                ", Et=" + bladt_xr +
                ", Ea=" + blada_xr;
    }
}
