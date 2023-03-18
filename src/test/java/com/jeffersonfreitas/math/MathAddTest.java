package com.jeffersonfreitas.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathAddTest {

  @Test
  public void testMathAdd(){
    final Double a = 10.0;
    final Double b = 10.0;

    final Double result = MathAdd.add(a, b);

    Assertions.assertEquals(result, 10);
  }
  
}
