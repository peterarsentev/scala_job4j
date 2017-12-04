package ru.job4j

import org.scalatest.{FlatSpec, Matchers}

/**
  * @author Petr Arsentev (parsentev@yandex.ru)
  * @version $Id$
  * @since 0.1
  */
class CalculatorTest extends FlatSpec with Matchers {

  "Calculate 1 + 1" should "2" in {
    val calc = new Calculator
    calc.add(1, 1)
    calc.getResult() should be (2)
  }

  "Calculate 1 * 1" should "1" in {
    val calc = new Calculator
    calc.multiple(1, 1)
    calc.getResult() should be (1)
  }

  "Calculate 1 - 1" should "0" in {
    val calc = new Calculator
    calc.subtract(1, 1)
    calc.getResult() should be (0)
  }

  "Calculate 1 / 1" should "1" in {
    val calc = new Calculator
    calc.div(1, 1)
    calc.getResult() should be (1)
  }
}
