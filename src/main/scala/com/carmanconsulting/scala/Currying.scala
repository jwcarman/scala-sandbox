package com.carmanconsulting.scala

/**
 * Here we are "currying" the sum function, by defining it using multiple argument lists.  We can now define other
 * function objects (such as plusOne) by "hard-wiring" the first argument list (notice the _ placeholder for the second
 * argument list).
 */
object Currying {
  def sum(x: Int)(y: Int): Int = x + y

  def main(args: Array[String]): Unit = {
    val plusOne = sum(1)_

    println(plusOne(3))
  }
}
