package uk.co.logiccache

import io.kotlintest.matchers.startWith
import io.kotlintest.should
import io.kotlintest.shouldBe
import io.kotlintest.shouldThrow
import io.kotlintest.specs.StringSpec

class KataTest : StringSpec({
    "empty string should throw exception" {
        val exception = shouldThrow<IllegalStateException> {
            getMiddle("")
        }
        exception.message should startWith("input must contain at least one character")
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
    "'martha' returns 'rt'" {
        getMiddle("martha") shouldBe "rt"
    }
})