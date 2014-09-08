import org.scalatest._

class SuperDuperSpec extends FlatSpec with Matchers {

  "Some code" should "execute with no problems whatsoever" in {
    val a = 1
    
    a should be ("1")
  }

}
