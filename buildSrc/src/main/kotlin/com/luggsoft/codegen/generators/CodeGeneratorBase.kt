package com.luggsoft.codegen.generators

import java.io.File

internal abstract class CodeGeneratorBase : CodeGenerator
{
    abstract val path: String

    abstract val permutations: Int

    final override fun generateCode()
    {
        try
        {
            val file = File(this.path)
            file.parentFile.mkdirs()
            file.writer().use(this::generateCode)
        }
        catch (exception: Exception)
        {
            println("Failed to generate code with $this, because $exception")
            throw exception
        }
    }
}
