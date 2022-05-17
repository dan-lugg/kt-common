package com.luggsoft.common.text

/**
 * Escapes all [characters][kotlin.Char] in the [character sequence][kotlin.CharSequence] to be used in a valid Kotlin [String][kotlin.String] literal.
 */
internal fun CharSequence.kotlinEscape(): String
{
    val escapedStringBuilder = StringBuilder()

    for (char in this)
    {
        val escapedChar = char.kotlinEscape()
        escapedStringBuilder.append(escapedChar)
    }

    return escapedStringBuilder.toString()
}

/**
 * Escapes the [character][kotlin.Char] to be used in a valid Kotlin [String][kotlin.String] literal.
 */
internal fun Char.kotlinEscape(): String = when
{
    this == '\b' -> "\\b"
    this == '\t' -> "\\t"
    this == '\n' -> "\\n"
    this == '\r' -> "\\r"
    this == '\"' -> "\\\""
    this == '\$' -> "\\\$"
    this == '\\' -> "\\\\"
    this.isISOControl() -> String.format("\\u%04x", this.toInt())
    else -> this.toString()
}
