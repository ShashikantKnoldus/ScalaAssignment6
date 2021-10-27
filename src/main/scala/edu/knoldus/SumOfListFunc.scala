package edu.knoldus
trait Func[a,b]{
  def apply(num1:a):b
}
class SumOfListFunc{
  val sumOfList:Func[List[Int],Int]=new Func[List[Int],Int] {
    override def apply(num1: List[Int]): Int = num1.sum
  }

}




