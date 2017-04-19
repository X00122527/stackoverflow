
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*3.1*/("""

"""),_display_(/*5.2*/main("Login", user)/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
    """),format.raw/*6.5*/("""<div class="form-log-in-with-email">

        <div class="form-white-background">

            <div class="form-title-row">
                <h1>Log in</h1>
                """),_display_(/*12.18*/if(loginForm.hasGlobalErrors)/*12.47*/{_display_(Seq[Any](format.raw/*12.48*/("""
                    """),format.raw/*13.21*/("""<p class="alert alert-warning">
                    """),_display_(/*14.22*/loginForm/*14.31*/.globalError.message),format.raw/*14.51*/("""
                    """),format.raw/*15.21*/("""</p>
                """)))}),format.raw/*16.18*/("""
                """),_display_(/*17.18*/if(flash.containsKey("error"))/*17.48*/{_display_(Seq[Any](format.raw/*17.49*/("""
                    """),format.raw/*18.21*/("""<div class="alert alert-warning">
                    """),_display_(/*19.22*/flash/*19.27*/.get("loginRequired")),format.raw/*19.48*/("""
                    """),format.raw/*20.21*/("""</div>
                """)))}),format.raw/*21.18*/("""

            """),format.raw/*23.13*/("""</div>

            """),_display_(/*25.14*/helper/*25.20*/.form(action = controllers.routes.LoginController.loginSubmit())/*25.84*/{_display_(Seq[Any](format.raw/*25.85*/("""
            """),format.raw/*26.13*/("""<div class="form-row">
                <label>
                            """),_display_(/*28.30*/inputText(loginForm("email"), '_label -> "E-mail", 'class -> "form-control input-xs")),format.raw/*28.115*/("""
                        """),format.raw/*29.25*/("""</label>
            </div>

            <div class="form-row">
                <label>
                            """),format.raw/*34.72*/("""
                            """),_display_(/*35.30*/inputPassword(loginForm("password"), '_label -> "Password", 'class -> "form-control input-xs", 'type -> "password")),format.raw/*35.145*/("""
                        """),format.raw/*36.25*/("""</label>
            </div>

            <div class="form-row">
                <input type ="submit" value="Sign In" class ="btn btn-primary">
            </div>
            
        </div>
""")))}),format.raw/*44.2*/("""
""")))}),format.raw/*45.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 19:49:32 IST 2017
                  SOURCE: /home/wdd/Desktop/seconyearproject/app/views/login.scala.html
                  HASH: 4ef2e9a9062476960b8c97f1e24f025afdfd12cd
                  MATRIX: 781->1|953->63|980->81|1008->84|1035->103|1074->105|1105->110|1305->283|1343->312|1382->313|1431->334|1511->387|1529->396|1570->416|1619->437|1672->459|1717->477|1756->507|1795->508|1844->529|1926->584|1940->589|1982->610|2031->631|2086->655|2128->669|2176->690|2191->696|2264->760|2303->761|2344->774|2447->850|2554->935|2607->960|2751->1119|2808->1149|2945->1264|2998->1289|3220->1481|3252->1483
                  LINES: 27->1|32->1|33->3|35->5|35->5|35->5|36->6|42->12|42->12|42->12|43->13|44->14|44->14|44->14|45->15|46->16|47->17|47->17|47->17|48->18|49->19|49->19|49->19|50->20|51->21|53->23|55->25|55->25|55->25|55->25|56->26|58->28|58->28|59->29|64->34|65->35|65->35|66->36|74->44|75->45
                  -- GENERATED --
              */
          