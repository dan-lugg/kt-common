package com.luggsoft.common.text

fun CharSequence.columnIndexAt(index: Int): Int = this
    .substring(0, index)
    .substringAfterLast('\n')
    .length
