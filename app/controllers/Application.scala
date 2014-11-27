package controllers

import play.api._
import play.api.mvc._
import akka.actor.Actor
import akka.actor.Props
import scala.collection.immutable.Map
import play.api.libs.iteratee.Enumerator
import play.api.data._
import play.api.data.Forms._

object Application extends Controller {

  case class UserData(name: String, age: Int)

  val userForm = Form(
    mapping(
      "name" -> text,
      "age" -> number)(UserData.apply)(UserData.unapply)
      verifying ("Failed form constraints", fields => fields match {
        case userData => validate(userData.name, userData.age).isDefined
      }))

  def validate(name: String, age: Int) = {
    name match {
      case "bob" if age >= 18 =>
        Some(UserData(name, age))
      case "admin" =>
        Some(UserData(name, age))
      case _ =>
        None
    }
  }

  val SESSION_KEY = "SESSION_KEY"

  def index = Action {
    //    Result(
    //        header = ResponseHeader(200, Map(CONTENT_TYPE -> "text/plain")),
    //        body = Enumerator("Hello world!".getBytes())
    //        )
    Ok(views.html.index("Your new application is ready."))
  }

  def setCookie(name: String) = Action {
    print("session save.")
    Ok(<message>{ String.format("Hello %s", name) }</message>).as(XML).withSession(
      SESSION_KEY -> name)
  }

  def getCookie() = Action { request =>
    request.session.get(SESSION_KEY).map { user =>
      Ok("Hello " + user)
    }.getOrElse {
      Unauthorized("Oops, you are not message")
    }
  }

  def delCookie() = Action {
    print("session all del.")
    Ok("del session").withNewSession
  }

  def helloBob = Action {
    Redirect(("Bob"))
  }

}