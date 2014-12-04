package controllers

import play.api._
import play.api.mvc._
import play.api.data._

object DashboardController extends Controller {

  /**
   * ダッシュボードを表示します.
   */
  def index() = Action {
    Ok(views.html.dashboard.index())
  }

  def card() = Action {
    Ok("")
  }

  def analytics() = Action {
    Ok("")
  }

  def csv() = Action {
    Ok("")
  }

  def technology() = Action {
    Ok("")
  }

}