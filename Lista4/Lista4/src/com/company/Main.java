package com.company;

public class Main {

    public static void main(String[] args) {

        //RegulaFalsi regulaFalsi = new RegulaFalsi((x) -> Math.exp(-x) - x);
        //regulaFalsi.solver(0.03, 0.07, 0.01, 50);
        //zamiast interfejsu scalarfunction użyjemy lambdę

        //RegulaFalsi regulaFalsi = new RegulaFalsi(new TestFunction());
        //regulaFalsi.solver(0.5, 0.6, 0.01, 50);
        //zrobione tradycyjnie
/*
        RegulaFalsi regulaFalsi2 = new RegulaFalsi(new ScalarFunction() {
            @Override
            public double f(double x) {
                return Math.exp(-x)-x;
            }
        }
    }*/

        RegulaFalsi regulaFalsi = new RegulaFalsi(new TestFunction());
        regulaFalsi.solver(0.5, 1.2, 0.01, 50);

        Bisection bisection = new Bisection(new TestFunction());
        bisection.solver(0.5, 0.9, 0.01, 50);

        FixedPiont fixedPiont = new FixedPiont(new TestFunction());
        fixedPiont.solver(0.3,  0.01, 50);

        Newton newton = new Newton(new TestFunction());
        newton.solver(0.3, 0.01, 50);

        Sieczne sieczne = new Sieczne(new TestFunction());
        sieczne.solver(0.9, 0.6, 0.01, 50);
    }
}