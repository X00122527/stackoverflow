
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.57*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
         <meta name="viewport" content="width=device-width, initial-scale=1">
        """),format.raw/*13.62*/("""
        """),format.raw/*14.9*/("""<title>"""),_display_(/*14.17*/title),format.raw/*14.22*/("""</title>
	<link rel="stylesheet" media="screen" href=""""),_display_(/*15.47*/routes/*15.53*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*15.103*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.101*/("""">
	 <link rel="stylesheet" media="screen" href=""""),_display_(/*17.48*/routes/*17.54*/.Assets.versioned("stylesheets/form-login.css")),format.raw/*17.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*18.59*/routes/*18.65*/.Assets.versioned("images/favicon.png")),format.raw/*18.104*/("""">
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*19.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*20.23*/routes/*20.29*/.Assets.versioned("javascripts/loginScript.js")),format.raw/*20.76*/("""" type="text/javascript"></script>
    </head>
    <body>

        <div id="box">

            <div id="container">
                <div id="mySidenav" class="sidenav" style="position:absolute; top:0; left:0;">
                    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
		    """),_display_(/*29.8*/if(user != null)/*29.24*/{_display_(Seq[Any](format.raw/*29.25*/("""<a href="">Hello """),_display_(/*29.43*/user/*29.47*/.getName),format.raw/*29.55*/("""</a>""")))}),format.raw/*29.60*/("""
                    """),format.raw/*30.21*/("""<a href=""""),_display_(/*30.31*/routes/*30.37*/.HomeController.newsfeed()),format.raw/*30.63*/("""">Newsfeed</a>
                    <a href=""""),_display_(/*31.31*/routes/*31.37*/.HomeController.meals()),format.raw/*31.60*/("""">Meal Plan</a>
                    <a href=""""),_display_(/*32.31*/routes/*32.37*/.HomeController.editProfile()),format.raw/*32.66*/("""">Edit Profile</a>
                 """),format.raw/*42.3*/("""			
		    
                        """),_display_(/*44.26*/if(user != null)/*44.42*/{_display_(Seq[Any](format.raw/*44.43*/("""
                            """),format.raw/*45.29*/("""<a href=""""),_display_(/*45.39*/routes/*45.45*/.LoginController.logout()),format.raw/*45.70*/("""">Logout """),_display_(/*45.80*/user/*45.84*/.getName),format.raw/*45.92*/("""</a>
                        """)))}),format.raw/*46.26*/("""

                """),format.raw/*48.17*/("""</div>

                <span style="font-size:30px;cursor:pointer;position:absolute; top:0; left:0;" onclick="openNav()">&#9776;</span>

                <!-- dividerrrrrrrrrrrrrr !-->


                <div class="loginregister">
                    <ul class="nav navbar-nav navbar-right" style="float: left;">
					    <li """),_display_(/*57.15*/if(title == "Register")/*57.38*/{_display_(Seq[Any](format.raw/*57.39*/("""class="active"""")))}),format.raw/*57.54*/("""><a href=""""),_display_(/*57.65*/routes/*57.71*/.LoginController.register()),format.raw/*57.98*/("""">Register</a></li>
		"""),_display_(/*58.4*/if(user == null)/*58.20*/{_display_(Seq[Any](format.raw/*58.21*/("""
"""),format.raw/*59.1*/("""<li """),_display_(/*59.6*/if(title == "Login")/*59.26*/{_display_(Seq[Any](format.raw/*59.27*/("""class="active"""")))}),format.raw/*59.42*/(""">
                            <a href=""""),_display_(/*60.39*/routes/*60.45*/.LoginController.login()),format.raw/*60.69*/("""">Log in  <span class="glyphicon glyphicon-user"></span></a>
                        """)))}),format.raw/*61.26*/("""
                    """),format.raw/*62.21*/("""</li>
				</ul>
		</div>



                <div id="content">
                    """),_display_(/*69.22*/content),format.raw/*69.29*/("""


                """),format.raw/*72.17*/("""</div>

                <div id="footer">

                </div>
            </div>
        </div>
        """),format.raw/*80.32*/("""
        """),format.raw/*81.9*/("""<script>
            function openNav() """),format.raw/*82.32*/("""{"""),format.raw/*82.33*/("""
                """),format.raw/*83.17*/("""document.getElementById("mySidenav").style.width = "250px";
            """),format.raw/*84.13*/("""}"""),format.raw/*84.14*/("""

            """),format.raw/*86.13*/("""function closeNav() """),format.raw/*86.33*/("""{"""),format.raw/*86.34*/("""
                """),format.raw/*87.17*/("""document.getElementById("mySidenav").style.width = "0";
            """),format.raw/*88.13*/("""}"""),format.raw/*88.14*/("""
    """),format.raw/*89.5*/("""</script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 19:49:32 IST 2017
                  SOURCE: /home/wdd/Desktop/seconyearproject/app/views/main.scala.html
                  HASH: c169e71d6a436df374d0d7df903f52a5b9092dbb
                  MATRIX: 1020->260|1170->315|1198->317|1356->500|1392->509|1427->517|1453->522|1535->577|1550->583|1622->633|1705->689|1720->695|1783->736|1860->786|1875->792|1944->839|2032->900|2047->906|2108->945|2160->970|2175->976|2237->1017|2321->1074|2336->1080|2404->1127|2747->1444|2772->1460|2811->1461|2856->1479|2869->1483|2898->1491|2934->1496|2983->1517|3020->1527|3035->1533|3082->1559|3154->1604|3169->1610|3213->1633|3286->1679|3301->1685|3351->1714|3414->2223|3477->2259|3502->2275|3541->2276|3598->2305|3635->2315|3650->2321|3696->2346|3733->2356|3746->2360|3775->2368|3836->2398|3882->2416|4236->2743|4268->2766|4307->2767|4353->2782|4391->2793|4406->2799|4454->2826|4503->2849|4528->2865|4567->2866|4595->2867|4626->2872|4655->2892|4694->2893|4740->2908|4807->2948|4822->2954|4867->2978|4984->3064|5033->3085|5144->3169|5172->3176|5219->3195|5355->3393|5391->3402|5459->3442|5488->3443|5533->3460|5633->3532|5662->3533|5704->3547|5752->3567|5781->3568|5826->3585|5922->3653|5951->3654|5983->3659
                  LINES: 32->7|37->7|39->9|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|59->29|59->29|59->29|59->29|59->29|59->29|59->29|60->30|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->42|65->44|65->44|65->44|66->45|66->45|66->45|66->45|66->45|66->45|66->45|67->46|69->48|78->57|78->57|78->57|78->57|78->57|78->57|78->57|79->58|79->58|79->58|80->59|80->59|80->59|80->59|80->59|81->60|81->60|81->60|82->61|83->62|90->69|90->69|93->72|100->80|101->81|102->82|102->82|103->83|104->84|104->84|106->86|106->86|106->86|107->87|108->88|108->88|109->89
                  -- GENERATED --
              */
          