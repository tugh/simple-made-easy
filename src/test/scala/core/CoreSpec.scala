package core

import org.scalacheck.Properties

class CoreSpec extends Properties("Core") {
  property("frequencies") = {
    frequencies(List(1, 2, 1)) == Map(1 -> 2, 2 -> 1)
  }
}
