package com.luggsoft.codegen.generators

import com.luggsoft.codegen.toArgs
import com.luggsoft.codegen.toParams
import com.luggsoft.codegen.toTypes

internal class MemoizedGenerator(
    override val path: String,
    override val permutations: Int,
) : GeneratorBase()
{
    override fun buildCode() = buildString {
        appendLine("@file:Suppress(\"PackageDirectoryMismatch\")")
        appendLine()
        appendLine("package com.luggsoft.common")
        appendLine()
        appendLine("import java.util.concurrent.ConcurrentHashMap")
        appendLine("import java.util.concurrent.ConcurrentMap")
        appendLine()
        (1..this@MemoizedGenerator.permutations).forEach { x ->
            appendLine("/**")
            appendLine(" * Represents a memoized function of signature [(${(1..x).toTypes()}) -> R].")
            appendLine(" *")
            appendLine(" * [https://en.wikipedia.org/wiki/Memoization]")
            appendLine(" *")
            appendLine(" * @see [Tuple$x]")
            appendLine(" *")
            appendLine(" * @property block The function to memoize.")
            appendLine(" * @property cache The function return value cache, with keys of type [Tuple$x] and values of type [R].")
            appendLine(" */")
            appendLine("data class Memoized$x<${(1..x).toTypes()}, out R>(")
            appendLine("    private val block: (${(1..x).toTypes()}) -> R,")
            appendLine("    private val cache: ConcurrentMap<Tuple$x<${(1..x).toTypes()}>, R> = ConcurrentHashMap(),")
            appendLine(") : (${(1..x).toTypes()}) -> R, Map<Tuple$x<${(1..x).toTypes()}>, R> by cache")
            appendLine("{")
            appendLine("    override fun invoke(${(1..x).toParams()}): R")
            appendLine("    {")
            appendLine("        val key = Tuple$x(${(1..x).toArgs()})")
            appendLine("        val provider = this.block.partial(${(1..x).toArgs()})")
            appendLine("        return this.cache.getOrPut(key, provider)")
            appendLine("    }")
            appendLine("}")
            appendLine()
            appendLine("/**")
            appendLine(" * Memoizes a function of signature [(${(1..x).toTypes()}) -> R].")
            appendLine(" *")
            appendLine(" * [https://en.wikipedia.org/wiki/Memoization]")
            appendLine(" *")
            appendLine(" * @param function The function to memoize.")
            appendLine(" * @return A memoized instance of [function]")
            appendLine(" */")
            appendLine("fun <${(1..x).toTypes()}, R> memoize(function: (${(1..x).toTypes()}) -> R): Memoized$x<${(1..x).toTypes()}, R> = Memoized$x(function)")
            appendLine()
        }
    }
}
