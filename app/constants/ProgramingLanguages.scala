package constants

/**
 * プログラミング言語の定数
 */
object ProgramingLanguages {
  case object NONE extends ProgramingLanguages(0, "-")
  case object JAVA extends ProgramingLanguages(5, "Java")
  case object JAVASCRIPT extends ProgramingLanguages(10, "JavaScript")
  case object C extends ProgramingLanguages(20, "C")
  case object C_PLUSPLUS extends ProgramingLanguages(30, "C++")
  case object C_SHARP extends ProgramingLanguages(40, "C#")
  case object OBJECTIVE_C extends ProgramingLanguages(50, "Objective-C")
  case object PERL extends ProgramingLanguages(60, "Perl")
  case object PHP extends ProgramingLanguages(70, "PHP")
  case object PYTHON extends ProgramingLanguages(80, "Python")
  case object RUBY extends ProgramingLanguages(90, "Ruby")
  case object R extends ProgramingLanguages(100, "R")
  case object SCALA extends ProgramingLanguages(110, "Scala")
  case object HASKELL extends ProgramingLanguages(120, "Haskell")

  val values = Array(NONE, JAVA, JAVASCRIPT, C, C_PLUSPLUS, C_SHARP, OBJECTIVE_C, PERL, PHP, PYTHON, RUBY, R, SCALA, HASKELL)

  private val codeTable = Array(JAVA, JAVASCRIPT, C, C_PLUSPLUS, C_SHARP, OBJECTIVE_C, PERL, PHP, PYTHON, RUBY, R, SCALA, HASKELL)

  def typeCode(code: Int): ProgramingLanguages = codeTable(code)
}

sealed abstract class ProgramingLanguages(val code: Int, val value: String) {
  val name = toString

  def typeCode = ProgramingLanguages.codeTable(code)

}