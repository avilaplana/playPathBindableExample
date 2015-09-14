import play.api.mvc.PathBindable
import uk.domain.DumyDomainA

package object uk {

  implicit val bindable = new PathBindable[DumyDomainA] {
    override def bind(key: String, value: String): Either[String, DumyDomainA] = {
      value match {
        case "alvaro" => Right(DumyDomainA("alvaro"))
        case _ => Left("this is a errror")
      }


    }
    override def unbind(key: String, user: DumyDomainA): String = {
      "perete"
    }
  }
}