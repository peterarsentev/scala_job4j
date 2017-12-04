package ru.job4j

/**
  * //TODO add comments.
  *
  * @author Petr Arsentev (parsentev@yandex.ru)
  * @version $Id$
  * @since 0.1
  */
class Calculator {

  private var rsl = 0D

  def add(left : Double, right : Double) {
    this.rsl = left + right
  }

  def subtract(left : Double, right : Double) {
    this.rsl = left - right
  }

  def div(left : Double, right : Double) {
    this.rsl = left / right
  }

  def multiple(left : Double, right : Double) {
    this.rsl = left * right
  }

  def getResult() : Double = this.rsl
}
