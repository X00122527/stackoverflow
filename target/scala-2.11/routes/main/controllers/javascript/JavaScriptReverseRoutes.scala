
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/seconyearproject/conf/routes
// @DATE:Tue Apr 18 19:49:31 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:46
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:46
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseMemberController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def giveLike: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MemberController.giveLike",
      """
        function(postId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "givelike/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("postId", postId0)})
        }
      """
    )
  
    // @LINE:18
    def addCommentSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MemberController.addCommentSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addCommentSubmit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:17
    def addPostSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MemberController.addPostSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addPostSubmit"})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def addFoodSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addFoodSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addFoodSubmit"})
        }
      """
    )
  
    // @LINE:15
    def newsfeed: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.newsfeed",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newsfeed"})
        }
      """
    )
  
    // @LINE:40
    def foodsview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.foodsview",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "foodsview"})
        }
      """
    )
  
    // @LINE:25
    def meals: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.meals",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "meals"})
        }
      """
    )
  
    // @LINE:37
    def deleteFood: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteFood",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteFood/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:38
    def generateDiet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.generateDiet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "generateDiet/"})
        }
      """
    )
  
    // @LINE:13
    def editProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.editProfile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editprofile"})
        }
      """
    )
  
    // @LINE:41
    def usersview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.usersview",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usersview"})
        }
      """
    )
  
    // @LINE:36
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteUser",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteUser/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:42
    def addFood: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addFood",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addFood"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.loginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit"})
        }
      """
    )
  
    // @LINE:34
    def editProfileForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.editProfileForm",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "editProfileForm"})
        }
      """
    )
  
    // @LINE:33
    def addUserSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.addUserSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addUserSubmit"})
        }
      """
    )
  
    // @LINE:10
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:23
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:20
    def setAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.setAdmin",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "setAdmin/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:8
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
