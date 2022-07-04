package com.memetto.myfirstlibrary;

public class FirstLib {
    public FirstLib(int val) {
        this.val = val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    private int val;

    public int multiply (int v){
        return v * val;
    }
}
