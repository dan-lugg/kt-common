package com.luggsoft.common.text

fun CharSequence.normalizeLineSeparators(): CharSequence = this
    .toString()
    .replace("\r\n", "\n")
    .replace("\r", "\n")
