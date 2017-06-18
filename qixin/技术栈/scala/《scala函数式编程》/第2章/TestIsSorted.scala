
/**
  * 实现isSorted方法，检测Array[A]是否按照给定的比例函数排序
  */

object TestIsSorted {
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean) : Boolean = {
    def loop(n: Int) : Boolean = {
      if(n >= as.length - 1) true
      else if(ordered(as(n), as(n+1))) loop(n+1)
      else false
    }

    loop(0)
  }

  /**
    * 判断函数是否递增
    * @param x 变量1
    * @param y 变量2
    * @return
    */
  def sort(x: Int, y: Int) : Boolean = {
    x <= y
  }

  def main(args: Array[String]): Unit = {
    def param = Array(2,3,4)

    println("是否递增" + isSorted(param, sort))

    println("是否递减" + isSorted(param, (x: Int, y: Int) => x>=y))
  }
}