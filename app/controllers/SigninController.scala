package controllers

import play.api._
import play.api.mvc._
import play.api.data._

object SigninController extends Controller {

  def signin() = Action {
    Ok(views.html.dashboard.index())
  }

}