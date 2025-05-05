package org.example.operators;

public interface NewArithematicOperator {
    boolean supports(String operator);
    int calculate(PositiveNumber operand1, PositiveNumber operand2);


}
