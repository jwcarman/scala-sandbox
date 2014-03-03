package com.carmanconsulting.scala

import java.io.{File, PrintWriter}
import java.util.Date

/**
 * Example of the "loan pattern", where the caller "borrows" a resource in order to perform an operation on it.
 */
object LoanPattern {

  def withPrintWriter(file: File)(op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    }
    finally {
      writer.close()
    }
  }

  def main(args: Array[String]) {
    withPrintWriter(new File("test.txt")) {
      _.println(new Date())
    }
  }
}
