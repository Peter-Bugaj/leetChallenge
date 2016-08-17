package com.nurun.scala.leet

/**
  * Created by peterbugaj on 2016-08-17.
  */
object Main {

  /**
    * Mappings for leet speak.
    */
  val mappings = Array(
    "[aA]" -> "4",
    "[eE]" -> "3",
    "[iI]" -> "1",
    "[oO]" -> "0",
    "[sS]" -> "5",
    "[tT]" -> "7")

  def main(args: Array[String]) = {

    // Case where no parameters are provided.
    if(args.isEmpty) {
      println("No arguments provided. Exiting.")
      System.exit(0)
    }

    // Otherwise convert to leet speak.
    val result = mappings.foldLeft(args(0)){case (a, (c,n)) => a.replaceAll(c, n)}
    println(result)
  }
}
