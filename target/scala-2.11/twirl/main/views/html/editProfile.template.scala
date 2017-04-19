
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editProfile_Scope0 {
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

     object editProfile_Scope1 {
import helper._

class editProfile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.User,Form[models.users.Profile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: models.users.User, editProfileForm: Form[models.users.Profile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.72*/("""
"""),_display_(/*4.2*/main("Fill in profile", user)/*4.31*/ {_display_(Seq[Any](format.raw/*4.33*/("""

"""),format.raw/*6.1*/("""<!--include hidden field for profile id-->
<div class="col-sm-4 col-centered">
        <div class="form-white-background">


            """),_display_(/*11.14*/helper/*11.20*/.form(action = controllers.routes.LoginController.editProfileForm())/*11.88*/{_display_(Seq[Any](format.raw/*11.89*/("""


               """),format.raw/*14.16*/("""<div class="well">

                   """),_display_(/*16.21*/inputRadioGroup(
                       editProfileForm("Gender"),
                       options = Seq("male" -> "Male", "female" -> "Female")
                   )),format.raw/*19.21*/("""

               """),format.raw/*21.16*/("""</div>
<div class="well"> 

          """),_display_(/*24.12*/inputText(editProfileForm("dob"), 'class -> "form-control", 'type -> "date")),format.raw/*24.88*/("""

    """),format.raw/*26.5*/("""</div>


<div class="well"> 

            """),_display_(/*31.14*/inputText(editProfileForm("Height"), 'class -> "form-control")),format.raw/*31.76*/("""
    """),format.raw/*32.5*/("""</div>

  
 <div class="well"> 
		<div class="form-group">
      """),_display_(/*37.8*/inputText(editProfileForm("Weight"), 'class -> "form-control")),format.raw/*37.70*/("""
    """),format.raw/*38.5*/("""</div>
</div>
<div class="well">
    """),_display_(/*41.6*/inputRadioGroup(
        editProfileForm("activityLevel"),
        options = Seq("1.2"->"Little - no exercise","1.375"->"Light exercise (1 - 3 days per week)\n", "1.55" -> "Moderate exercise (3 - 5 days per week)",
        "1.725" -> "Heavy Exercise (6 - 7 days per week)", "1.9" -> "Very heavy exercise (twice per day, extra heavy workouts)"),
        '_label -> "Activity Level",
        '_error -> editProfileForm("activityLevel").error.map(_.withMessage("Select activity level")))),format.raw/*46.103*/("""

  
  """),format.raw/*49.3*/("""</div>
  
  <div class="well">

      """),_display_(/*53.8*/inputRadioGroup(
          editProfileForm("primaryGoal"),
          options = Seq("loseWeight" -> "Lose weight", "gainMuscle" -> "Gain muscle", "maintain" -> "Maintain weight"),
          '_label -> "Primary Goal",
          '_error -> editProfileForm("primaryGoal").error.map(_.withMessage("Select primary goal")))),format.raw/*57.101*/("""

      
    """),format.raw/*60.5*/("""</div>

    <div class="well">
        """),_display_(/*63.10*/inputText(editProfileForm("noOfMeal"), 'class -> "form-control")),format.raw/*63.74*/("""
    """),format.raw/*64.5*/("""</div>
    
<div class="form-row">
    <input type="submit" value="Save" class="btn btn-primary">
    <a href=""""),_display_(/*68.15*/routes/*68.21*/.LoginController.editProfileForm()),format.raw/*68.55*/(""""><button class="btn btn-warning">Cancel</button>            </div>
            
</div>
              
  </div>


       
""")))})))}),format.raw/*76.3*/("""

"""))
      }
    }
  }

  def render(user:models.users.User,editProfileForm:Form[models.users.Profile]): play.twirl.api.HtmlFormat.Appendable = apply(user,editProfileForm)

  def f:((models.users.User,Form[models.users.Profile]) => play.twirl.api.HtmlFormat.Appendable) = (user,editProfileForm) => apply(user,editProfileForm)

  def ref: this.type = this

}


}
}

/**/
object editProfile extends editProfile_Scope0.editProfile_Scope1.editProfile
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 19:49:32 IST 2017
                  SOURCE: /home/wdd/Desktop/seconyearproject/app/views/editProfile.scala.html
                  HASH: 60f3e6cdacc546574ce8ba6b0172757a6312f24a
                  MATRIX: 845->19|1010->89|1037->91|1074->120|1113->122|1141->124|1306->262|1321->268|1398->336|1437->337|1483->355|1550->395|1735->559|1780->576|1846->615|1943->691|1976->697|2046->740|2129->802|2161->807|2253->873|2336->935|2368->940|2432->978|2938->1462|2972->1469|3037->1508|3375->1824|3415->1837|3482->1877|3567->1941|3599->1946|3738->2058|3753->2064|3808->2098|3965->2222
                  LINES: 30->3|35->3|36->4|36->4|36->4|38->6|43->11|43->11|43->11|43->11|46->14|48->16|51->19|53->21|56->24|56->24|58->26|63->31|63->31|64->32|69->37|69->37|70->38|73->41|78->46|81->49|85->53|89->57|92->60|95->63|95->63|96->64|100->68|100->68|100->68|108->76
                  -- GENERATED --
              */
          