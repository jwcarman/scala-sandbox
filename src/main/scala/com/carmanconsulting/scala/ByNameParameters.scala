package com.carmanconsulting.scala

/**
 * By using a by-name parameter (the type of the parameter starts with '=>'), we can create something that looks like
 * a built-in control structure, such as ensureThat.
 */
object ByNameParameters {
  def ensureThat(assertion: => Boolean) {
    if(!assertion)
      throw new AssertionError("Assertion failed!")
  }

  def main(args: Array[String]): Unit = {
    ensureThat(5 > 3)
  }
}
