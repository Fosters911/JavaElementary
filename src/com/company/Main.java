package com.company;

public class Main {

}

class MyException extends Exception{
    private String detail;
    MyException(String a){
        detail = a;
    }

    @Override
    public String toString() {
        return "MyException["+detail+"]";
    }
}
