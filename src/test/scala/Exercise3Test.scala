import Exercise3._
import org.scalatest.FunSuite

class Exercise3Test extends FunSuite {
  test("test with default precision") {
    assert(15.4 ~= 15.45)
  }

  test("test with precision => 0.01") {
    //What if you need to use this opetator more than 10 times? Try to find the way to determine new precision only once
    assert(15.4.~=(12.45)(Precision(0.01)) == false)
  }
}

