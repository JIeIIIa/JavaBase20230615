package com.hillel.lecture10;

public interface AdvanceSolvable extends Solvable {
    String solveIntegral(String expression);

    default String transposeMatrix() {
        return "Default implementation";
    }
}
