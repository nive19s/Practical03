object Question01{

    def string_reverse(letter:String) :String= letter match{
        case "" => ""
        case _ => string_reverse(letter.tail)+letter.head
    }

    def main(args: Array[String]) : Unit={
        var s="Nivethan"
        var reversed= string_reverse(s)
        println(s"Original String : $s")
        println(s"Reversed String : $reversed")
    }

}