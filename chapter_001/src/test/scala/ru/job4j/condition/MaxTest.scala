package ru.job4j.condition

import org.scalatest.{FlatSpec, Matchers}

/**
  * @author Petr Arsentev (parsentev@yandex.ru)
  * @version $Id$
  * @since 0.1
  */
class MaxTest extends FlatSpec with Matchers {

  "max from 1 and 2" should "2" in {
    new Max().max(1, 2) should be (2)
  }

  "max from 1, 2, 3" should "3" in {
    new Max().max(1, 2, 3) should be (3)
  }
}
