package form

import play.api.data._
import play.api.data.Forms._
import models.UserModel

object SigninForm {
  val userForm = Form(
    mapping(
      "id" -> longNumber,
      "name" -> text,
      "email" -> nonEmptyText,
      "password" -> nonEmptyText)(UserModel.apply)(UserModel.unapply)
      verifying ("Failed form constraints", fileld => fileld match {
        case userForm => validate(userForm.id, userForm.name, userForm.email, userForm.password).isDefined
      }))

  def validate(id: Long, name: String, email: String, password: String) = {
    email match {
      case "hoge@gmail.com" if password.equals("admin") =>
        Some(UserModel(id, name, email, password))
      case "fuga@gmail.com" if password equals ("admin") =>
        Some(UserModel(id, name, email, password))
      case _ =>
        None
    }
  }

}