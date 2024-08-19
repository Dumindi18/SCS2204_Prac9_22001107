object StringFormatter {
  def toUpper(str: String): String = {
    str.map { c =>
      if (c >= 'a' && c <= 'z') (c - 32).toChar
      else c
    }
  }

  def toLower(str: String): String = {
    str.map { c =>
      if (c >= 'A' && c <= 'Z') (c + 32).toChar
      else c
    }
  }

  def formatNames(name: String)(formatFunction: String => String): String = formatFunction(name)

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    println(formatNames("Benny")(toUpper))         
    println(formatNames("Niroshan")(name => 
      name.substring(0, 2).toUpperCase + name.substring(2)))  
    println(formatNames("Saman")(toLower))        
    println(formatNames("Kumara")(name => 
      name.substring(0, 1).toUpperCase + name.substring(1, 5) + name.substring(5).toUpperCase))  
  }
}
