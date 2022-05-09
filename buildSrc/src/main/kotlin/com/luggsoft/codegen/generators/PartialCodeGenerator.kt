package com.luggsoft.codegen.generators

import com.luggsoft.codegen.util.toArgs
import com.luggsoft.codegen.util.toParams
import com.luggsoft.codegen.util.toTypes

internal class PartialCodeGenerator(
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
            (1..x).forEach { y ->
                appendable.appendLine("")
                appendable.appendLine("/**")
                appendable.appendLine(" * Creates a partial function bound to parameter(s) ${(1..y).joinToString { i -> "[p$i]" }}.")
                if (y + 1 <= x)
                {
                    appendable.appendLine(" * The resulting function accepts parameter(s) of type(s) ${((y + 1)..x).joinToString { i -> "[T$i]" }}.")
                }
                appendable.appendLine(" * The resulting function returns [R].")
                appendable.appendLine(" *")
                appendable.appendLine(" * [https://en.wikipedia.org/wiki/Partial_function]")
                appendable.appendLine(" */")
                appendable.appendLine("fun <${(1..x).toTypes()}, R> ((${(1..x).toTypes()}) -> R).partial(${(1..y).toParams()}) = { ${((y + 1)..x).toParams()} -> this.invoke(${(1..x).toArgs()}) }")
                appendable.appendLine()
            }
        }
    }
}
