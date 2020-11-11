object Kata {

  def alphabetPosition(text: String): String = {
    if(!(text == null || text.isEmpty))
      text.toLowerCase
        .flatMap(char => char.isLetter match {
          case true => Some(char.toInt - 96)
          case false => None
        }).foldLeft(""){(acc,num) => acc.concat(num.toString).concat(" ")}.replaceAll("\\s+$", "")
    else ""
  }

  def main(args: Array[String]): Unit = {
    print(alphabetPosition("abcd9l"))
  }

}