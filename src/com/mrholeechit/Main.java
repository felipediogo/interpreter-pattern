package com.mrholeechit;

public class Main {

    public static void main(String[] args) {
        assert new DecimalInterpreter().interpret("X").equals("10") :"Should've been 10";
        assert new DecimalInterpreter().interpret("DXXI").equals("521") :"Should've been 521";
        assert new DecimalInterpreter().interpret("DCXLVII").equals("647") :"Should've been 647";


        assert new RomanInterpreter().interpret(123).equals("CXXIII") :"Should've been CXXIII";
        assert new RomanInterpreter().interpret(249).equals("CCXLIX") :"Should've been CCXLIX";
        assert new RomanInterpreter().interpret(742).equals("DCCXLII") :"Should've been DCCXLII";
    }

}
