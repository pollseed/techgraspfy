package controllers

import play.api.mvc._

object CommonController extends Controller {

  /**
   * 設定を表示します
   */
  def settings = Action {
    Ok(views.html.common.option.settings())
  }

  /**
   * プロフィールを表示します
   */
  def profile = Action {
    Ok(views.html.common.option.profile())
  }

  /**
   * ヘルプを表示します
   */
  def help = Action {
    Ok(views.html.common.option.help())
  }

}