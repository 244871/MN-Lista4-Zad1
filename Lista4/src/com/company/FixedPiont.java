package com.company;

import java.util.ArrayList;

public class FixedPiont {

    private ScalarFunction func;
    public FixedPiont(ScalarFunction func) {
        this.func = func;
    }


    void solver(double xn, double dok, int maxIter){

        //xn - wartość x aktualna
        //xs - wartość x stara

        double xs;
        ArrayList<Wyniki2> wyniki2= new ArrayList<Wyniki2>();
        for (int i = 0; i <=maxIter; i++) {
            xs=xn;
            xn=oblicz(xn)+xn;
            if(dokladnosc(xn, xs)<=dok){
                break;
            }

            wyniki2.add(new Wyniki2(i, xn, oblicz(xn), bladT(oblicz(xn)), dokladnosc(xn, xs)));
        }

        System.out.print(wyniki2.toString());
        System.out.println();
    }
    private double oblicz(double x){ return func.f(x); }
    private double bladT(double wynik){
        return ((Math.sqrt(3)-wynik)*100)/Math.sqrt(3);
    }
    private double dokladnosc(double xn, double xs){
        return (xn-xs)*100/xs;
    }
}
