package com.example.quantities

import com.example.quantities.Unit.Centimetre
import com.example.quantities.Unit.Metre
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class LengthTest : StringSpec({
    "should be able to add to another length in metres" {
        Length(4.0, Metre).add(Length(3.0, Metre)) shouldBe Length(7.0, Metre)
    }

    "should be able to add metres to centimetres" {
        Length(3.0, Metre).add(Length(50.0, Centimetre)) shouldBe Length(3.50, Metre)
    }

    "should be able to convert metres to centimetres" {
        Length(3.3, Metre).to(Centimetre) shouldBe Length(330.0, Centimetre)
    }

    "should be able to convert centimetres to metres" {
        Length(550.0, Centimetre).to(Metre) shouldBe Length(5.50, Metre)
    }

    "should be able to add centimetres to metres" {
        Length(340.0, Centimetre).add(Length(0.60, Metre)) shouldBe Length(400.0, Centimetre)
    }

})