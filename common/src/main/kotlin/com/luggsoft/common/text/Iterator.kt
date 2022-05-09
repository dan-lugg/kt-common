package com.luggsoft.common.text

/**
 * TODO
 */
fun Readable.iterator(): ReadableIterator = ReadableIterator(
    readable = this,
)
