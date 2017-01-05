
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/avraammavridis/Documents/pplay/conf/routes
// @DATE:Tue Jan 03 22:21:20 CET 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
