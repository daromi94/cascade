package com.daromi.cascade.core.math

import scala.annotation.tailrec

def isPrime1(n: Int): Boolean =
  require(n > 1, "n must be greater than 1")

  val limit = math.sqrt(n).toInt

  @tailrec
  def helper(divisor: Int): Boolean =
    if divisor > limit then true
    else if n % divisor == 0 then false
    else helper(divisor + 1)

  helper(2)
