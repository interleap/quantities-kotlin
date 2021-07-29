package com.example.quantities

data class Length(val value: Double, val unit: Unit) {
    fun add(length: Length): Length {
        val convertedValue = when (length.unit) {
            Unit.Centimetre -> (length.value / 100.0)
            else -> length.value
        }
        return Length(convertedValue + this.value, Unit.Metre)
    }

    override fun equals(other: Any?): Boolean {
        if (javaClass != other?.javaClass) return false
        other as Length
        return (value.roundTo3Decimals() == (other.value).roundTo3Decimals())
    }

    override fun hashCode(): Int = value.roundTo3Decimals().hashCode()
}

enum class Unit {
    Metre, Centimetre
}
