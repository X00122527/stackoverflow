
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("home", user)/*2.20*/ {_display_(Seq[Any](format.raw/*2.22*/("""

    """),format.raw/*7.8*/("""
"""),format.raw/*8.1*/("""<div class="logo">
	<div class="container">

   

	
	
		
        </div>
</div>
<div class=feature>
	<div class="container">

	<h2>START TODAY!</h2>

	</div>
</div>

<div class="supporting">
      <div class="container">
        <div class="col">
          <h2>Eat</h2>
          <p>Musisz jesc wariac, bez jedzenie nie ma progresu a bez progresu nie ma cip.</p>
        </div>
        <div class="col">
          <h2>Lift</h2>
          <p>Dzwigaj jak dzwig z boba budowniczego a bedziesz wielki jak robert burneika</p>
        </div>
        <div class="col">
          <h2>Change</h2>
          <p>kto sie nie zmienia ten sie leni, a wiec zmieniaj sie i swiat hehe</p>
        </div>
        <div class="clearfix"></div>
      </div>
    </div>


<div class=feature2>
	<div class="container">

	<h2>JAKIS NAPIS LADNY TUTAJ</h2>

	</div>
</div>

""")))}),format.raw/*53.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 19:49:32 IST 2017
                  SOURCE: /home/wdd/Desktop/seconyearproject/app/views/index.scala.html
                  HASH: 65547a9a4627f6cbe1fbbc6caf764afea5ae87ce
                  MATRIX: 756->1|876->26|903->28|929->46|968->48|1000->177|1027->178|1905->1026
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->7|36->8|81->53
                  -- GENERATED --
              */
          