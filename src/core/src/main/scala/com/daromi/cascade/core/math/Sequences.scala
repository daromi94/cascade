package com.daromi.cascade.core.math

def factorial1(n: Int): Long =
  require(n >= 0, "n must be non-negative")

  if n == 0 || n == 1 then 1L
  else n * factorial1(n - 1)

def fibonacci1(n: Int): Long =
  require(n >= 0, "n must be non-negative")

  if n == 0 then 0L
  else if n == 1 then 1L
  else fibonacci1(n - 1) + fibonacci1(n - 2)
