package com.daromi.cascade.core.math

def factorial1(n: Int): Int =
  require(n >= 0, "n must be non-negative")

  if n == 0 || n == 1 then 1
  else n * factorial1(n - 1)

def fibonacci1(n: Int): Int =
  require(n >= 0, "n must be non-negative")

  if n == 0 then 0
  else if n == 1 then 1
  else fibonacci1(n - 1) + fibonacci1(n - 2)
