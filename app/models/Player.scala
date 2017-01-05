package models

/**
  * Created by avraammavridis on 05/01/17.
  */
class Player(first_name: String, last_name: String, position: String, picture: String, team: String, value: Double){

  /*
   * Returns the full name of the player
   */
  def getFullName(): String ={
    return first_name + ' ' + last_name;
  }
}


object Player{
  var players: List[Player] = List(
    new Player("Avraam", "Mavridis", "goalkeeper", " ", "PAOK", 1.2),
    new Player("Something", "Mavridis", "goalkeeper", " ", "PAOK", 5.2),
    new Player("Cool", "Mavridis", "goalkeeper", " ", "PAOK", 3.2),
    new Player("Anything", "Mavridis", "goalkeeper", " ", "PAOK", 5.2)
  );
}