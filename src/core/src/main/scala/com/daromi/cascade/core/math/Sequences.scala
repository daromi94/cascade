package com.daromi.cascade.core.math

def factorialNaive(n: Int): Int =
  require(n >= 0, "n must be non-negative")

  if n == 0 || n == 1 then 1
  else n * factorialNaive(n - 1)

def fibonacciNaive(n: Int): Int =
  require(n >= 0, "n must be non-negative")

  if n == 0 then 0
  else if n == 1 then 1
  else fibonacciNaive(n - 1) + fibonacciNaive(n - 2)
