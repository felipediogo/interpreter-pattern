package com.mrholeechit;

/**
 * Created by felipediogo on 29/09/17.
 */
public interface Interpreter<T>{
    String interpret(T context);
}
