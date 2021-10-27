package edu.knoldus
trait Func2[a,b,c]{
  def apply(num1:a,num2:b):c
}
class AddFunc {
  val add:Func2[Int,Int,Int]=new Func2[Int,Int,Int] {
    override def apply(num1: Int, num2: Int): Int = num1+num2
  }

}
