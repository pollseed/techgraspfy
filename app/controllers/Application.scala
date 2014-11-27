package controllers

import play.api._
import play.api.mvc._
import akka.actor.Actor
import akka.actor.Props
import scala.collection.immutable.Map
import play.api.libs.iteratee.Enumerator

object Application extends Controller {

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