package com.company;
public class Wyniki {
    int iteracja;
    double xl;
    double wynikl;
    double xu;
    double wyniku;
    double bladt_xl;
    double bladt_xu;
    double dokladnosc;
    double xr;
    double wynikr;
    public Wyniki(int iteracja, double xl, double wynikl, double xu, double
            wyniku, double bladt_xl, double bladt_xu, double dokladnosc, double xr,
                  double wynikr) {
        this.iteracja = iteracja;
        this.xl = xl;
        this.wynikl = wynikl;
        this.xu = xu;
        this.wyniku = wyniku;
        this.bladt_xl = bladt_xl;
        this.bladt_xu = bladt_xu;
        this.dokladnosc = dokladnosc;
        this.xr = xr;
        this.wynikr = wynikr;
    }
    @Override
    public String toString() {
        return "\n" +
                "iteracja=" + iteracja +
                ", xl=" + xl +
                ", wynikl=" + wynikl +
                ", xu=" + xu +
                ", wyniku=" + wyniku +
                ", bladt_xl=" + bladt_xl +
                ", bladt_xu=" + bladt_xu +
                ", dokladnosc=" + dokladnosc +
                ", xr=" + xr +
                ", wynikr=" + wynikr;
    }
}
