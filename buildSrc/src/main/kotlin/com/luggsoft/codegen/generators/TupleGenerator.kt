package com.luggsoft.codegen.generators

import com.luggsoft.codegen.toTypes

internal class TupleGenerator(
    override val path: String,
    override val permutations: Int,
) : GeneratorBase()
{
    override fun buildCode() = buildString {
        appendLine("@file:Suppress(\"PackageDirectoryMismatch\")")
        appendLine()
        appendLine("package com.luggsoft.common")
        appendLine()
        (1..this@TupleGenerator.permutations).forEach { x ->
            appendLine("/**")
            appendLine(" * Represents a tuple of $x value(s).")
            appendLine(" *")
            appendLine(" * [https://en.wikipedia.org/wiki/Tuple]")
            appendLine(" */")
            appendLine("data class Tuple$x<${(1..x).toTypes()}>(")
            (1..x).forEach { y ->
                appendLine("    val p$y: T$y,")
            }
            appendLine(")")
            appendLine("{")
            if (x < this@TupleGenerator.permutations)
            {
                appendLine("    /**")
                appendLine("     * Returns a new [Tuple$x] with [value] as the last value.")
                appendLine("     *")
                appendLine("     * @param value The value to include in the new [Tuple$x]")
                appendLine("     */")
                appendLine("    operator fun <T> plus(value: T) = Tuple${x + 1}(${(1..x).joinToString { i -> "this.p$i" }}, value)")
                appendLine()
            }
            appendLine("    /**")
            appendLine("     * Returns the tuple value(s) as a list.")
            appendLine("     *")
            appendLine("     * @see [List]")
            appendLine("     */")
            appendLine("    fun toList() = listOf(${(1..x).joinToString { i -> "this.p$i" }})")
            appendLine("}")
            appendLine()
            appendLine("/**")
            appendLine(" * Invokes [this] with positional arguments from [Tuple$x].")
            appendLine(" */")
            appendLine("fun <${(1..x).toTypes()}, R> ((${(1..x).toTypes()}) -> R).invokeWithTuple(tuple$x: Tuple$x<${(1..x).toTypes()}>) = this.invoke(${(1..x).joinToString { i -> "tuple$x.p$i" }})")
            appendLine()
        }
    }
}
