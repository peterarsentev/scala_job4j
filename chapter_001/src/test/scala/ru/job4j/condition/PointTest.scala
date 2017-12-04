package ru.job4j.condition

import org.scalatest.{FlatSpec, Matchers}

/**
  * @author Petr Arsentev (parsentev@yandex.ru)
  * @version $Id$
  * @since 0.1
  */
class PointTest extends FlatSpec with Matchers {

  "point (0, 0) distance to point (0, 2)" should "2" in {
    Point(0, 0).distanceTo(Point(0, 2)) should be (2D)
  }
}
