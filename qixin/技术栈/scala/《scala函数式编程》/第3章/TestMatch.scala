
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
    * 练习3.5
    * 删除列表中前缀全部符合判定的元素
    * @param l
    * @param f
    * @tparam A
    * @return
    */
  def dropWhile[A](l: List[A], f: A => Boolean) : List[A] = {
    l match {
      case Nil => Nil
      case Cons(h, t) => if (f(h)) dropWhile(t, f) else l
    }
  }

  /**
    * 练习3.5
    * 柯里化dropWhileCurry，作用是可以充分利用类型自动推到，否则dropWhile中f参数类型必须要显示声明A
    * @param l
    * @param f
    * @tparam A
    * @return
    */
  def dropWhileCurry[A](l: List[A])(f: A => Boolean) : List[A] = {
    l match {
      case Nil => Nil
      case Cons(h, t) => if (f(h)) dropWhile(t, f) else l
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
    println("x" + List.x)
    //List.scala 删除第一个元素
    val list : List[Int] = List(1,2,3,4,5)
    println("deleteFirstNumber" + deleteFirstNumber(list))
    println("replaceFirstWord" + replaceFirstWord(list,6))
    println("drop" + drop(list, 3))
    println("init" + init(list))
    println("dropWhile" + dropWhile(list, (x: Int) => x<4))
    println("dropWhile" + dropWhileCurry(list)(x => x<4))
  }
}