package com.luggsoft.common.text

import java.nio.CharBuffer

/**
 * TODO
 */
class ReadableIterator(
    private val readable: Readable,
) : Iterator<Char>
{
    private val charBuffer = CharBuffer.allocate(1)

    override fun hasNext(): Boolean
    {
        this.charBuffer.clear()
        return this.readable.read(this.charBuffer) >= 0
    }

    override fun next(): Char = this.charBuffer.get(0)
}
