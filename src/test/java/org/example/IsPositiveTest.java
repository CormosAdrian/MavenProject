package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsPositiveTest {
    @BeforeEach
    public void beforEachMethod(){
        System.out.println("Before Each ");
    }
    @BeforeAll
     public static void beforAll() {
        System.out.println("Befor All ");
    }
   // @Disabled("Thist test must be skipped")
    @Test
    public void checkIsPositiveFalse() {
        IsPositive number = new IsPositive();
        //number.isPositive(3);
        boolean result = number.isPositive(-3);
        Assertions.assertFalse(result);
    }
    @Test
    public void checkIsPositiveTrue() {
        IsPositive number = new IsPositive();
        //number.isPositive(3);
        boolean result = number.isPositive(3);
        Assertions.assertTrue(result);
    }
        @ParameterizedTest
        @ValueSource(ints = {1,0,13,17,256,Integer.MAX_VALUE})
        public void checkIsPositiveTrueParametrized(int number){
        IsPositive result=new IsPositive();
        Assertions.assertTrue(result.isPositive(number));
        }
    @ParameterizedTest
    @ValueSource(ints = {-2,-4-20,-100,Integer.MIN_VALUE})
    public void checkIsPositiveFalseParametrized(int number){
        IsPositive result=new IsPositive();
        Assertions.assertFalse(result.isPositive(number));
    }



   // @AfterEach
    //public void afterEach(){
      //  System.out.println("After Each");
    //}
    @AfterEach
    public void afterEachMethod() {
        System.out.println("After Each Method");
    }
    @AfterAll
    public static void afterAllMethod() {
       System.out.println("After All Method");
    }
}