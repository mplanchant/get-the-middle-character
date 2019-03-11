package uk.co.logiccache

import io.kotlintest.shouldBe
import io.kotlintest.shouldThrow
import io.kotlintest.specs.StringSpec

class KataTest : StringSpec({
    "empty string should throw exception" {
        shouldThrow<AssertionError> {
            getMiddle("")
        }
    }
    "single character returns that character" {
        getMiddle("a") shouldBe "a"
    }
    "'mam' returns 'a'" {
        getMiddle("mam") shouldBe "a"
    }
    "'gruff' returns 'u'" {
        getMiddle("gruff") shouldBe "u"
    }
})