import collection.mutable.Stack
import org.scalatest._

class DudeSpec extends FlatSpec with Matchers {

    "Dude" should "greet back to 'Hi'" in {
        val dude = new Dude
        dude.greet("Hi") should be ("Hey!")
    }

    it should "greet back to 'Hello'" in {
        val dude = new Dude
        dude.greet("Hello") should be ("Wazaaaa!")
    }
    
    it should "throw a punch in any other case" in (pending)

}
