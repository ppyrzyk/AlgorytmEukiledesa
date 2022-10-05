package com.example.algorytmeukiledesa;

public class AlgorytmEuklidesa {

    public static int NWD(int a, int b) {

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

}
