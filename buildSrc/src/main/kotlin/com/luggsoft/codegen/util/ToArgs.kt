package com.luggsoft.codegen

internal fun IntRange.toArgs() = this.joinToString { i -> "p$i" }
