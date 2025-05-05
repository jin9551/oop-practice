package org.example.operators;

public class DivisionOperator implements NewArithematicOperator {
    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {
//        if (operand2.toInt() == 0) {
//            throw new IllegalArgumentException("Division by zero is not allowed.");
//        }
        return operand1.toInt() / operand2.toInt();
    }
}
