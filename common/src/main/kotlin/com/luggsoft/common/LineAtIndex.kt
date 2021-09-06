package com.luggsoft.common

fun CharSequence.lineNumberAtIndex(index: Int): Int
{
    val zeroBasedRow = this
        .substring(0, index)
        .count(Char::equals.partial('\n'))
    return zeroBasedRow + 1
}

