package org.example;

import org.example.operators.*;

import java.util.List;
public class Calculator {
    /*
    * 사칙연산을 수행하는 연산자 목록
     */
    private static final List<NewArithematicOperator> arithmeticOperators = List.of(
            new AdditionOperator(),
            new SubtractionOperator(),
            new MultiplicationOperator(),
            new DivisionOperator()
    );

    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
        return arithmeticOperators.stream()
                .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                .map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));

        
//        return ArithmeticOperator.calculate(operand1, operator, operand2);

//        if("+".equals(operator)){
//            return operand1 + operand2;
//        } else if ("-".equals(operator)) {
//            return operand1 - operand2;
//        } else if ("*".equals(operator)) {
//            return operand1 * operand2;
//        } else if ("/".equals(operator)) {
//            return operand1 / operand2;
//        }
//        return 0;
    }
}
