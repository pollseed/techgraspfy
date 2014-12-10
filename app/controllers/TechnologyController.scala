package controllers

import play.api._
import play.api.mvc._
import play.api.data._

object TechnologyController extends Controller {
  
  def index = Action { Redirect(routes.DashboardController technology) }

  /**
   * プログラミング言語を登録します
   */
  def savePrograming() = Action {
    Ok("ok")
  }

}
