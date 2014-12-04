package controllers

import play.api.mvc._

object CommonController extends Controller {

  def settings = Action {
    Ok("settings")
  }

  def profile = Action {
    Ok("profile")
  }

  def help = Action {
    Ok("help")
  }

}