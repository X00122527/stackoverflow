
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
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

     object register_Scope1 {
import helper._

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(addUserForm: Form[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.65*/("""
"""),_display_(/*3.2*/main("Register", user)/*3.24*/{_display_(Seq[Any](format.raw/*3.25*/("""
    """),format.raw/*4.5*/("""<div class="well">
    <div class="form-title-row">
        <h1>Sign Up</h1>

    """),_display_(/*8.6*/if(flash.containsKey("success"))/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""
            """),format.raw/*9.13*/("""<div class="alert alert-success">
            """),_display_(/*10.14*/flash/*10.19*/.get("success")),format.raw/*10.34*/("""
            """),format.raw/*11.13*/("""</div>
        """)))}),format.raw/*12.10*/("""
        """),_display_(/*13.10*/if(flash.containsKey("fail"))/*13.39*/ {_display_(Seq[Any](format.raw/*13.41*/("""
            """),format.raw/*14.13*/("""<div class="alert alert-danger">
            """),_display_(/*15.14*/flash/*15.19*/.get("fail")),format.raw/*15.31*/("""
            """),format.raw/*16.13*/("""</div>
        """)))}),format.raw/*17.10*/("""

    """),format.raw/*19.5*/("""</div>
    """),_display_(/*20.6*/form(action = routes.LoginController.addUserSubmit, 'class -> "form-horizontal", 'role->"form")/*20.101*/ {_display_(Seq[Any](format.raw/*20.103*/("""

        """),format.raw/*22.9*/("""<div class="form-row">
            <label>
                """),_display_(/*24.18*/inputText(addUserForm("name"), '_label -> "First Name",'class -> "form-control")),format.raw/*24.98*/("""
            """),format.raw/*25.13*/("""</label>
        </div>


         <div class="form-row">
            <label>
                """),_display_(/*31.18*/inputText(addUserForm("surname"), '_label -> "Surname",'class -> "form-control")),format.raw/*31.98*/("""
            """),format.raw/*32.13*/("""</label>
        </div>

        <div class="form-row">
            <label>
                """),_display_(/*37.18*/inputText(addUserForm("email"), '_label -> "E-mail",'class -> "form-control")),format.raw/*37.95*/("""
            """),format.raw/*38.13*/("""</label>
        </div>

    <div class="form-row">
        <label>
            """),_display_(/*43.14*/inputText(addUserForm("password"), '_label -> "Password",'class -> "form-control", 'type -> "password")),format.raw/*43.117*/("""
                """),format.raw/*44.17*/("""</label>
    </div>







        <div class="actions">
            <input type="submit" value="Save" class="btn btn-primary">
            <a href=""""),_display_(/*55.23*/routes/*55.29*/.HomeController.editProfile()),format.raw/*55.58*/(""""><button class="btn btn-warning">Cancel</button>
            </a>
        </div>

    <p style="text-align:center;">Already have an account? <a href=""""),_display_(/*59.70*/routes/*59.76*/.LoginController.login()),format.raw/*59.100*/(""""> Sign In Here </a>
    </div>
    """)))}),format.raw/*61.6*/("""
""")))}))
      }
    }
  }

  def render(addUserForm:Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addUserForm,user)

  def f:((Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addUserForm,user) => apply(addUserForm,user)

  def ref: this.type = this

}


}
}

/**/
object register extends register_Scope0.register_Scope1.register
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 19:49:32 IST 2017
                  SOURCE: /home/wdd/Desktop/seconyearproject/app/views/register.scala.html
                  HASH: 6938482c0507d26a2f66912d0e209f7902c99d6a
                  MATRIX: 833->18|991->81|1018->83|1048->105|1086->106|1117->111|1225->194|1265->226|1304->228|1344->241|1418->288|1432->293|1468->308|1509->321|1556->337|1593->347|1631->376|1671->378|1712->391|1785->437|1799->442|1832->454|1873->467|1920->483|1953->489|1991->501|2096->596|2137->598|2174->608|2261->668|2362->748|2403->761|2525->856|2626->936|2667->949|2787->1042|2885->1119|2926->1132|3034->1213|3159->1316|3204->1333|3381->1483|3396->1489|3446->1518|3625->1670|3640->1676|3686->1700|3753->1737
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|41->8|41->8|41->8|42->9|43->10|43->10|43->10|44->11|45->12|46->13|46->13|46->13|47->14|48->15|48->15|48->15|49->16|50->17|52->19|53->20|53->20|53->20|55->22|57->24|57->24|58->25|64->31|64->31|65->32|70->37|70->37|71->38|76->43|76->43|77->44|88->55|88->55|88->55|92->59|92->59|92->59|94->61
                  -- GENERATED --
              */
          