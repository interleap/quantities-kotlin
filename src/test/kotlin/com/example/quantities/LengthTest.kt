package com.example.quantities

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class LengthTest : StringSpec({
    "should be able to add to another length in metres" {
        val lengthInMetres = Length(4.0)
        lengthInMetres.add(Length(3.0)) shouldBe Length(7.0)
    }
})