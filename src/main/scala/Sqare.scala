

object Sqare {

    def isSquare(x: Int): Boolean = {
      if( x == 0) true
      else {
        val divisors = Seq.range(1,x/2+1)
        if(divisors.exists(elem => (elem*elem).equals(x))) true
        else
          false
      }
    }

  def main(args: Array[String]): Unit = {
    print(isSquare(4))
  }

}