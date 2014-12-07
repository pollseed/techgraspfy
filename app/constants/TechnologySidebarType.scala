package constants

object TechnologySidebarType {
  case object NONE extends TechnologySidebarType(0)
  case object OVERVIEW extends TechnologySidebarType(10)
  case object CARD extends TechnologySidebarType(20)
  case object ANALYTICS extends TechnologySidebarType(30)
  case object CSV extends TechnologySidebarType(40)
  case object TECHNOLOGY extends TechnologySidebarType(50)

  val values = Array(OVERVIEW, CARD, ANALYTICS, CSV)

  private val codeTable = Array(OVERVIEW, CARD, ANALYTICS, CSV)

  def typeCode(code: Int): TechnologySidebarType = codeTable(code)
}

sealed abstract class TechnologySidebarType(val code: Int) {
  val name = toString

  def typeCode = TechnologySidebarType.codeTable(code)
}