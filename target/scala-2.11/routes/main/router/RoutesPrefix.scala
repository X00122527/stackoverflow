
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/seconyearproject/conf/routes
// @DATE:Tue Apr 18 19:49:31 IST 2017


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
