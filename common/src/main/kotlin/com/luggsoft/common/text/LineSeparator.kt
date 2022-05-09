package com.luggsoft.common.text

/**
 * Represents a type of line separator.
 *
 * Typically, [CR] for MacOS Classic, [LF] for *nix OSes, and [CRLF] for Windows OSes.
 *
 * [UNKNOWN] is used to represent an unknown line separator (such as a single-line of text)
 */
enum class LineSeparator(val charSequence: CharSequence)
{
    /**
     * MacOS Classic line separator.
     */
    CR("\r"),

    /**
     * *nix OS line separator.
     */
    LF("\n"),

    /**
     * Windows OS line separator.
     */
    CRLF("\r\n"),

    /**
     * Unknown line separator.
     */
    UNKNOWN(""),
}
