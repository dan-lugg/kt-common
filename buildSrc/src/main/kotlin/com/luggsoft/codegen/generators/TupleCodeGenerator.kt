package com.luggsoft.codegen.generators

import com.luggsoft.codegen.util.toTypes

internal class TupleCodeGenerator(
    override val path: String,
    override val permutations: Int,
) : CodeGeneratorBase()
{
    override fun generateCode(appendable: Appendable)
    {
        appendable.appendLine("@file:Suppress(\"PackageDirectoryMismatch\")")
        appendable.appendLine()
        appendable.appendLine("package com.luggsoft.common")
        appendable.appendLine()
        (1..this.permutations).forEach { x ->
            appendable.appendLine("/**")
            appendable.appendLine(" * Represents a tuple of $x value(s).")
            appendable.appendLine(" *")
            appendable.appendLine(" * [https://en.wikipedia.org/wiki/Tuple]")
            appendable.appendLine(" */")
            appendable.appendLine("data class Tuple$x<${(1..x).toTypes()}>(")
            (1..x).forEach { y ->
                appendable.appendLine("    val p$y: T$y,")
            }
            appendable.appendLine(")")
            appendable.appendLine("{")
            if (x < this.permutations)
            {
                appendable.appendLine("    /**")
                appendable.appendLine("     * Returns a new [Tuple$x] with [value] as the last value.")
                appendable.appendLine("     *")
                appendable.appendLine("     * @param value The value to include in the new [Tuple$x]")
                appendable.appendLine("     */")
                appendable.appendLine("    operator fun <T> plus(value: T) = Tuple${x + 1}(${(1..x).joinToString { i -> "this.p$i" }}, value)")
                appendable.appendLine()
            }
            appendable.appendLine("    /**")
            appendable.appendLine("     * Returns the tuple value(s) as a list.")
            appendable.appendLine("     *")
            appendable.appendLine("     * @see [List]")
            appendable.appendLine("     */")
            appendable.appendLine("    fun toList() = listOf(${(1..x).joinToString { i -> "this.p$i" }})")
            appendable.appendLine("}")
            appendable.appendLine()
            appendable.appendLine("/**")
            appendable.appendLine(" * Invokes [this] with positional arguments from [Tuple$x].")
            appendable.appendLine(" */")
            appendable.appendLine("fun <${(1..x).toTypes()}, R> ((${(1..x).toTypes()}) -> R).invokeWithTuple(tuple$x: Tuple$x<${(1..x).toTypes()}>) = this.invoke(${(1..x).joinToString { i -> "tuple$x.p$i" }})")
            appendable.appendLine()
        }
    }
}
