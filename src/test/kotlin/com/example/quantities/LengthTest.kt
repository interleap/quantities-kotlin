package com.example.quantities

import com.example.quantities.Unit.Centimetre
import com.example.quantities.Unit.Metre
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class LengthTest : StringSpec({
    "should be able to add to another length in metres" {
        val lengthInMetres = Length(4.0, Metre)
        lengthInMetres.add(Length(3.0, Metre)) shouldBe Length(7.0, Metre)
    }

    "should be able to add metres to centimetres" {
        val length1 = Length(3.0, Metre)
        val length2 = Length(50.0, Centimetre)
        length1.add(length2) shouldBe Length(3.50, Metre)
    }

    "should be able to convert metres to centimetres" {
        Length(3.3, Metre).to(Centimetre) shouldBe Length(330.0, Centimetre)
    }

    "should be able to convert centimetres to metres" {
        Length(550.0, Centimetre).to(Metre) shouldBe Length(5.50, Metre)
    }

})