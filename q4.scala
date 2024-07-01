object Question04{
    def sumOfEven(numbers: List[Int]):Int={
        numbers.filter(_ % 2 == 0).sum
    }

    def main(args:Array[String]): Unit = {
        val numbers = List(1,2,3,4,5,6)
        val result = sumOfEven(numbers)
        println(s"The sum of even numbers in given List is : $result")
    } 
}
