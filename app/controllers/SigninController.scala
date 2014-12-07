package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import forms.SigninForm

object SigninController extends Controller {

  def signin() = Action { implicit request =>
    val form = SigninForm.userForm.bindFromRequest
    if (form.hasErrors) {
      for (err <- form.errors) {
        println(err)
      }
    }
    var data = form.data
    println("data", data)
    println("email", data.get("email"))
    Ok(views.html.dashboard.index())
  }

}