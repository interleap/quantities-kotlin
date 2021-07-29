package com.example.quantities

data class Metre(val value: Double) {
    fun add(metre: Metre): Metre {
        return Metre(metre.value + this.value)
    }

    override fun equals(other: Any?): Boolean {
        if (javaClass != other?.javaClass) return false
        other as Metre
        return (value.roundTo3Decimals() == (other.value).roundTo3Decimals())
    }

    override fun hashCode(): Int = value.roundTo3Decimals().hashCode()
}
