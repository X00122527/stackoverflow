
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addFood_Scope0 {
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

     object addFood_Scope1 {
import helper._

class addFood extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Food],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(addFoodForm: play.data.Form[models.Food], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.69*/("""

"""),format.raw/*7.102*/("""

"""),_display_(/*9.2*/main("Add Food", user)/*9.24*/ {_display_(Seq[Any](format.raw/*9.26*/("""
	"""),format.raw/*10.2*/("""<div class="well">
		<h3>Add new food</h3>

		<!-- Use the views.html.helpers package to create the form -->
		"""),_display_(/*14.4*/form(action = routes.HomeController.addFoodSubmit(), 'class -> "form-horizontal", 'role->"form")/*14.100*/ {_display_(Seq[Any](format.raw/*14.102*/("""

			"""),format.raw/*16.4*/("""<!-- Build the form, adding an input for each field -->



			<!-- Note the label parameter -->

			"""),_display_(/*22.5*/inputText(addFoodForm("foodName"), '_label -> "Name",'class -> "form-control")),format.raw/*22.83*/("""
			"""),_display_(/*23.5*/inputText(addFoodForm("kcal"), '_label -> "Kcal",'class -> "form-control")),format.raw/*23.79*/("""
			"""),_display_(/*24.5*/inputText(addFoodForm("protein"), '_label -> "Protein",'class -> "form-control")),format.raw/*24.85*/("""
			"""),_display_(/*25.5*/inputText(addFoodForm("carbs"), '_label -> "Carbs",'class -> "form-control")),format.raw/*25.81*/("""
			"""),_display_(/*26.5*/inputText(addFoodForm("fat"), '_label -> "Fats",'class -> "form-control")),format.raw/*26.78*/("""
			"""),_display_(/*27.5*/inputText(addFoodForm("suitable"), '_label -> "Suitable",'class -> "form-control")),format.raw/*27.87*/("""
			"""),_display_(/*28.5*/select(
				addFoodForm("mainMacro"),
				options(Seq("Protein", "Carbohydrates", "Fat")),
				'_label -> "Main macronutrient", '_default -> "Select main macro"
			)),format.raw/*32.5*/("""

			"""),format.raw/*34.4*/("""<!-- Hidden ID field - required for product updates -->
			"""),_display_(/*35.5*/inputText(addFoodForm("foodId"), '_label -> "", 'hidden -> "hidden")),format.raw/*35.73*/("""

		"""),format.raw/*37.3*/("""<!-- Add a submit button -->
	  <div class="actions">
		  <input type="submit" value="Save" class="btn btn-primary">
				<a href=""""),_display_(/*40.15*/routes/*40.21*/.HomeController.foodsview()),format.raw/*40.48*/(""""><button class="btn btn-warning">Cancel</button>
				</a>
	  </div>
	</div>
	""")))}),format.raw/*44.3*/(""" """),format.raw/*44.4*/("""<!-- End Form definition -->

""")))}),format.raw/*46.2*/(""" """),format.raw/*46.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addFoodForm:play.data.Form[models.Food],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addFoodForm,user)

  def f:((play.data.Form[models.Food],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addFoodForm,user) => apply(addFoodForm,user)

  def ref: this.type = this

}


}
}

/**/
object addFood extends addFood_Scope0.addFood_Scope1.addFood
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 19:49:32 IST 2017
                  SOURCE: /home/wdd/Desktop/seconyearproject/app/views/addFood.scala.html
                  HASH: 011145dd4c78c5d478069a22cab7e594f5cdcdbd
                  MATRIX: 834->114|996->181|1028->286|1058->291|1088->313|1127->315|1157->318|1299->434|1405->530|1446->532|1480->539|1613->646|1712->724|1744->730|1839->804|1871->810|1972->890|2004->896|2101->972|2133->978|2227->1051|2259->1057|2362->1139|2394->1145|2583->1314|2617->1321|2704->1382|2793->1450|2826->1456|2987->1590|3002->1596|3050->1623|3163->1706|3191->1707|3254->1740|3282->1741
                  LINES: 30->5|35->5|37->7|39->9|39->9|39->9|40->10|44->14|44->14|44->14|46->16|52->22|52->22|53->23|53->23|54->24|54->24|55->25|55->25|56->26|56->26|57->27|57->27|58->28|62->32|64->34|65->35|65->35|67->37|70->40|70->40|70->40|74->44|74->44|76->46|76->46
                  -- GENERATED --
              */
          