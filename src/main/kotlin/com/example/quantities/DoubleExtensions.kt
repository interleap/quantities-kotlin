package com.example.quantities

import kotlin.math.roundToLong

fun Double.roundTo3Decimals() = (this * 1000).roundToLong() / 1000
