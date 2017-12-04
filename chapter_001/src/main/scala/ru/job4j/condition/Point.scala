package ru.job4j.condition

/**
  * //TODO add comments.
  *
  * @author Petr Arsentev (parsentev@yandex.ru)
  * @version $Id$
  * @since 0.1
  */
case class Point(x : Int, y : Int) {
  def distanceTo(that : Point) =
    Math.sqrt(
      Math.pow(that.x - this.x, 2) + Math.pow(this.y - that.y, 2)
    )
}
