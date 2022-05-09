package com.luggsoft.codegen.util

internal fun Iterable<Int>.toTypes() = this.joinToString { i -> "T$i" }
