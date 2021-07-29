package com.example.quantities

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MetreTest : StringSpec({
    "should be able to add to another length in metres" {
        val lengthInMetres = Metre(4.0)
        lengthInMetres.add(Metre(3.0)) shouldBe Metre(7.0)
    }
})