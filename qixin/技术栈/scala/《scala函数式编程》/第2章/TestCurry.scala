
/**
  * 练习2.3 p22
  * def curry[A, B, C](f: (A, B) => C) : A => (B => C) 编译通过
  */
object TestCurry {
  // => 是右结合 (a: A) => ((b: B) => f(a: A, b: B)) 等同于 (a: A) => (b: B) => f(a: A, b: B)
  def curry[A, B, C](f: (A, B) => C): A => (B => C) = a => b => f(a, b)
}