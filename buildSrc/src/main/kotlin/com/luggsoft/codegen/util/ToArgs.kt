package com.luggsoft.codegen.util

internal fun Iterable<Int>.toArgs() = this.joinToString { i -> "p$i" }
