package com.luggsoft.codegen.generators

import com.luggsoft.codegen.toArgs
import com.luggsoft.codegen.toParams
import com.luggsoft.codegen.toTypes

internal class PartialGenerator(
    override val path: String,
    override val permutations: Int,
) : GeneratorBase()
{
    override fun buildCode() = buildString {
        appendLine("@file:Suppress(\"PackageDirectoryMismatch\")")
        appendLine()
        appendLine("package com.luggsoft.common")
        appendLine()
        (1..this@PartialGenerator.permutations).forEach { x ->
            (1..x).forEach { y ->
                appendLine("")
                appendLine("/**")
                appendLine(" * Creates a partial function bound to parameter(s) ${(1..y).joinToString { i -> "[p$i]" }}.")
                if (y + 1 <= x)
                {
                    appendLine(" * The resulting function accepts parameter(s) of type(s) ${((y + 1)..x).joinToString { i -> "[T$i]" }}.")
                }
                appendLine(" * The resulting function returns [R].")
                appendLine(" *")
                appendLine(" * [https://en.wikipedia.org/wiki/Partial_function]")
                appendLine(" */")
                appendLine("fun <${(1..x).toTypes()}, R> ((${(1..x).toTypes()}) -> R).partial(${(1..y).toParams()}) = { ${((y + 1)..x).toParams()} -> this.invoke(${(1..x).toArgs()}) }")
                appendLine()
            }
        }
    }
}
