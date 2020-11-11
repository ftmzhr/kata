

object Sqare {

    def isSquare(x: Int): Boolean = {
      math.sqrt(x).isWhole
    }

  def main(args: Array[String]): Unit = {
    print(isSquare(4))
  }

}