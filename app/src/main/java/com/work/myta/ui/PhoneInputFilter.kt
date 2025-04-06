package com.work.myta.ui

fun String.filterWithMask(mask: String): String {
    val digits = filter(Char::isDigit)
    val maxLength = mask.count { it == '_' }
    return digits.take(maxLength)
}


fun String.checkMask(mask: String): Boolean {
    val digits = filter(Char::isDigit)
    val maxLength = mask.count { it == '_' }
    return digits.length == maxLength
}