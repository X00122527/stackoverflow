
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newsfeed_Scope0 {
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

     object newsfeed_Scope1 {
import helper._

class newsfeed extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[Form[models.Post],Form[models.Comment],List[models.Post],List[models.Comment],models.users.User,models.Post,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(newPostForm: Form[models.Post], addCommentForm: Form[models.Comment], posts: List[models.Post], comments: List[models.Comment], user: models.users.User, post: models.Post, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.201*/("""
"""),_display_(/*3.2*/main("Newsfeed", user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""


"""),format.raw/*6.27*/("""


        """),format.raw/*9.9*/("""<div class="row" style="background-color: #ffffff">
            <div class="col-sm-6 col-centered" style="border: dashed">
            """),_display_(/*11.14*/form(action = routes.MemberController.addPostSubmit(), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*11.149*/ {_display_(Seq[Any](format.raw/*11.151*/("""
                """),format.raw/*12.17*/("""<label style="font-size: 1.5em">Create a post</label>
                """),_display_(/*13.18*/inputText(newPostForm("content"), '_label -> " ", 'class -> "form-control", 'placeholder -> "What's on your mind?")),format.raw/*13.133*/("""

                """),format.raw/*15.17*/("""<label>Image Upload</label>

                <input class="btn-sm btn-default" type="file" name="upload">


              """),format.raw/*20.104*/("""

                    """),format.raw/*22.21*/("""<!--  <button type="button" class="btn" style="float: right">ADD POST</button>-->
            </div>
            """)))}),format.raw/*24.14*/("""
        """),format.raw/*25.9*/("""</div>

        <br>


        """),_display_(/*30.10*/for(p <- posts) yield /*30.25*/ {_display_(Seq[Any](format.raw/*30.27*/("""
            """),format.raw/*31.13*/("""<div class="row well">
            <div class="col-sm-6 col-centered" style="">
                <div class="row">
                    <div>
                        <p><strong><span style="font-size: 1.5em">"""),_display_(/*35.68*/p/*35.69*/.getUser.getName),format.raw/*35.85*/(""" """),_display_(/*35.87*/p/*35.88*/.getUser.getSurname),format.raw/*35.107*/("""</span></strong>  <span style="float: right;">"""),_display_(/*35.154*/p/*35.155*/.getFormatDateTime()),format.raw/*35.175*/("""</span></p>
                        <p style="padding-left: 1em;">"""),_display_(/*36.56*/p/*36.57*/.getContent),format.raw/*36.68*/("""
                        """),format.raw/*37.25*/("""</p>

                        """),_display_(/*39.26*/if(env.resource("public/images/postImages/thumbnails/" + p.getId + ".jpg").isDefined)/*39.111*/ {_display_(Seq[Any](format.raw/*39.113*/("""
                            """),format.raw/*40.29*/("""<img style="box-shadow: 0.1em;" class="postimg" src="/assets/images/postImages/"""),_display_(/*40.109*/(p.getId)),format.raw/*40.118*/(""".jpg"/>

                        """)))}/*42.27*/else/*42.32*/{_display_(Seq[Any](format.raw/*42.33*/("""

                        """)))}),format.raw/*44.26*/("""
                    """),format.raw/*45.21*/("""</div>

                </div>

                    <!-- koniec rowa-->
                <div class="row">
                    <div>

                        <button type="button" class="btn btn-default btn-lg" style="float: left;">
                           <a href=""""),_display_(/*54.38*/routes/*54.44*/.MemberController.giveLike(p.getId)),format.raw/*54.79*/("""">

                        <span class="glyphicon glyphicon-thumbs-up" ></span></a></button>
                            <strong></strong><p id="likes" style="float: left; font-size: 2em;padding-left: 0.1em; font-family: open-sans">"""),_display_(/*57.141*/p/*57.142*/.getPlike.getLikeCount()),format.raw/*57.166*/("""</p></strong>
                        <hr style="border-color: rgba(0, 0, 0, 0.2); clear:both;">

                            """),_display_(/*60.30*/for(c <- comments) yield /*60.48*/ {_display_(Seq[Any](format.raw/*60.50*/("""
                                """),_display_(/*61.34*/if(c.getPost.getId == p.getId)/*61.64*/ {_display_(Seq[Any](format.raw/*61.66*/("""

                                    """),format.raw/*63.37*/("""<p><strong>"""),_display_(/*63.49*/c/*63.50*/.getUser.getName),format.raw/*63.66*/(""" """),_display_(/*63.68*/c/*63.69*/.getUser.getSurname),format.raw/*63.88*/(""" """),format.raw/*63.89*/("""commented:</strong></p>
                                    <p> """),_display_(/*64.42*/c/*64.43*/.getContent),format.raw/*64.54*/("""</p>
                                """)))}),format.raw/*65.34*/("""



                        """)))}),format.raw/*69.26*/("""
                            """),_display_(/*70.30*/form(action = routes.MemberController.addCommentSubmit(p.getId()), 'class -> "form-horizontal", 'role -> "form")/*70.142*/ {_display_(Seq[Any](format.raw/*70.144*/("""
                            """),_display_(/*71.30*/inputText(addCommentForm("content"), '_label -> " ", 'class -> "form-control", 'placeholder -> "Write a comment..")),format.raw/*71.145*/("""

                       """),format.raw/*73.115*/("""
                        """)))}),format.raw/*74.26*/("""

                    """),format.raw/*76.21*/("""</div>
                </div>

            </div>
            </div>
            """)))}),format.raw/*81.14*/("""


       """),format.raw/*84.19*/("""


    """),format.raw/*87.5*/("""<br>
    <br>




""")))}),format.raw/*93.2*/("""
"""))
      }
    }
  }

  def render(newPostForm:Form[models.Post],addCommentForm:Form[models.Comment],posts:List[models.Post],comments:List[models.Comment],user:models.users.User,post:models.Post,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(newPostForm,addCommentForm,posts,comments,user,post,env)

  def f:((Form[models.Post],Form[models.Comment],List[models.Post],List[models.Comment],models.users.User,models.Post,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (newPostForm,addCommentForm,posts,comments,user,post,env) => apply(newPostForm,addCommentForm,posts,comments,user,post,env)

  def ref: this.type = this

}


}
}

/**/
object newsfeed extends newsfeed_Scope0.newsfeed_Scope1.newsfeed
              /*
                  -- GENERATED --
                  DATE: Tue Apr 18 19:49:32 IST 2017
                  SOURCE: /home/wdd/Desktop/seconyearproject/app/views/newsfeed.scala.html
                  HASH: 9523c3138ac27f380cf768678b6b3f7356039ab5
                  MATRIX: 920->18|1215->217|1242->219|1272->241|1311->243|1341->272|1378->283|1541->419|1686->554|1727->556|1772->573|1870->644|2007->759|2053->777|2204->988|2254->1010|2399->1124|2435->1133|2494->1165|2525->1180|2565->1182|2606->1195|2840->1402|2850->1403|2887->1419|2916->1421|2926->1422|2967->1441|3042->1488|3053->1489|3095->1509|3189->1576|3199->1577|3231->1588|3284->1613|3342->1644|3437->1729|3478->1731|3535->1760|3643->1840|3674->1849|3727->1884|3740->1889|3779->1890|3837->1917|3886->1938|4182->2207|4197->2213|4253->2248|4515->2482|4526->2483|4572->2507|4726->2634|4760->2652|4800->2654|4861->2688|4900->2718|4940->2720|5006->2758|5045->2770|5055->2771|5092->2787|5121->2789|5131->2790|5171->2809|5200->2810|5292->2875|5302->2876|5334->2887|5403->2925|5463->2954|5520->2984|5642->3096|5683->3098|5740->3128|5877->3243|5931->3359|5988->3385|6038->3407|6151->3489|6189->3510|6223->3517|6272->3536
                  LINES: 30->2|35->2|36->3|36->3|36->3|39->6|42->9|44->11|44->11|44->11|45->12|46->13|46->13|48->15|53->20|55->22|57->24|58->25|63->30|63->30|63->30|64->31|68->35|68->35|68->35|68->35|68->35|68->35|68->35|68->35|68->35|69->36|69->36|69->36|70->37|72->39|72->39|72->39|73->40|73->40|73->40|75->42|75->42|75->42|77->44|78->45|87->54|87->54|87->54|90->57|90->57|90->57|93->60|93->60|93->60|94->61|94->61|94->61|96->63|96->63|96->63|96->63|96->63|96->63|96->63|96->63|97->64|97->64|97->64|98->65|102->69|103->70|103->70|103->70|104->71|104->71|106->73|107->74|109->76|114->81|117->84|120->87|126->93
                  -- GENERATED --
              */
          