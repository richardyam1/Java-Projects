package com.company;

public class Calculate {

    private int output;

    public Calculate(){
        this.output = 0;
    }

    public int getOutputValue(){
        return this.output;
    }

    public void add(int num){
        this.output += num;
    }

    public void minus(int num){
        this.output -= num;
    }

    public void mult(int num){
        this.output *= num;
    }

    public void div(int num){
        this.output /= num;
    }

    public void resetValue(){
        this.output = 0;
    }
}
