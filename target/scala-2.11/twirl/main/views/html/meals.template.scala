
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object meals_Scope0 {
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

class meals extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.User,List[models.Meal],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User, meals: List[models.Meal]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.53*/("""
"""),format.raw/*3.1*/("""

"""),_display_(/*5.2*/main("Meals", user)/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""




                                                """),format.raw/*10.49*/("""<!--  tutaj numer meala -->
    <button type="button" class="btn btn-default btn-lg">
        <a href=""""),_display_(/*12.19*/routes/*12.25*/.HomeController.generateDiet()),format.raw/*12.55*/("""">

            <span class="btn btn-primary" ></span></a></button>
                <input href=""""),_display_(/*15.31*/routes/*15.37*/.HomeController.generateDiet()),format.raw/*15.67*/("""" type="submit" value="Regenerate!" class="btn btn-primary" style="float: right">

                    <!--  <button type="button" class="btn" style="float: right">ADD POST</button>-->




   """),_display_(/*22.5*/for(m <- meals) yield /*22.20*/ {_display_(Seq[Any](format.raw/*22.22*/("""
        """),format.raw/*23.9*/("""<div id="meal">

            <h2> Meal """),_display_(/*25.24*/m/*25.25*/.getMealNo()),format.raw/*25.37*/("""</h2>

            <h3>time of the day: """),_display_(/*27.35*/m/*27.36*/.getTimeOfDay),format.raw/*27.49*/("""</h3>
            <p>  Total KCAL """),_display_(/*28.30*/m/*28.31*/.getTotalKcal()),format.raw/*28.46*/("""</p>


        </div>

   """)))}),format.raw/*33.5*/("""
    """),format.raw/*34.5*/("""<script>
            // JavaScript function returns true if user clicks yes, otherwise, false
            function confirmRegenerate() """),format.raw/*36.42*/("""{"""),format.raw/*36.43*/("""
                """),format.raw/*37.17*/("""return confirm('Are you sure?');
            """),format.raw/*38.13*/("""}"""),format.raw/*38.14*/("""
    """),format.raw/*39.5*/("""</script>
""")))}),format.raw/*40.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User,meals:List[models.Meal]): play.twirl.api.HtmlFormat.Appendable = apply(user,meals)

  def f:((models.users.User,List[models.Meal]) => play.twirl.api.HtmlFormat.Appendable) = (user,meals) => apply(user,meals)

  def ref: this.type = this

}


}

/**/
object meals extends meals_Scope0.meals
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 19:49:32 IST 2017
                  SOURCE: /home/wdd/Desktop/seconyearproject/app/views/meals.scala.html
                  HASH: 5f5f79df62840dd45b3350cee29ee694094b1c6a
                  MATRIX: 774->1|935->52|962->70|990->73|1017->92|1056->94|1137->147|1268->251|1283->257|1334->287|1459->385|1474->391|1525->421|1744->614|1775->629|1815->631|1851->640|1918->680|1928->681|1961->693|2029->734|2039->735|2073->748|2135->783|2145->784|2181->799|2238->826|2270->831|2433->966|2462->967|2507->984|2580->1029|2609->1030|2641->1035|2682->1046
                  LINES: 27->1|32->1|33->3|35->5|35->5|35->5|40->10|42->12|42->12|42->12|45->15|45->15|45->15|52->22|52->22|52->22|53->23|55->25|55->25|55->25|57->27|57->27|57->27|58->28|58->28|58->28|63->33|64->34|66->36|66->36|67->37|68->38|68->38|69->39|70->40
                  -- GENERATED --
              */
          