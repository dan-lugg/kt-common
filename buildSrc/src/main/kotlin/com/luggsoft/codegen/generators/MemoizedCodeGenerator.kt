package com.luggsoft.codegen.generators

import com.luggsoft.codegen.util.toArgs
import com.luggsoft.codegen.util.toParams
import com.luggsoft.codegen.util.toTypes

internal class MemoizedCodeGenerator(
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
        appendable.appendLine("import java.util.concurrent.ConcurrentHashMap")
        appendable.appendLine("import java.util.concurrent.ConcurrentMap")
        appendable.appendLine()
        (1..this.permutations).forEach { x ->
            appendable.appendLine("/**")
            appendable.appendLine(" * Represents a memoized function of signature [(${(1..x).toTypes()}) -> R].")
            appendable.appendLine(" *")
            appendable.appendLine(" * [https://en.wikipedia.org/wiki/Memoization]")
            appendable.appendLine(" *")
            appendable.appendLine(" * @see [Tuple$x]")
            appendable.appendLine(" *")
            appendable.appendLine(" * @property block The function to memoize.")
            appendable.appendLine(" * @property cache The function return value cache, with keys of type [Tuple$x] and values of type [R].")
            appendable.appendLine(" */")
            appendable.appendLine("data class Memoized$x<${(1..x).toTypes()}, out R>(")
            appendable.appendLine("    private val block: (${(1..x).toTypes()}) -> R,")
            appendable.appendLine("    private val cache: ConcurrentMap<Tuple$x<${(1..x).toTypes()}>, R> = ConcurrentHashMap(),")
            appendable.appendLine(") : (${(1..x).toTypes()}) -> R, Map<Tuple$x<${(1..x).toTypes()}>, R> by cache")
            appendable.appendLine("{")
            appendable.appendLine("    override fun invoke(${(1..x).toParams()}): R")
            appendable.appendLine("    {")
            appendable.appendLine("        val key = Tuple$x(${(1..x).toArgs()})")
            appendable.appendLine("        val provider = this.block.partial(${(1..x).toArgs()})")
            appendable.appendLine("        return this.cache.getOrPut(key, provider)")
            appendable.appendLine("    }")
            appendable.appendLine("}")
            appendable.appendLine()
            appendable.appendLine("/**")
            appendable.appendLine(" * Memoizes a function of signature [(${(1..x).toTypes()}) -> R].")
            appendable.appendLine(" *")
            appendable.appendLine(" * [https://en.wikipedia.org/wiki/Memoization]")
            appendable.appendLine(" *")
            appendable.appendLine(" * @param function The function to memoize.")
            appendable.appendLine(" * @return A memoized instance of [function]")
            appendable.appendLine(" */")
            appendable.appendLine("fun <${(1..x).toTypes()}, R> memoize(function: (${(1..x).toTypes()}) -> R): Memoized$x<${(1..x).toTypes()}, R> = Memoized$x(function)")
            appendable.appendLine()
        }
    }
}
