

object Kata {

  //iterate only once and use mkstring
  def alphabetPosition(text: String): String = {
    if(!(text == null || text.isEmpty))
      text.flatMap(char => char.toLower.isLetter match {
          case true => Some(char.toInt - 96)
          case false => None
        }).mkString(" ")
    else ""
  }

  // iterate twice : filter, map
  def alphabetPosition2(text: String): String =
    text.filter(_.isLetter).map(_.toLower - 96).mkString(" ")

  def main(args: Array[String]): Unit = {
    print(alphabetPosition("abcd9l"))
  }

}