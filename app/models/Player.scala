package models
import play.api.libs.json._

/**
  * Created by avraammavridis on 05/01/17.
  */
class Player(var first_name: String,
             var last_name: String,
             var position: String,
             var picture: String,
             var team: String,
             var value: Double){

  /*
   * Returns the full name of the player
   */
  def getFullName(): String ={
    return first_name + ' ' + last_name;
  }
};

object Player{
  var players: List[Player] = List(
    new Player("Avraam", "Mavridis", "goalkeeper", " ", "PAOK", 1.2),
    new Player("Something", "Mavridis", "goalkeeper", " ", "PAOK", 5.2),
    new Player("Cool", "Mavridis", "goalkeeper", " ", "PAOK", 3.2),
    new Player("Anything", "Mavridis", "goalkeeper", " ", "PAOK", 5.2)
  );

  implicit val playerWrites = new Writes[Player] {
    override def writes(player: Player) = Json.obj(
      "full_name" -> player.getFullName(),
      "first_name" -> player.first_name,
      "last_name" -> player.last_name,
      "position" -> player.position,
      "team" -> player.team,
      "value" -> player.value
    )
  }

  def index = players.map(_.getFullName);
}