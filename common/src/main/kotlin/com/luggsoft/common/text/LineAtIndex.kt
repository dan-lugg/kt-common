package com.luggsoft.common.text

import com.luggsoft.common.partial

private val charIsNewline = Char::equals.partial('\n')

fun CharSequence.lineIndexAt(index: Int): Int = this
    .substring(0, index)
    .count(charIsNewline)
