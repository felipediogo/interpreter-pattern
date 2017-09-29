package com.mrholeechit;

/**
 * Created by felipediogo on 29/09/17.
 */
public class DecimalInterpreter implements Interpreter<String> {
    @Override
    public String interpret(String context) {
        return "10";
    }
}
