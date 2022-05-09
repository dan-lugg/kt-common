package com.luggsoft.common.text

/**
 * Normalizes the [line separators][com.luggsoft.common.text.LineSeparator].
 */
fun CharSequence.normalizeLineSeparators(lineSeparator: LineSeparator): CharSequence = when (val currentLineSeparator = this.detectLineSeparator())
{
    LineSeparator.UNKNOWN -> this
    else -> this.toString().replace(
        oldValue = currentLineSeparator.charSequence.toString(),
        newValue = lineSeparator.charSequence.toString(),
    )
}
