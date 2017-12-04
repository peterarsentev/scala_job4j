package ru.job4j.condition

/**
  * //TODO add comments.
  *
  * @author Petr Arsentev (parsentev@yandex.ru)
  * @version $Id$
  * @since 0.1
  */
class Max {
  def max(left : Int, right : Int) = if (left > right) left else right

  def max(first : Int, second : Int, third : Int) : Int =
    this.max(first, this.max(second, third))
}
