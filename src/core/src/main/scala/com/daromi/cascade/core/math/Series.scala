package com.daromi.cascade.core.math

def triangular(n: Long): Long =
  require(n >= 1L, "n must be positive")

  n * (n + 1L) / 2L

def triangular1(n: Long): Long =
  require(n >= 1L, "n must be positive")

  if (n == 1L) 1L
  else n + triangular(n - 1L)
