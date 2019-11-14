package com.company;

import java.util.ArrayList;

public class RegulaFalsi {

    private ScalarFunction func;
    public RegulaFalsi(ScalarFunction func) {
        this.func = func;
    }

    void solver(double xl, double xu, double dok, int maxIter){
        ArrayList<Wyniki2> wyniki2= new ArrayList<>();
        double xstare=xu;

        for (int i = 0; i <maxIter; i++) {

            wyniki2.add(new Wyniki2(i+1, xu, oblicz(xu), dokladnosc(xl, xu), xr(xl, xu), oblicz(xr(xl, xu)), bladT(xr(xl, xu)), bladA(xr(xl, xu),xstare )));

            if (oblicz(xr(xl, xu)) * oblicz(xl) > 0) {
                xl = xr(xl, xu);
            }
            else {
                xu = xr(xl, xu);
            }
            xstare=xr(xl, xu);

            if(oblicz(xr(xl, xu))*(1+dok)<=oblicz(xu)){
                break;
            }
        }

        System.out.println("Regula Falsi");
        System.out.print(wyniki2.toString());
        System.out.println();
    }
    private double oblicz(double x){
        return func.f(x);
    }
    private double bladT(double x){
        return func.bladEt(x);
    }
    private double dokladnosc(double xl, double xu){
        return func.dokDwieWartosci(xl, xu);
    }
    private double xr(double xl, double xu){
        return func.rfxr(xl, xu);
    }
    private double bladA( double x, double xstare){
        return ((x-xstare)/(x))*100;
    }
}

