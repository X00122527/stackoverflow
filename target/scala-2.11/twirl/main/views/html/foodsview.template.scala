
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object foodsview_Scope0 {
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

     object foodsview_Scope1 {
import helper._

class foodsview extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.data.Form[models.Food],List[models.Food],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(addFoodForm: play.data.Form[models.Food], foods: List[models.Food], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.95*/("""
"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Foods", user)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
    <div class="well">

          <div class="col-sm-10">

              """),_display_(/*10.16*/if(flash.containsKey("success"))/*10.48*/ {_display_(Seq[Any](format.raw/*10.50*/("""
                  """),format.raw/*11.19*/("""<div class="alert alert-success">
                  """),_display_(/*12.20*/flash/*12.25*/.get("success")),format.raw/*12.40*/("""
                  """),format.raw/*13.19*/("""</div>
              """)))}),format.raw/*14.16*/("""
              """),format.raw/*15.15*/("""<table class="table table-bordered table-hover table-condensed">
              <thead>
              <!-- The header row-->
              <tr>
                <th>ID</th>
                <th>Main</th>
                <th>Name</th>
                <th>Kcal</th>
                <th>Protein</th>
                <th>Carbs</th>
                  <th>Fats</th>
                  <th>Suitable</th>
                  <th>/100g</th>
              </tr>
              </thead>
              <tbody>

                <!-- Movie row(s) -->
                        <!-- Start of For loop - For each m in movies add a row -->

              """),_display_(/*35.16*/for(f <- foods) yield /*35.31*/ {_display_(Seq[Any](format.raw/*35.33*/("""

                  """),format.raw/*37.19*/("""<tr>
                      <td>"""),_display_(/*38.28*/f/*38.29*/.getFoodId),format.raw/*38.39*/("""</td>
                      <td>"""),_display_(/*39.28*/f/*39.29*/.getMainMacro),format.raw/*39.42*/("""</td>
                      <td>"""),_display_(/*40.28*/f/*40.29*/.getFoodName),format.raw/*40.41*/("""</td>
                      <td>"""),_display_(/*41.28*/f/*41.29*/.getKcal),format.raw/*41.37*/("""</td>
                      <td>"""),_display_(/*42.28*/f/*42.29*/.getProtein),format.raw/*42.40*/("""</td>
                      <td>"""),_display_(/*43.28*/f/*43.29*/.getCarbs),format.raw/*43.38*/("""</td>
                      <td>"""),_display_(/*44.28*/f/*44.29*/.getFat),format.raw/*44.36*/("""</td>
                      <td>"""),_display_(/*45.28*/f/*45.29*/.getSuitable),format.raw/*45.41*/("""</td>
                      <td>
                          <a href=""""),_display_(/*47.37*/routes/*47.43*/.HomeController.deleteFood(f.getFoodId)),format.raw/*47.82*/(""""
                          onclick="return confirmDel();">
                              <span class="glyphicon glyphicon-trash"></span>
                          </a>
                      </td>
                  </tr>


                  """)))}),format.raw/*55.20*/(""" """),format.raw/*55.21*/("""<!-- End of For loop -->
              </tbody>
            </table>

              <a href=""""),_display_(/*59.25*/routes/*59.31*/.HomeController.addFood()),format.raw/*59.56*/("""">
                  <button class="btn btn-primary">Add new food</button>
              </a>
          </div>
      </div>

    <script>
            // JavaScript function returns true if user clicks yes, otherwise, false
            function confirmDel() """),format.raw/*67.35*/("""{"""),format.raw/*67.36*/("""
                """),format.raw/*68.17*/("""return confirm('Are you sure?');
            """),format.raw/*69.13*/("""}"""),format.raw/*69.14*/("""
    """),format.raw/*70.5*/("""</script>
  <!-- End of content for main -->

""")))}),format.raw/*73.2*/("""
"""))
      }
    }
  }

  def render(addFoodForm:play.data.Form[models.Food],foods:List[models.Food],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addFoodForm,foods,user)

  def f:((play.data.Form[models.Food],List[models.Food],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addFoodForm,foods,user) => apply(addFoodForm,foods,user)

  def ref: this.type = this

}


}
}

/**/
object foodsview extends foodsview_Scope0.foodsview_Scope1.foodsview
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 19:49:31 IST 2017
                  SOURCE: /home/wdd/Desktop/seconyearproject/app/views/foodsview.scala.html
                  HASH: 8428eb491c43f136bd9d28a3f8e22d5dde574958
                  MATRIX: 858->18|1046->111|1073->112|1133->145|1161->146|1207->165|1235->166|1263->167|1310->189|1337->208|1376->210|1405->213|1547->328|1588->360|1628->362|1675->381|1755->434|1769->439|1805->454|1852->473|1905->495|1948->510|2605->1140|2636->1155|2676->1157|2724->1177|2783->1209|2793->1210|2824->1220|2884->1253|2894->1254|2928->1267|2988->1300|2998->1301|3031->1313|3091->1346|3101->1347|3130->1355|3190->1388|3200->1389|3232->1400|3292->1433|3302->1434|3332->1443|3392->1476|3402->1477|3430->1484|3490->1517|3500->1518|3533->1530|3629->1599|3644->1605|3704->1644|3977->1886|4006->1887|4127->1981|4142->1987|4188->2012|4473->2269|4502->2270|4547->2287|4620->2332|4649->2333|4681->2338|4758->2385
                  LINES: 30->2|35->2|36->3|36->3|36->3|36->3|36->3|36->3|37->4|37->4|37->4|38->5|43->10|43->10|43->10|44->11|45->12|45->12|45->12|46->13|47->14|48->15|68->35|68->35|68->35|70->37|71->38|71->38|71->38|72->39|72->39|72->39|73->40|73->40|73->40|74->41|74->41|74->41|75->42|75->42|75->42|76->43|76->43|76->43|77->44|77->44|77->44|78->45|78->45|78->45|80->47|80->47|80->47|88->55|88->55|92->59|92->59|92->59|100->67|100->67|101->68|102->69|102->69|103->70|106->73
                  -- GENERATED --
              */
          