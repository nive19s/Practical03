object Question03{
    def findMean(num1: Int,num2: Int): Double={
       val average =( num1 + num2 )/2
       average
    }

    def main (args :Array[String]) : Unit = {
        val num1 = 8
        val num2 = 4
        val mean = findMean(num1,num2)
        println(f"Mean of $num1 , $num2 is : $mean%.2f")
    }
}