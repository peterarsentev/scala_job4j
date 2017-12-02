package ru.job4j

import org.scalatest.{FlatSpec, Matchers}

/**
  * @author Petr Arsentev (parsentev@yandex.ru)
  * @version $Id$
  * @since 0.1
  */
class CalculateTest extends FlatSpec with Matchers {

  "Calculate 1 + 1" should "2" in {
    new Calculate().add(1, 1) should be (2)
  }
}
