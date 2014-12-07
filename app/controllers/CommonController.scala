package controllers

import play.api.mvc._

object CommonController extends Controller {

  def settings = Action {
    Ok(views.html.common.option.settings())
  }

  def profile = Action {
    Ok(views.html.common.option.profile())
  }

  def help = Action {
    Ok(views.html.common.option.help())
  }

}