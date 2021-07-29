package com.example.quantities

data class Length(val value: Double) {
    fun add(length: Length): Length {
        return Length(length.value + this.value)
    }

    override fun equals(other: Any?): Boolean {
        if (javaClass != other?.javaClass) return false
        other as Length
        return (value.roundTo3Decimals() == (other.value).roundTo3Decimals())
    }

    override fun hashCode(): Int = value.roundTo3Decimals().hashCode()
}
