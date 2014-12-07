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
    Ok(views.html.dashboard.card())
  }

  def analytics() = Action {
    Ok(views.html.dashboard.analytics())
  }

  def csv() = Action {
    Ok(views.html.dashboard.csv())
  }

  def technology() = Action {
    Ok(views.html.dashboard.technology())
  }

}