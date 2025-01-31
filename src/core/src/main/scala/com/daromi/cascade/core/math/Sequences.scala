package com.daromi.cascade.core.math

def factorial1(n: Long): Long =
  require(n >= 0L, "n must be non-negative")

  if n == 0L || n == 1L then 1L
  else n * factorial1(n - 1L)

def fibonacci1(n: Long): Long =
  require(n >= 0L, "n must be non-negative")

  if n == 0L then 0L
  else if n == 1L then 1L
  else fibonacci1(n - 1L) + fibonacci1(n - 2L)
