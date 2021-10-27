package edu.knoldus
trait Func3[a,b,c]{
  def apply(f:a,num:b):c
}
class HigherOrderFunc {
  def f(int: Int)=int
  val x:Func3[Int=>Int,Int,Int]=new Func3[Int=>Int,Int,Int] {
    override def apply(f: Int => Int, num: Int): Int = f(num)
  }


}
