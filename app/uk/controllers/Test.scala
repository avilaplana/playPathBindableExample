package uk.controllers

import play.api.mvc.{Action, Controller}
import uk.domain.DumyDomainA

object Test extends Controller {


  def index() = Action {
    Ok("this is index")
  }

  def test(dummy: DumyDomainA) = Action {
    Ok(s"this is a test ${dummy.name}")
  }
}