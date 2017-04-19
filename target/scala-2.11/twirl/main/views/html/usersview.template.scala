
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object usersview_Scope0 {
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

     object usersview_Scope1 {
import helper._

class usersview extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(users: List[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.59*/("""
"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Manage users", user)/*4.28*/ {_display_(Seq[Any](format.raw/*4.30*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="container">


          <div class="col-sm-10">

              """),_display_(/*11.16*/if(flash.containsKey("success"))/*11.48*/ {_display_(Seq[Any](format.raw/*11.50*/("""
                  """),format.raw/*12.19*/("""<div class="alert alert-success">
                  """),_display_(/*13.20*/flash/*13.25*/.get("success")),format.raw/*13.40*/("""
                  """),format.raw/*14.19*/("""</div>
              """)))}),format.raw/*15.16*/("""
              """),format.raw/*16.15*/("""<table class="table table-bordered table-hover table-condensed">
              <thead>
              <!-- The header row-->
              <tr>
                  <th>Role</th>
                  <th>Email</th>
                <th>Name</th>
                <th>Surname</th>
                  <th>Advance to Admin</th>
                  <th>Delete</th>

              </tr>
              </thead>
              <tbody>

                <!-- Movie row(s) -->
                        <!-- Start of For loop - For each m in movies add a row -->

              """),_display_(/*34.16*/for(u <- users) yield /*34.31*/ {_display_(Seq[Any](format.raw/*34.33*/("""

                  """),format.raw/*36.19*/("""<tr>
                      <td>"""),_display_(/*37.28*/u/*37.29*/.getRole),format.raw/*37.37*/("""</td>
                      <td>"""),_display_(/*38.28*/u/*38.29*/.getEmail),format.raw/*38.38*/("""</td>
                      <td>"""),_display_(/*39.28*/u/*39.29*/.getName),format.raw/*39.37*/("""</td>
                      <td>"""),_display_(/*40.28*/u/*40.29*/.getSurname),format.raw/*40.40*/("""</td>
                      <td>
                          <a href=""""),_display_(/*42.37*/routes/*42.43*/.LoginController.setAdmin(u.getEmail)),format.raw/*42.80*/("""" >
                              <span class="glyphicon glyphicon-arrow-up"></span>
                          </a>
                      </td>
                      <td>
                          <a href=""""),_display_(/*47.37*/routes/*47.43*/.HomeController.deleteUser(u.getEmail)),format.raw/*47.81*/(""""
                          onclick="return confirmDel();">
                              <span class="glyphicon glyphicon-trash"></span>
                          </a>
                      </td>
                  </tr>


                  """)))}),format.raw/*55.20*/(""" """),format.raw/*55.21*/("""<!-- End of For loop -->
              </tbody>
            </table>
          </div>
      </div>

    <script>
            // JavaScript function returns true if user clicks yes, otherwise, false
            function confirmDel() """),format.raw/*63.35*/("""{"""),format.raw/*63.36*/("""
                """),format.raw/*64.17*/("""return confirm('Are you sure?');
            """),format.raw/*65.13*/("""}"""),format.raw/*65.14*/("""
    """),format.raw/*66.5*/("""</script>
  <!-- End of content for main -->

""")))}),format.raw/*69.2*/("""
"""))
      }
    }
  }

  def render(users:List[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(users,user)

  def f:((List[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (users,user) => apply(users,user)

  def ref: this.type = this

}


}
}

/**/
object usersview extends usersview_Scope0.usersview_Scope1.usersview
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 19:49:32 IST 2017
                  SOURCE: /home/wdd/Desktop/seconyearproject/app/views/usersview.scala.html
                  HASH: 3e77b76e54fa3d9a2dcd98f7465171ec1bac14e3
                  MATRIX: 836->18|988->75|1015->76|1075->109|1103->110|1149->129|1177->130|1205->131|1252->153|1286->179|1325->181|1354->184|1500->303|1541->335|1581->337|1628->356|1708->409|1722->414|1758->429|1805->448|1858->470|1901->485|2482->1039|2513->1054|2553->1056|2601->1076|2660->1108|2670->1109|2699->1117|2759->1150|2769->1151|2799->1160|2859->1193|2869->1194|2898->1202|2958->1235|2968->1236|3000->1247|3096->1316|3111->1322|3169->1359|3403->1566|3418->1572|3477->1610|3750->1852|3779->1853|4039->2085|4068->2086|4113->2103|4186->2148|4215->2149|4247->2154|4324->2201
                  LINES: 30->2|35->2|36->3|36->3|36->3|36->3|36->3|36->3|37->4|37->4|37->4|38->5|44->11|44->11|44->11|45->12|46->13|46->13|46->13|47->14|48->15|49->16|67->34|67->34|67->34|69->36|70->37|70->37|70->37|71->38|71->38|71->38|72->39|72->39|72->39|73->40|73->40|73->40|75->42|75->42|75->42|80->47|80->47|80->47|88->55|88->55|96->63|96->63|97->64|98->65|98->65|99->66|102->69
                  -- GENERATED --
              */
          