package com.luggsoft.common.text

import java.nio.CharBuffer

/**
 * TODO
 */
class ReadableIterator(
    private val readable: Readable,
    private val bufferCapacity: Int = 4096,
) : Iterator<Char>
{
    private val charBuffer = CharBuffer.allocate(this.bufferCapacity)
    private var limit: Int = 0

    init
    {
        this.limit = this.readable.read(this.charBuffer)

        if (this.limit > 0)
        {
            this.charBuffer.limit(this.limit)
            this.charBuffer.rewind()
        }
    }

    override fun hasNext(): Boolean
    {
        if (this.limit > 0 && this.charBuffer.hasRemaining())
        {
            return true
        }

        this.charBuffer.clear()
        this.limit = this.readable.read(this.charBuffer)

        if (this.limit > 0)
        {
            this.charBuffer.limit(this.limit)
            this.charBuffer.rewind()
            return this.charBuffer.hasRemaining()
        }

        return false
    }

    override fun next(): Char = this.charBuffer.get()
}
