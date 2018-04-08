
/**
  * 练习2.5 p22
  * 实现一个高阶函数，可以组合两个函数为一个函数
  */
object TestCompose {
  def compose[A, B, C](f: B => C, g: A => B) : A => C = a => f(g(a))
}