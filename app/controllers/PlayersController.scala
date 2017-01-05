package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.Player
import play.api.libs.json._

/**
  * Users Controller
  * Created by avraammavridis on 04/01/17.
  */
@Singleton()
class PlayersController extends Controller {

  def index = Action {
    Ok(Json.toJson(Player.players));
  }

}
