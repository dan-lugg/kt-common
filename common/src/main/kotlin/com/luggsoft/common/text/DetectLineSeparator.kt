package com.luggsoft.common.text

import java.io.File
import java.io.InputStream
import java.nio.charset.Charset

/**
 * Attempts to detect the [line separator][LineSeparator].
 */
@Suppress("NAME_SHADOWING")
fun Iterator<Char>.detectLineSeparator(): LineSeparator
{
    while (this.hasNext())
    {
        val char = this.next()

        if (char == '\n')
        {
            return LineSeparator.LF
        }

        if (char == '\r')
        {
            if (this.hasNext())
            {
                val char = this.next()

                if (char == '\n')
                {
                    return LineSeparator.CRLF
                }
            }

            return LineSeparator.CR
        }
    }

    return LineSeparator.UNKNOWN
}

/**
 * Attempts to detect the [line separator][LineSeparator].
 */
fun CharSequence.detectLineSeparator(): LineSeparator = this.iterator().detectLineSeparator()

/**
 * Attempts to detect the [line separator][LineSeparator].
 */
fun Readable.detectLineSeparator(): LineSeparator = this.iterator().detectLineSeparator()

/**
 * Attempts to detect the [line separator][LineSeparator].
 */
fun File.detectLineSeparator(charset: Charset = Charsets.UTF_8): LineSeparator = this.reader(charset).detectLineSeparator()

/**
 * Attempts to detect the [line separator][LineSeparator].
 */
fun InputStream.detectLineSeparator(charset: Charset = Charsets.UTF_8): LineSeparator = this.reader(charset).detectLineSeparator()
