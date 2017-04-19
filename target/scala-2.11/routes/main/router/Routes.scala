
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/seconyearproject/conf/routes
// @DATE:Tue Apr 18 19:49:31 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:8
  LoginController_4: controllers.LoginController,
  // @LINE:17
  MemberController_5: controllers.MemberController,
  // @LINE:28
  CountController_0: controllers.CountController,
  // @LINE:30
  AsyncController_2: controllers.AsyncController,
  // @LINE:46
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:8
    LoginController_4: controllers.LoginController,
    // @LINE:17
    MemberController_5: controllers.MemberController,
    // @LINE:28
    CountController_0: controllers.CountController,
    // @LINE:30
    AsyncController_2: controllers.AsyncController,
    // @LINE:46
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_1, LoginController_4, MemberController_5, CountController_0, AsyncController_2, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, LoginController_4, MemberController_5, CountController_0, AsyncController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editprofile""", """controllers.HomeController.editProfile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newsfeed""", """controllers.HomeController.newsfeed"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addPostSubmit""", """controllers.MemberController.addPostSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addCommentSubmit/""" + "$" + """id<[^/]+>""", """controllers.MemberController.addCommentSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """givelike/""" + "$" + """postId<[^/]+>""", """controllers.MemberController.giveLike(postId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """setAdmin/""" + "$" + """id<[^/]+>""", """controllers.LoginController.setAdmin(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.LoginController.register"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """meals""", """controllers.HomeController.meals"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUserSubmit""", """controllers.LoginController.addUserSubmit"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editProfileForm""", """controllers.LoginController.editProfileForm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteUser/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteUser(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteFood/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteFood(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """generateDiet/""", """controllers.HomeController.generateDiet"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addFoodSubmit""", """controllers.HomeController.addFoodSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """foodsview""", """controllers.HomeController.foodsview"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usersview""", """controllers.HomeController.usersview"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addFood""", """controllers.HomeController.addFood"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_LoginController_login1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login1_invoker = createInvoker(
    LoginController_4.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_LoginController_loginSubmit2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit2_invoker = createInvoker(
    LoginController_4.loginSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """loginSubmit"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_LoginController_logout3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout3_invoker = createInvoker(
    LoginController_4.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_editProfile4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editprofile")))
  )
  private[this] lazy val controllers_HomeController_editProfile4_invoker = createInvoker(
    HomeController_1.editProfile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "editProfile",
      Nil,
      "GET",
      """""",
      this.prefix + """editprofile"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_newsfeed5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newsfeed")))
  )
  private[this] lazy val controllers_HomeController_newsfeed5_invoker = createInvoker(
    HomeController_1.newsfeed,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "newsfeed",
      Nil,
      "GET",
      """""",
      this.prefix + """newsfeed"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_MemberController_addPostSubmit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addPostSubmit")))
  )
  private[this] lazy val controllers_MemberController_addPostSubmit6_invoker = createInvoker(
    MemberController_5.addPostSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MemberController",
      "addPostSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """addPostSubmit"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_MemberController_addCommentSubmit7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCommentSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MemberController_addCommentSubmit7_invoker = createInvoker(
    MemberController_5.addCommentSubmit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MemberController",
      "addCommentSubmit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """addCommentSubmit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_MemberController_giveLike8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("givelike/"), DynamicPart("postId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MemberController_giveLike8_invoker = createInvoker(
    MemberController_5.giveLike(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MemberController",
      "giveLike",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """givelike/""" + "$" + """postId<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_LoginController_setAdmin9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("setAdmin/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LoginController_setAdmin9_invoker = createInvoker(
    LoginController_4.setAdmin(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "setAdmin",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """setAdmin/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_LoginController_register10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_LoginController_register10_invoker = createInvoker(
    LoginController_4.register,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "register",
      Nil,
      "GET",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_meals11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("meals")))
  )
  private[this] lazy val controllers_HomeController_meals11_invoker = createInvoker(
    HomeController_1.meals,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "meals",
      Nil,
      "GET",
      """""",
      this.prefix + """meals"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_CountController_count12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count12_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_AsyncController_message13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message13_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_LoginController_addUserSubmit14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUserSubmit")))
  )
  private[this] lazy val controllers_LoginController_addUserSubmit14_invoker = createInvoker(
    LoginController_4.addUserSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "addUserSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """addUserSubmit"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_LoginController_editProfileForm15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editProfileForm")))
  )
  private[this] lazy val controllers_LoginController_editProfileForm15_invoker = createInvoker(
    LoginController_4.editProfileForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "editProfileForm",
      Nil,
      "POST",
      """""",
      this.prefix + """editProfileForm"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_HomeController_deleteUser16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteUser/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteUser16_invoker = createInvoker(
    HomeController_1.deleteUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteUser",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """deleteUser/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_HomeController_deleteFood17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteFood/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteFood17_invoker = createInvoker(
    HomeController_1.deleteFood(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteFood",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """deleteFood/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_HomeController_generateDiet18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("generateDiet/")))
  )
  private[this] lazy val controllers_HomeController_generateDiet18_invoker = createInvoker(
    HomeController_1.generateDiet,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "generateDiet",
      Nil,
      "GET",
      """""",
      this.prefix + """generateDiet/"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_HomeController_addFoodSubmit19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addFoodSubmit")))
  )
  private[this] lazy val controllers_HomeController_addFoodSubmit19_invoker = createInvoker(
    HomeController_1.addFoodSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addFoodSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """addFoodSubmit"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_HomeController_foodsview20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("foodsview")))
  )
  private[this] lazy val controllers_HomeController_foodsview20_invoker = createInvoker(
    HomeController_1.foodsview,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "foodsview",
      Nil,
      "GET",
      """""",
      this.prefix + """foodsview"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_HomeController_usersview21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usersview")))
  )
  private[this] lazy val controllers_HomeController_usersview21_invoker = createInvoker(
    HomeController_1.usersview,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "usersview",
      Nil,
      "GET",
      """""",
      this.prefix + """usersview"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_HomeController_addFood22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addFood")))
  )
  private[this] lazy val controllers_HomeController_addFood22_invoker = createInvoker(
    HomeController_1.addFood,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addFood",
      Nil,
      "GET",
      """""",
      this.prefix + """addFood"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Assets_versioned23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned23_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_LoginController_login1_route(params) =>
      call { 
        controllers_LoginController_login1_invoker.call(LoginController_4.login)
      }
  
    // @LINE:9
    case controllers_LoginController_loginSubmit2_route(params) =>
      call { 
        controllers_LoginController_loginSubmit2_invoker.call(LoginController_4.loginSubmit)
      }
  
    // @LINE:10
    case controllers_LoginController_logout3_route(params) =>
      call { 
        controllers_LoginController_logout3_invoker.call(LoginController_4.logout)
      }
  
    // @LINE:13
    case controllers_HomeController_editProfile4_route(params) =>
      call { 
        controllers_HomeController_editProfile4_invoker.call(HomeController_1.editProfile)
      }
  
    // @LINE:15
    case controllers_HomeController_newsfeed5_route(params) =>
      call { 
        controllers_HomeController_newsfeed5_invoker.call(HomeController_1.newsfeed)
      }
  
    // @LINE:17
    case controllers_MemberController_addPostSubmit6_route(params) =>
      call { 
        controllers_MemberController_addPostSubmit6_invoker.call(MemberController_5.addPostSubmit)
      }
  
    // @LINE:18
    case controllers_MemberController_addCommentSubmit7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MemberController_addCommentSubmit7_invoker.call(MemberController_5.addCommentSubmit(id))
      }
  
    // @LINE:19
    case controllers_MemberController_giveLike8_route(params) =>
      call(params.fromPath[Long]("postId", None)) { (postId) =>
        controllers_MemberController_giveLike8_invoker.call(MemberController_5.giveLike(postId))
      }
  
    // @LINE:20
    case controllers_LoginController_setAdmin9_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_LoginController_setAdmin9_invoker.call(LoginController_4.setAdmin(id))
      }
  
    // @LINE:23
    case controllers_LoginController_register10_route(params) =>
      call { 
        controllers_LoginController_register10_invoker.call(LoginController_4.register)
      }
  
    // @LINE:25
    case controllers_HomeController_meals11_route(params) =>
      call { 
        controllers_HomeController_meals11_invoker.call(HomeController_1.meals)
      }
  
    // @LINE:28
    case controllers_CountController_count12_route(params) =>
      call { 
        controllers_CountController_count12_invoker.call(CountController_0.count)
      }
  
    // @LINE:30
    case controllers_AsyncController_message13_route(params) =>
      call { 
        controllers_AsyncController_message13_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:33
    case controllers_LoginController_addUserSubmit14_route(params) =>
      call { 
        controllers_LoginController_addUserSubmit14_invoker.call(LoginController_4.addUserSubmit)
      }
  
    // @LINE:34
    case controllers_LoginController_editProfileForm15_route(params) =>
      call { 
        controllers_LoginController_editProfileForm15_invoker.call(LoginController_4.editProfileForm)
      }
  
    // @LINE:36
    case controllers_HomeController_deleteUser16_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteUser16_invoker.call(HomeController_1.deleteUser(id))
      }
  
    // @LINE:37
    case controllers_HomeController_deleteFood17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteFood17_invoker.call(HomeController_1.deleteFood(id))
      }
  
    // @LINE:38
    case controllers_HomeController_generateDiet18_route(params) =>
      call { 
        controllers_HomeController_generateDiet18_invoker.call(HomeController_1.generateDiet)
      }
  
    // @LINE:39
    case controllers_HomeController_addFoodSubmit19_route(params) =>
      call { 
        controllers_HomeController_addFoodSubmit19_invoker.call(HomeController_1.addFoodSubmit)
      }
  
    // @LINE:40
    case controllers_HomeController_foodsview20_route(params) =>
      call { 
        controllers_HomeController_foodsview20_invoker.call(HomeController_1.foodsview)
      }
  
    // @LINE:41
    case controllers_HomeController_usersview21_route(params) =>
      call { 
        controllers_HomeController_usersview21_invoker.call(HomeController_1.usersview)
      }
  
    // @LINE:42
    case controllers_HomeController_addFood22_route(params) =>
      call { 
        controllers_HomeController_addFood22_invoker.call(HomeController_1.addFood)
      }
  
    // @LINE:46
    case controllers_Assets_versioned23_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned23_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
