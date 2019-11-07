package com.company;

import java.util.ArrayList;

public class RegulaFalsi {

    private ScalarFunction func;
    public RegulaFalsi(ScalarFunction func) {
        this.func = func;
    }

    void solver(double xl, double xu, double dok, int maxIter){
        ArrayList<Wyniki> wyniki= new ArrayList<Wyniki>();

        for (int i = 0; i <maxIter; i++) {
            if (oblicz(xr(xl, xu)) * oblicz(xl) > 0) {
                xl = xr(xl, xu);
            }
            else {
                xu = xr(xl, xu);
            }

            if(dokladnosc(xl, xu)<=dok){
                break;
            }

            wyniki.add(new Wyniki(i, xl, oblicz(xl), xu, oblicz(xu), bladT(oblicz(xl)),
                    bladT(oblicz(xu)), dokladnosc(xl, xu), xr(xl, xu),
                    oblicz(xr(xl, xu))));
        }

        System.out.print(wyniki.toString());
        System.out.println();
    }
    private double oblicz(double x){ return func.f(x); }
    private double bladT(double wynik){
        return (Math.abs((Math.sqrt(3)-wynik)*100)/Math.sqrt(3)-100);
    }
    private double dokladnosc(double xl, double xu){ return (Math.abs((xl - xu) / xl)) * 100; }
    private double xr(double xl, double xu){
        return func.rfxr(xl, xu);
    }
}

