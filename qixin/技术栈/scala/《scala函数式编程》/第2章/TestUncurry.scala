
/**
  * 练习2.4 p22
  * def uncurry[A, B, C](f: A => B => C) : (A, B) => C 编译通过
  */

object TestUncurry {
  def uncurry[A, B, C](f: A => B => C) : (A, B) => C = (a, b) => f(a)(b)
}