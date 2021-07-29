package com.example.quantities

data class Length(val value: Double, val unit: Unit) {
    fun add(length: Length): Length {
        val convertedValue = length.to(unit).value
        return Length(convertedValue + this.value, Unit.Metre)
    }

    fun to(targetUnit: Unit) : Length = Length((value * unit.scale) / targetUnit.scale, targetUnit)

    override fun equals(other: Any?): Boolean {
        return (javaClass == other?.javaClass)
                && (value.roundTo3Decimals() == (other as Length).value.roundTo3Decimals())
    }

    override fun hashCode(): Int = value.roundTo3Decimals().hashCode()
}

enum class Unit(val scale: Int) {
    Metre (100),
    Centimetre (1)
}
