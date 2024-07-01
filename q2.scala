object stringSeperate {
    def filterString(strings: List[String]) :List[String]={
        strings.filter(_.length > 5)
    
    }

def main ( args :Array[String]): Unit={
    val inputlist = List("One","Eleven","Three","Twelve")
    val shortedlist=filterString(inputlist)
    println(s"Given String : $inputlist")
    println(s"Strings that have a length greater than 5 : $shortedlist")
}
}