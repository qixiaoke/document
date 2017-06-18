
object TestVar {

  def mean(xs: Seq[Double]): Option[Double] = {
    if (xs.isEmpty) None
    else Some(xs.sum / xs.length)
  }

  /**
    * 练习4.2
    * 求方差
    * mean(xs).flatMap的写法很牛逼
    * @param xs
    * @return
    */
  def variance(xs: Seq[Double]): Option[Double] = {
    mean(xs).flatMap(m => mean(xs.map(x => math.pow(x - m, 2))))
  }

  /**
    * 提升函数为对可选值进行操作的函数
    * @param a
    * @param b
    * @param f
    * @tparam A
    * @tparam B
    * @tparam C
    * @return
    */
  def map2[A, B, C](a: Option[A], b: Option[B])(f: (A, B) => C) : Option[C] = {
//    (a, b) match {
//      case (None, None) => None
//      case (_, _) => Some(f(a, b))
//    }

    //本来是(A, B)=>C, 可以转为A=>C, C由中间B和A推出
    a.flatMap(aa => b.map(bb => f(aa, bb)))
  }

  /**
    * 练习4.4
    * List[Option[A]转Option[List[A]]
    * 看不懂。。。。。。。。。。。。。。。。
    * @param a
    * @tparam A
    * @return
    */
  def sequence[A](a: List[Option[A]]): Option[List[A]] = {
    a match {
      case Nil => Some(Nil)
      case h :: t => h.flatMap(hh => sequence(t).map(hh :: _))
    }
  }

  def main(args: Array[String]): Unit = {
    val list : List[Double] = List(1,2)
    println("mean" + mean(list))
    println("variance" + variance(list))
  }
}