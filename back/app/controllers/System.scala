package controllers

import javax.inject.Inject

import play.api.Logger
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.libs.json._
import play.api.mvc.{Action, Controller}

import scala.concurrent.Future


class System extends Controller {

  def ping = Action {
    Ok("pong")
  }
}
