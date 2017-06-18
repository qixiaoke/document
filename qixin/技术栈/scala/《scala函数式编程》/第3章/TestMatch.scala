
object TestMatch {
  /**
    * 练习3.2
    * 删除第一个元素
    * @param x
    * @tparam A
    * @return
    */
  def deleteFirstNumber[A](x : List[A]) : List[A] = {
    x match {
      case Nil => Nil
      case Cons(_, t) => t
    }
  }

  /**
    * 练习3.3
    * 替换第一个元素
    * @param x
    * @param y
    * @tparam A
    * @return
    */
  def replaceFirstWord[A](x: List[A], y: A) : List[A] = {
    x match {
      case Nil => Nil
      case Cons(_, h) => Cons(y, h)
    }
  }

  /**
    * 联系3.4
    * 删除前n个元素
    * @param l
    * @param n
    * @tparam A
    * @return
    */
  def drop[A](l: List[A], n: Int) : List[A] = {
//    n match {
//      case 0 => l
//      case _ => l match {
//        case Nil => Nil
//        case Cons(_, h) => drop(h, n-1)
//      }
//    }
    //换成下面这种写法
    (l,n) match {
      case (_, 0) => l
      case (Nil, _) => Nil
      case (Cons(_, t), _) => drop(t, n-1)
    }
  }

  /**
    * 练习3.6
    * 返回除了最后一个元素外的所有元素的列表
    * 重点注意这种思想
    * @param l
    * @return
    */
  def init[A](l: List[A]): List[A] = {
      l match {
        case Nil => Nil
        case Cons(_, Nil) => Nil
        case Cons(h, t) => Cons(h, init(t))
      }
  }

  def main(args: Array[String]): Unit = {
    //List.scala 模式匹配
    println(List.x)
    //List.scala 删除第一个元素
    println(deleteFirstNumber(List(1,2,3,4,5)))
    println(replaceFirstWord(List(1,2,3,4,5),6))
    println(drop(List(1,2,3,4,5), 3))
    println(init(List(1,2,3,4,5)))
  }
}