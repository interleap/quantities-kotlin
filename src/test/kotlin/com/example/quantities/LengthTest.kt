package com.example.quantities

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class LengthTest : StringSpec({
    "should be able to add to another length in metres" {
        val lengthInMetres = Length(4.0, Unit.Metre)
        lengthInMetres.add(Length(3.0, Unit.Metre)) shouldBe Length(7.0, Unit.Metre)
    }

    "should be able to add metres to centimetres" {
        val length1 = Length(3.0, Unit.Metre)
        val length2 = Length(50.0, Unit.Centimetre)
        length1.add(length2) shouldBe Length(3.50, Unit.Metre)
    }
})