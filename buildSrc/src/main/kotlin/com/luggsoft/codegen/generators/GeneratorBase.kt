package com.luggsoft.codegen.generators

import java.io.File

internal abstract class GeneratorBase : Generator
{
    abstract val path: String

    abstract val permutations: Int

    final override fun generate()
    {
        try
        {
            val code = this.buildCode()
            val file = File(this.path)
            file.parentFile.mkdirs()
            file.writeText(code)
        }
        catch (exception: Exception)
        {
            println("Failed to generate code with $this, because $exception")
            throw exception
        }
    }

    protected abstract fun buildCode(): String
}
