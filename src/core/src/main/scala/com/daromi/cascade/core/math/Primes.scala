package com.daromi.cascade.core.math

import scala.annotation.tailrec

def isPrime1(n: Long): Boolean =
  require(n > 1L, "n must be greater than 1")

  if n == 2L || n == 3L then true
  else
    val limit = math.sqrt(n).toLong

    @tailrec
    def helper(divisor: Long): Boolean =
      if divisor > limit then true
      else if n % divisor == 0L then false
      else helper(divisor + 1L)

    helper(2L)
