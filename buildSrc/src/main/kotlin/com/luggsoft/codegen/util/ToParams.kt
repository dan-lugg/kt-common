package com.luggsoft.codegen.util

internal fun Iterable<Int>.toParams() = this.joinToString { i -> "p$i: T$i" }
