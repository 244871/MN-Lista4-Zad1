package com.company;

import java.util.ArrayList;

public class Sieczne {

    private ScalarFunction func;
    public Sieczne(ScalarFunction func) {
        this.func = func;
    }

    void solver(double xl, double xu, double dok, int maxIter) {
        ArrayList<Wyniki> wyniki = new ArrayList<>();
        double xstare=xl;
        for (int i = 0; i < maxIter; i++) {



            wyniki.add(new Wyniki(i, xl, oblicz(xl), xu, oblicz(xu), dokladnosc(xl, xu), xr(xl, xu), oblicz(xr(xl, xu)), bladT(xr(xl, xu)), bladA(xr(xl, xu), xstare)));

            if (oblicz(xr(xl, xu)) * oblicz(xl) > 0) {
                xl = xr(xl, xu);
            } else {
                xu = xr(xl, xu);
            }
            xstare=xr(xl, xu);
            if (dokladnosc(xl, xu) <= dok) {
                break;
            }
        }

        System.out.println("Bisection:");
        System.out.print(wyniki.toString());
        System.out.println();
    }
    private double oblicz(double x){
        return func.f(x);
    }
    private double bladT(double x) {
        return func.bladEt(x);
    }
    private double dokladnosc(double xl, double xu){
        return func.dokDwieWartosci(xl, xu);
    }
    private double xr(double xl, double xu){
        return func.sxr(xl, xu);
    }
    private double bladA( double x, double xstare){
        return ((x-xstare)/(x))*100;
    }
}
