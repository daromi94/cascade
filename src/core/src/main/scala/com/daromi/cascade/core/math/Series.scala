package com.daromi.cascade.core.math

def triangular(n: Int): Int =
  require(n >= 1, "n must be positive")

  n * (n + 1) / 2

def triangular1(n: Int): Int =
  require(n >= 1, "n must be positive")

  if n == 1 then 1
  else n + triangular(n - 1)
