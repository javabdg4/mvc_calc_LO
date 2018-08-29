package com.sda.calculator.model;

import java.math.BigInteger;

public class Model {

    //wpisana wartosc jest wymnazana przez 1 nastepnie przez sama siebie
    private static final String INITIAL_VALUE = "1";

    private BigInteger total;

    public Model(){
        reset();
    }

    public void reset() {
        total = new BigInteger(INITIAL_VALUE);
    }

    public void multiply(String value){
        total = total.multiply(new BigInteger(value));
    }

    public void setValue(String value){
        total = new BigInteger(value);
    }

    public String getValue(){
        return total.toString();
    }

}
