package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void checkAdition() {
        Calculator calculator = new Calculator();
        double result=calculator.add(1.00, 22.00);
        Assertions.assertEquals(result, 23.00);
        }
        @Test
        public void multiply(){
            Calculator calculator1 = new Calculator();
            double result=calculator1.multiply(1.00, 23.00);
            Assertions.assertEquals(result,23.00);
            }
        }




