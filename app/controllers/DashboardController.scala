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

  /**
   * カードを表示します
   */
  def card() = Action {
    Ok(views.html.dashboard.card())
  }

  /**
   * 分析を表示します
   */
  def analytics() = Action {
    Ok(views.html.dashboard.analytics())
  }

  /**
   * CSV出力を表示します
   */
  def csv() = Action {
    Ok(views.html.dashboard.csv())
  }

  /**
   * 技術登録を表示します
   */
  def technology() = Action {
    Ok(views.html.dashboard.technology())
  }

}