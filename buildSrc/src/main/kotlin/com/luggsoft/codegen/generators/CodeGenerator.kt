package com.luggsoft.codegen.generators

internal interface CodeGenerator
{
    fun generateCode()

    fun generateCode(appendable: Appendable)
}
