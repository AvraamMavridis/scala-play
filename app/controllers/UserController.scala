package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
  * Users Controller
  * Created by avraammavridis on 04/01/17.
  */
@Singleton()
class UsersController extends Controller {

  def index = Action {
    Ok("Here are the users");
  }

}
