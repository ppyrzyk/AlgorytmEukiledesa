package com.example.algorytmeukiledesa;

import static com.example.algorytmeukiledesa.AlgorytmEuklidesa.NWD;

public class Main {
    public static void main(String[] args) {

        int result = NWD(80, 88);
        System.out.println("The biggest divider of these numbers is" + " " + result);

        result = NWD(500, 400);
        System.out.println("The biggest divider of these numbers is" + " " + result);

        result = NWD(456738, 228369);
        System.out.println("The biggest divider of these numbers is" + " " + result);
    }
}