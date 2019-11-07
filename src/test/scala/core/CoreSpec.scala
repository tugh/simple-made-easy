package core

import org.scalacheck.Properties

class CoreSpec extends Properties("Core") {
  property("frequencies") = {
    frequencies(List(1, 2, 1)) == Map(1 -> 2, 2 -> 1)
  }

  property("mapcat") = {
    def plusOne: Int => Int = _ + 1
    mapcat(plusOne, List(1, 2, 3), List(0), List(123)) == Iterable(
      2,
      3,
      4,
      1,
      124
    )
  }
}
