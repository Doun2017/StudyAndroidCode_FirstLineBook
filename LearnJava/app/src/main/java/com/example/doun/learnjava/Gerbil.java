package com.example.doun.learnjava;

/**
 * Created by Doun on 2017/2/12.
 */

public class Gerbil {
    private int gerbilNumber;
    Gerbil(int i) {
        gerbilNumber = i;
    }

    String hop() {
        String msg = "Mouse number " + gerbilNumber;
        msg += " It's hopping!";
        return msg;
    }
}
