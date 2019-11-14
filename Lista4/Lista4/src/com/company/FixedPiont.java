package com.company;

import java.util.ArrayList;

public class FixedPiont {

    private ScalarFunction func;
    public FixedPiont(ScalarFunction func) {
        this.func = func;
    }


    void solver(double xl, double dok, int maxIter){

        double xstare=xl;
        ArrayList<Wyniki2> wyniki2= new ArrayList<>();
        for (int i = 0; i <maxIter; i++) {


            wyniki2.add(new Wyniki2(i+1, xl, oblicz(xl), dokladnosc(xl, obliczxr(xl)), obliczxr(xl), oblicz(obliczxr(xl)), bladT(obliczxr(xl)), bladA(obliczxr(xl), xstare)));
            if (oblicz(obliczxr(xl)) * oblicz(xl) < 0) {
                xl = obliczxr(xl);
            } else {
                break;
            }
            xstare=obliczxr(xl);
            if(dokladnosc(xl, obliczxr(xl))<=dok){
                break;
            }
        }

        System.out.println("Fixed Point:");
        System.out.print(wyniki2.toString());
        System.out.println();
    }
    private double oblicz(double x){
        return func.f(x);
    }
    private double bladT(double x){
        return func.bladEt(x);
    }
    private double dokladnosc(double xl, double xr){
        return func.dokJednaWartosc(xl, xr);
    }
    private double obliczxr(double xl){
        return func.fpxn(xl);
    }
    private double bladA( double x, double xstare){
        return ((x-xstare)/(x))*100;
    }
}
