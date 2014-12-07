package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.UserModel
import forms.SigninForm

object TopController extends Controller {

  def index = Action {
    Ok(views.html.top.index(SigninForm.userForm))
  }

}